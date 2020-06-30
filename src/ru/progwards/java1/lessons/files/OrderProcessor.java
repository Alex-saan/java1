package ru.progwards.java1.lessons.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class OrderProcessor {
    String strartPath;
    List<Order> listIn = new ArrayList<>();
    int count = 0;

    public OrderProcessor(String startPath) {
        this.strartPath = startPath;
    }

    public int loadOrders(LocalDate start, LocalDate finish, String shopId) {
        String z = shopId == null ? "???" : shopId;
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/" + z + "-??????-????.csv");
        Path dir = Paths.get(strartPath);
        try {
            Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (pathMatcher.matches(path)) {
                        LocalDate localDate = null;
                        try {
                            localDate = LocalDateTime.ofInstant(Files.getLastModifiedTime(path).toInstant(), ZoneId.systemDefault()).toLocalDate();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (localDate.isAfter(start) && localDate.isBefore(finish)) {
                            try {
                                List<String> listTmp = new ArrayList<>(Files.readAllLines(path));
                                List<OrderItem> items = new ArrayList<>();
                                Double sumItem = 0.0;
                                for (String s : listTmp) {
                                    String[] item = s.split(",");
                                    if (item.length != 3) {
                                        count++;
                                        break;
                                    }
                                    OrderItem orderItem = new OrderItem();
                                    orderItem.goodsName = item[0].trim();
                                    orderItem.count = Integer.parseInt(item[1].trim());
                                    orderItem.price = Double.parseDouble(item[2].trim());
                                    sumItem += orderItem.count * orderItem.price;
                                    items.add(orderItem);

                                }

                                Order order = new Order();
                                String[] nameSplit = String.valueOf(path.getFileName()).split("-");
                                order.sum = sumItem;
                                order.orderId = nameSplit[1];
                                order.customerId = nameSplit[2];
                                order.shopId = nameSplit[0];
                                order.items = items;

                                try {
                                    order.dateTime = LocalDateTime.ofInstant(Files.getLastModifiedTime(path).toInstant(), ZoneId.systemDefault());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                listIn.add(order);

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException e) {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Order> process(String shopId) {
        List<Order> result = new ArrayList();
        for (Order o : listIn) {
            if (shopId == null || o.shopId == shopId) {
                result.add(o);
            }

        }
        Collections.sort(result, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.dateTime.compareTo(o2.dateTime);
            }
        });
        System.out.println(result);
        return result;
    }

    public Map<String, Double> statisticsByShop() {
        Map<String, Double> map = new TreeMap<>();
        for (Order o : listIn) {
            double summa = map.containsKey(o.shopId) ? map.get(o.shopId) : 0;
            map.put(o.shopId, o.sum + summa);
        }
        return map;
    }

    public Map<String, Double> statisticsByGoods() {
        Map<String, Double> map = new TreeMap<>();
        for (Order o : listIn) {
            for (OrderItem oI : o.items) {
                double summa = map.containsKey(oI.goodsName) ? map.get(oI.goodsName) : 0;
                map.put(oI.goodsName, oI.price * oI.count + summa);
            }
        }
        return map;
    }
    public Map<LocalDate, Double> statisticsByDay(){
        Map<LocalDate, Double> map = new TreeMap<>();
        for (Order o : listIn) {
            double summa = map.containsKey(o.dateTime.toLocalDate()) ? map.get(o.dateTime.toLocalDate()) : 0;
            map.put(o.dateTime.toLocalDate(), o.sum + summa);
        }
        return map;
    }

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor("C:\\Users\\user\\IdeaProjects\\ProgWards\\src\\ru\\progwards\\java1\\lessons\\files\\S02-P01X12-0012.csv");
        orderProcessor.loadOrders(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 10, 10), "S02");
        //orderProcessor.statisticsByShop();
        //orderProcessor.statisticsByGoods();
        //orderProcessor.process("S02");
    }
}
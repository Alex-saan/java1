package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product> products;

    public ProductAnalytics(List<Product> products, List<Shop> shops) {
        this.products = products;
        this.shops = shops;
    }

    //товары из products, которые имеются во всех магазинах
    public Set<Product> existInAll() {
        HashSet res = new HashSet(products);
        for (Product p : products) {
            for (Shop s : shops) {
                if (!s.getProducts().contains(p)) {
                    res.remove(p);
                    break;
                }
            }
        }
        return res;
    }

    //товары из products, которые имеются хотя бы в одном магазине
    public Set<Product> existAtListInOne() {
        HashSet res = new HashSet();
        for (Product p : products) {
            for (Shop s : shops) {
                if (s.getProducts().contains(p)) {
                    res.add(p);
                    break;
                }
            }
        }
        return res;
    }

    //товары из products, которых нет ни в одном магазине
    public Set<Product> notExistInShops() {
        HashSet res = new HashSet(products);
        for (Product p : products) {
            for (Shop s : shops) {
                if (s.getProducts().contains(p)) {
                    res.remove(p);
                    break;
                }
            }
        }
        return res;
    }

    //товары из products, которые есть только в одном магазине
    public Set<Product> existOnlyInOne() {
        int n = 0;
        HashSet<Product> result = new HashSet<>();
        for (Product p : products) {
            for (Shop s : shops) {
                if (s.getProducts().contains(p)) {
                    n++;
                }
                if (n > 1) {
                    n = 0;
                    break;
                }
            }
            if (n == 1) {
                result.add(p);
                n = 0;
            }
        }
        return result;
    }
}
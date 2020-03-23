package ru.progwards.java1.lessons.io2;

public class PhoneNumber {

    public static String format(String phone) throws Exception {
        String y = "";
        StringBuilder sb = new StringBuilder();
        for (char x : phone.toCharArray()) {
            if (Character.isDigit(x)) {
                y += x;
            }
        }
        if ((y.length()) < 10 || (y.length()) > 11) {
            throw new Exception("Не является номером телефона");
        }
        sb.append(y);
        if (y.length() == 10) {
            sb.insert(0, "+7").insert(2, "(").insert(6, ")").insert(10, "-");
        } else {
            sb.deleteCharAt(0).insert(0, "+7").insert(2, "(").insert(6, ")").insert(10, "-");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(format("89212909215"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
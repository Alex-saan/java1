package ru.progwards.alex;

public class Add {
    public static void main(String[] args) {
//int n1 = 1;
        //int n2 = 2;
        System.out.println(textGrade(41));

    }

    static String textGrade(int grade) {
        if (grade == 0) {
            return "не оценено";
        } else if (1 <= grade && grade <= 20) {
            return "очень плохо";
        } else if (21 <= grade && grade <= 40) {
            return "плохо";
        } else if (41 <= grade && grade <= 60) {
            return "удовлетворительно";
        } else if (61 <= grade && grade <= 80) {
            return "хорошо";
        } else if (81 <= grade && grade <= 100) {
            return "отлично";
        } else {
            return "не определено";
        }
    }
}

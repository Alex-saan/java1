package ru.progwards.alex;

public class GradeEnum {


    enum Grade {
        VERYBAD,
        BAD,
        SATISFACTORILY,
        GOOD,
        EXCELLENT,
        NOTDEFINED
    }

    static Grade intToGrade(int grade) {
        switch (grade) {
            case (1):
                return Grade.VERYBAD;
            case (2):
                return Grade.BAD;
            case (3):
                return Grade.SATISFACTORILY;
            case (4):
                return Grade.GOOD;
            case (5):
                return Grade.EXCELLENT;
            default:
                return Grade.NOTDEFINED;
        }
    }
}

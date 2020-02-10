package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public abstract class AbsInteger {
    BigInteger num;

    public AbsInteger() {
        this.num = num;
    }

    @Override
    public String toString() {
        return null;
    }

    public int method() {
        return 0;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int p = num1.method() + num2.method();
        if (p <= Byte.MAX_VALUE && p >= Byte.MIN_VALUE) {
            return new ByteInteger((byte) p);
        }
        if (p <= Short.MAX_VALUE && p >= Short.MIN_VALUE) {
            return new ShortInteger((short) p);
        }
        if (p <= Integer.MAX_VALUE && p >= Integer.MIN_VALUE) {
            return new IntInteger(p);
        }
        return null;
    }
}

class ByteInteger extends AbsInteger {
    byte num;

    public ByteInteger(byte num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Byte.toString(num);
    }

    @Override
    public int method() {
        return num;
    }
}


class ShortInteger extends AbsInteger {
    short num;

    public ShortInteger(short num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Short.toString(num);
    }

    @Override
    public int method() {
        return num;
    }

}

class IntInteger extends AbsInteger {
    int num;

    public IntInteger(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }

    @Override
    public int method() {
        return num;
    }
}


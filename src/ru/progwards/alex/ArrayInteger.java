package ru.progwards.alex;

import java.math.BigInteger;
import java.util.Arrays;


public class ArrayInteger {
    byte[] digits;

    //    инициализирует класс, с максимальной точностью n цифр (размер массива)
    ArrayInteger(int n) {
        digits = new byte[n];
    }

    //    установить свое значение, взяв его из value (уложить BigInteger во внутренний массив)
    void fromInt(BigInteger value) {
        if (value.toString().length() > this.digits.length) {
            this.digits = new byte[value.toString().length()];
        }
        for (int i = 0; i < this.digits.length; i++) {
            this.digits[i] = value.mod(BigInteger.TEN).byteValue();
            value = value.divide(BigInteger.TEN);
        }
    }

    //    привести свое значение к BigInteger (преобразовать из массива в BigInteger)
    BigInteger toInt() {
        int i = 0;
        BigInteger value = BigInteger.ZERO;
        while (i < this.digits.length) {
            value = value.add(BigInteger.valueOf(this.digits[i]).multiply(BigInteger.TEN.pow(i)));
            i++;
        }
        return value;
    }

    //сложить 2 числа, не используя BigInteger, а  используя массив digits, результат поместить в экземпляр ArrayInteger,
// у которого был вызван метод. При переполнении вернуть false, при этом само число сбросить в 0
    boolean add(ArrayInteger num) {
        if (num.digits.length > this.digits.length) {
            Arrays.fill(this.digits, (byte) 0);
            return false;
        }
        byte num10 = 0;
        for (int i = 0; i < this.digits.length; i++) {
            byte perMen;
            if (i < num.digits.length) {
                perMen = (byte) (((this.digits[i] + num.digits[i]) % 10) + num10);
                num10 = (byte) ((this.digits[i] + num.digits[i]) / 10);
                this.digits[i] = perMen;
            } else {
                if (num10 > 0) {
                    perMen = (byte) ((this.digits[i] + num10) % 10);
                    num10 = (byte) (this.digits[i] / 10);
                    this.digits[i] = perMen;
                    break;
                }
            }
        }
        if (num10 > 0) {
            Arrays.fill(this.digits, (byte) 0);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger ai1 = new ArrayInteger(7);
        ai1.fromInt(new BigInteger("6606396"));
        ArrayInteger ai2 = new ArrayInteger(5);
        ai2.fromInt(new BigInteger("30700"));
        System.out.println(ai1.add(ai2));
    }
}


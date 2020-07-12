package ru.progwards.alex;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000000];

        System.out.println("Всего памяти: " + r.totalMemory());
        mem1 = r.freeMemory();

        System.out.println("Свободной памяти исходно: " + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Свободной памяти после очистки: " + mem1);
        for (int i = 0; i < 1000000; i++) {
            someints[i] = (i);

            mem2 = r.freeMemory();
            System.out.println("Свободной памяти после выделения: " + mem2);
            System.out.println("Использовано памяти для выделения: " + (mem1 - mem2));

            for (int j = 0; j < 1000000; j++) {
                someints[i] = null;
            }

            r.gc();
            mem2 = r.freeMemory();
            System.out.println("Свободной памяти после очистки: " + mem2);
            break;
        }
    }
}
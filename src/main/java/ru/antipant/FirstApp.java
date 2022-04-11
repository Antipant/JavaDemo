package ru.antipant;

public class FirstApp {

    public static void main(String[] args) {
        // примитивные типы данных
        char symbol, anotherSymbol;
        symbol = 'w';
        System.out.println(symbol);
        boolean flag = false;

        byte aByte = 127; // -128 ... 127  // 123 - литерал
        short aShort = 32760; // -32768 ... 32767
        int aInt = 1921319991; // 2 XXX XXX XXX
        long aLong = 123L;

        float aFloat = 1.2F;
        double aDouble = 1.2D;

        // ссылочные типы данных, по умолчанию null
        String aString = "Hello, qa.guru!"; // "Hello, qa.guru!" - строковый литерал
        String aString0 = new String("Hello, qa.guru!");
        Integer boxed = 1;

        char[][] array = new char[][]{{'w', 'a', 's'}};
        //

        // + сложение
        // - вычитание
        // * умножение
        // / деление (целочисленное!)
        // % взятие остатка от деления


        // логические операторы
        // & и (&&) если первое выполняется, то второе даже не смотрит
        // | или (||)
        // ! Отричание
        // != не равно
        // == равно
        // instanceof является ли он объектом нужного типа данных
        // > больше
        // >= больше или равно
        // < меньше
        // <= меньше или равно

        int maxValue = getMaxIntNumber();
        System.out.println("max value: " + maxValue);
        System.out.println(summ(aFloat, aDouble));
        System.out.println(mult(aFloat,aDouble));
        System.out.println(div(aLong,aDouble));
        System.out.println(sub(aInt,aShort));
        System.out.println(mod(aInt,aByte));


        // тернарный оператор
        aString = aInt > aByte ? "Dima" : "Alex";
        System.out.println(aString);
        if (aInt > aByte) {
            aString = "Dima";
        } else {
            aString = "Alex";
        }
        System.out.println(aString);
        over();
    }
    static int getMaxIntNumber() {
        return Integer.MAX_VALUE;
    }
    static double summ(double first, double second) {
        return first + second;
    }
    static double mult(double first, double second) {
        return first * second;
    }
    static double sub(double first, double second) {
        return first - second;
    }
    static double div(double first, double second) {
        return first / second;
    }
    static double mod(double first, double second) {
        return first % second;
    }
    static void over() {
        byte val = 1;
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        byte outMaxByte = (byte) (val + max);
        byte outMinByte = (byte) (min - val);
        int outMaxInt = val + max;
        int outMinInt = min - val;
        System.out.println(outMaxByte);
        System.out.println(outMinByte);
        System.out.println(outMaxInt);
        System.out.println(outMinInt);
    }

}

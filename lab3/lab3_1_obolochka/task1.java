package ru.mirea.lab3.lab3_1_obolochka;

public class task1 {
    public static void main(String[] args) {

        Double c = new Double(777.777);
        Double c1 = Double.valueOf(c);
        String s="3000";
        Double a = Double.parseDouble(s);
        double x = 20.7;
        Double dob = new Double(33.4);
        int x1 = dob.intValue();
        byte x2 = dob.byteValue();
        float x3 = dob.floatValue();
        short x4 = dob.shortValue();
        long x5= dob.longValue();
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        double c2 = 3.14;
        String d = Double.toString(c2);
        System.out.println(d);
}
}

package ru.mirea.lab4_1;

public class task10 {
    public static abstract class transport{
        public transport(){}
        public abstract String getTime(int length);
        public abstract String getPrise(int length);
    }
    public static class plane extends transport{
        public int prise;
        public int speed;
        public plane(){
            this.prise=100;
            this.speed = 900;
        }
        @Override
        public String getTime (int length){
            return "время полета "+ (length/speed);
        }
        @Override
        public String getPrise (int length){
            return "стоимось "+(prise*length);
        }
    }
    public static class train extends transport{
        public int prise;
        public int speed;
        public train(){
            this.prise=10;
            this.speed = 110;
        }
        @Override
        public String getTime (int length){
            return "время поездки "+ (length/speed);
        }
        @Override
        public String getPrise (int length){
            return "стоимось "+(prise*length);
        }
    }
    public static class car extends transport{
        public int prise;
        public int speed;
        public car(){
            this.prise=6;
            this.speed = 90;
        }
        @Override
        public String getTime (int length){
            return "время поездки "+ (length/speed);
        }
        @Override
        public String getPrise (int length){
            return "стоимось "+(prise*length);
        }
    }
    public static class ship extends transport{
        public int prise;
        public int speed;
        public ship(){
            this.prise=11;
            this.speed = 30;
        }
        @Override
        public String getTime (int length){
            return "время поездки "+ (length/speed);
        }
        @Override
        public String getPrise (int length){
            return "стоимось "+(prise*length);
        }
    }

    public static void main(String[] args) {
        ship s = new ship();
        System.out.println(s.getTime(10000));
        System.out.println(s.getPrise(10000));
    }
}

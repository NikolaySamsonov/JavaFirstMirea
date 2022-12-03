package ru.mirea.lab4_1;

public class task8 {
    public static abstract class Shape{
        protected String color;
        protected boolean filled;
        Shape (){};
        Shape (String color,boolean filled ){
            this.color=color;
            this.filled=filled;
        }
        public String getColor (){
            return "цвет фигуры"+color;
        }
        public void setColor (String color ){
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled (boolean filled){
            this.filled= filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
        public abstract String toString();
    }

    public static class Circle extends Shape{
        protected double radius;
        public Circle(){};
        public Circle(double radius){
            this.radius=radius;
        }
        public Circle(double radius, String color, boolean filled){
            this.radius=radius;
            this.filled=filled;
            this.color=color;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius=radius;
        }

        @Override
        public double getArea() {
            return 3.14*radius*radius;
        }

        @Override
        public double getPerimeter() {
            return 2*3.14*radius;
        }

        @Override
        public String toString() {
            return "круг "+radius+" "+color+" "+filled;
        }
    }

    public static class Rectangle extends Shape {
        protected double width;
        protected double length;
        public Rectangle(){};
        public Rectangle(double width, double length){
            this.length=length;
            this.width=width;
        }
        public Rectangle(double width, double length, double radius, String color, boolean filled){
            this.length=length;
            this.width=width;
            this.filled=filled;
            this.color=color;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double width){
            this.width=width;
        }

        public double getLength(){
            return length;
        }
        public void setLength(double width){
            this.length=length;
        }

        @Override
        public double getArea() {
            return width*length;
        }

        @Override
        public double getPerimeter() {
            return width+length+length+width;
        }

        @Override
        public String toString() {
            return "круг "+width+" "+length+" "+color+" "+filled;
        }
    }
    public static class Square extends Rectangle{

        public Square(){};
        public Square(double side){
            this.width=side;
            this.length=side;
        }
        public Square(double side, String color, boolean filled){
            this.width=side;
            this.length=side;
            this.filled=filled;
            this.color=color;
        }
        public double getSide(){
            return width;
        }
        public void setSide(double side){
            this.width=side;
            this.length=side;
        }

        @Override
        public double getArea() {
            return width*length;
        }

        @Override
        public double getPerimeter() {
            return width*4;
        }

        @Override
        public String toString() {
            return "квадрат "+width+" "+color+" "+filled;
        }
    }

    public static void main(String[] args) {
        Square s = new Square(25);
        System.out.println(s.getArea());
    }
}

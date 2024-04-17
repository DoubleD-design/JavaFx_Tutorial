package com.example.javafx_tutorial;

public class testProperty {
    public static void main(String[] args) {
        MyNumber mn = new MyNumber();
        mn.myPropertyProperty().addListener((observableValue, oldvalue, newvalue) -> {
            System.out.println(observableValue);
            System.out.println(oldvalue);
            System.out.println(newvalue);
        });
        mn.setMyProperty(32);
        mn.setMyProperty(42);
    }
}

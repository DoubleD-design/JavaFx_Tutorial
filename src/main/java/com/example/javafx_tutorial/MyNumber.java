package com.example.javafx_tutorial;
import javafx.beans.property.*;
public class MyNumber {
    private DoubleProperty myProperty = new SimpleDoubleProperty();

    public double getMyProperty() {
        return myProperty.get();
    }

    public DoubleProperty myPropertyProperty() {
        return myProperty;
    }

    public void setMyProperty(double myProperty) {
        this.myProperty.set(myProperty);
    }
}

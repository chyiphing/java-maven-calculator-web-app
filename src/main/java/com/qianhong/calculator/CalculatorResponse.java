package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

    // Member variables to store the input values (x and y), the result, and the timestamp.
    int _x;
    int _y;
    int _result;
    String _time;

    // Constructor to initialize the CalculatorResponse object with input values and a timestamp.
    public CalculatorResponse(int x, int y, int result) {
        _x = x;
        _y = y;
        _result = result;
        _time = new Date().toString(); // Get the current date and time as a string.
    }

    // Getter method to retrieve the value of x.
    public int getX() {
        return _x;
    }

    // Getter method to retrieve the value of y.
    public int getY() {
        return _y;
    }

    // Getter method to retrieve the calculation result.
    public int getResult() {
        return _result;
    }

    // Getter method to retrieve the timestamp when the calculation was performed.
    public String getTime() {
        return _time;
    }
}

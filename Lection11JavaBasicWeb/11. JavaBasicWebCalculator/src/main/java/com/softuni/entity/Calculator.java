package com.softuni.entity;

import java.text.DecimalFormat;

public class Calculator {

    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {
        double result = 0;

        switch (this.operator) {
            case "+":
                return this.leftOperand + this.rightOperand;
            case "-":
                return this.leftOperand - this.rightOperand;
            case "*":
                return this.leftOperand * this.rightOperand;
            case "/": {
                if (!(this.rightOperand == 0)) {
                    return this.leftOperand / this.rightOperand;
                }else{
                    return 0;
                }
            }

        }


        return result;
    }
}

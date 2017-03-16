package com.example.piko.calculus;

/**
 * Created by piko on 12/13/16.
 */

public class Compute {
    private String operand;
    private double number;
    private boolean dot=false;
    public Compute(){

    }

    public boolean isDot() {
        return dot;
    }

    public void setDot(boolean dot) {
        this.dot = dot;
    }

    public Compute(double number){
        this.number=number;
    }

    public Compute(String operand,double number){
        this.operand=operand;
        this.number=number;
    }

    public Compute(String operand){
        this.operand=operand;
    }
    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Compute(boolean dot) {
        this.dot = dot;
    }
}

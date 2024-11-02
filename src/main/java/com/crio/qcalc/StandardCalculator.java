package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    

    public double getResult(){
        return result;
    }
    public void setResult(int val){
        if (val != 0)
            return;

        this.result=val;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }
    
    public void clearResult() {
        result = 0;
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    
    
    public final void add(int num1, int num2){
       add((double)num1, (double)num2);
    }

    public final void subtract(int num1, int num2){
        subtract((double)num1, (double)num2);
    }

    public final void multiply(int num1, int num2){
        multiply((double)num1, (double)num2);
    }

    public final void divide(int num1, int num2){
        divide((double)num1, (double)num2);
    }
    public final void add(double d, double e) {
        double result = d+e;
        if(result==Double.MAX_VALUE || result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void subtract(double d, double e) {
       double result=d-e;
       if (result==Double.MIN_VALUE || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
       }
       this.result=result;
    }
    public final void multiply(double d, double e) {
        double result=d*e;
        if(result==Double.MAX_VALUE || result == Double.POSITIVE_INFINITY || result==Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    public final void divide(double d, double e) {
        if(e==0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        double result=d/e;
        if (result==Double.MIN_VALUE || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
       }
       this.result=result;
    }
}

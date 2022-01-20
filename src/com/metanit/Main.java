package com.metanit;

public class Main {

    public static void main(String[] args) {
        double a = 1.57;
        double b = 2.38;
        double x = -4.25;
        double y;
        if(x< - 1){
            y = Math.sqrt(Math.abs((Math.sin(a*x))));
            System.out.println(y);
        }
        else if (x>=-1) {
            y = Math.tan(Math.sqrt(1 + Math.pow(b*x,2)));
            System.out.println(y);
        }
    }
}

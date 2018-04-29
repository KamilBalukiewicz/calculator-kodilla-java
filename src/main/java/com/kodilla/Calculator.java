package com.kodilla;
class Calculator {

    public double addXtoY(double x, double y) {
       return x + y;

    }

    public double subtract(double a, double b) {
        return a - b;
    }
}

class Application {
        public static void main (String[] args) throws java.lang.Exception {
            Calculator calculator = new Calculator();
            double sum = calculator.addXtoY(7.1, 6.8);
            double subtracting = calculator.subtract(9.7, 3.8);
            System.out.println("Adding result is: " + sum);
            System.out.println("Subtracting result is: " + subtracting);
        }
    }


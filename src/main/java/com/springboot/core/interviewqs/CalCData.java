package com.springboot.core.interviewqs;


public class CalCData  extends Nemo{

    @Override
    public int multiply(int a, int b){
        return a*b;
    }


    public static void main(String[] args) {

        int result =0;
        // line 1
        Calculation calculation = ((int x, int y) ->   x + y);
        //                        (int x, int y) -> {return x + y; };
        result = calculation.add(10,20);
        System.out.println(result);

        Nemo nemo = new Nemo() {
            @Override
            int multiply(int a, int b) {
                return super.multiply(a, b);
            }
        };

        Calculation calc = new Calculation() {

            @Override
            public int add(int a, int b) {
                return (a + b);
            }
        };

        System.out.println(nemo.multiply(10,20));
        System.out.println(calc.add(40,20));


        CalCData calCData = new CalCData();
        System.out.println(calCData.multiply(10,20));
    }
}

interface Calculation{

    int add(int a, int b);
}


abstract class Nemo{
    int multiply(int a, int b){
        return a * b;
    }
}

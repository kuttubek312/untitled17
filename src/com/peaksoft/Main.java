package com.peaksoft;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        

        // IntBinaryOperator, которое получает два (a, b) целочисленных параметра и возвращает их a * b.


        System.out.println("IntBinaryOperator Interface - 'applyAsInt' example \n");

        IntBinaryOperator intBinaryOperator = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int x, int y) {
                return x * y;
            }
        };
        IntBinaryOperator lambda = (x , y ) -> x * y;

        System.out.println("Result : " + intBinaryOperator.applyAsInt(10,20));

        System.out.println("Result : " + lambda.applyAsInt(10,20));

        // надеюсь всё правильно
    }
}
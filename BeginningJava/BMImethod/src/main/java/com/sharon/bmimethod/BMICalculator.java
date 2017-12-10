package com.sharon.bmimethod;


import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        float weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight（kg）：");
        weight = scanner.nextFloat();
        System.out.println("Please input your height（m）：");
        height = scanner.nextFloat();
        System.out.println("Your  BMI is：" + bmiCalculator(weight, height));
}

    public static float bmiCalculator(float weight, float height){
        if (height > 100){
            height /= 100;
        }
        float bmi = weight / (height * height);
        if (bmi > 24){
            System.out.println("Overweight");
        }
        else if (bmi >= 18){
            System.out.println("Normal");
        }
        else {
            System.out.println("Underweight");
        }
        return bmi;
    }
}





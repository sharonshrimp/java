package com.sharon.javapractice;

import java.text.DecimalFormat;
import java.util.Random;

public class myClass {



        public static void main(String[] args) {

                Random randWeight = new Random();
                Random randHeight = new Random();

                for(int i = 0 ; i < 10 ; i ++) {
                        bmi(25 + randWeight.nextInt(75) + randWeight.nextDouble(), 1 + randHeight.nextInt(1) + randHeight.nextDouble());
                }


        }

        public static void bmi(double weight_in_kilogram, double height_in_meter){

                double bmi = weight_in_kilogram / (height_in_meter * height_in_meter);

                DecimalFormat df = new DecimalFormat("#.#");
                DecimalFormat df2 = new DecimalFormat("#.##");

                if (bmi > 24) {
                        System.out.println("overweight");
                } else if (bmi >= 18) {
                        System.out.println("Normal");
                } else {
                        System.out.println("Underweight");
                }

                System.out.println("    bmi: " + df.format(bmi) + "     weight : " + df.format(weight_in_kilogram) + "     height : " + df2.format(height_in_meter) + "\n");
        }
}
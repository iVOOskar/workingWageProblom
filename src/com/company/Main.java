package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the name of the employee:");
        String employeeName = input.next();
        System.out.println("enter the number of hours worked a week:");
        double numHours = input.nextDouble();
        System.out.println("enter the hourly wage:");
        double hourlyWage = input.nextDouble();

        if (numHours >45){
            double overTime = numHours - 45;
            double weeklyWage = 45*hourlyWage;
            double overTimeWage = overTime * (hourlyWage*1.5);
            double totalWage = weeklyWage + overTimeWage;
            System.out.println("the total weekly wage before tax for "+employeeName+" is:"+totalWage);
            double wageWithTax = totalWage * 0.8;
            System.out.println("the total weekly wage after tax for "+employeeName+" is:"+wageWithTax);
        }

        else{
            double weeklyWage = numHours*hourlyWage;
            double wageWithTax = weeklyWage * 0.8;
            System.out.println("the total weekly wage before tax for "+employeeName+" is:"+weeklyWage);
            System.out.println("the total weekly wage after tax for "+employeeName+" is:"+wageWithTax);

        }
    }
}

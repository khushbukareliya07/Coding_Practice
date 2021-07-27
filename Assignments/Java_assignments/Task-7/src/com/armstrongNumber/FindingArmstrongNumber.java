package com.armstrongNumber;

public class FindingArmstrongNumber {
    public static void main(String[] args) {
        int number = 370;
        int n1 = number, temp=0,sum = 0;

        while (number >= 1)
        {
                temp = number % 10;
                sum = (temp*temp*temp) + sum;
                number/=10;
        }
        if (n1 == sum)
        {
            System.out.println("yes, Armstrong");
        }
        else
            System.out.println("No!");
    }
}

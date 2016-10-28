package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int gradeArray [] = new int[1000];
        String nameArray [] = new String[1000];
        Scanner inputGrade = new Scanner(System.in);
        Scanner inputName = new Scanner(System.in);
        int grade;
        String name;
        int count = 0;
        int sum = 0;
        int average = 0;

        while(true)
        {
            System.out.println("Enter a name");
            name = inputName.nextLine();

            if(name.equals("-1"))
            {
                break;
            }
            nameArray[count] = name;
            name = "";

            System.out.println("Enter a grade");
            grade = inputGrade.nextInt();
            gradeArray[count]=grade;

            sum = sum + gradeArray[count];
            count++;
        }

        if (count > 0)
        {
            average = sum/count;

        }

        System.out.println();

        System.out.println("The average is " + average);

        for (int i = 0; i < count; i++)
        {
            System.out.println(nameArray[i] + ": " + gradeArray[i]);
        }

    }
}

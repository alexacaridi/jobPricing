/*Chapter 3 exercise #10 pg.165
Filename: JobPricing.java
Alexa Caridi 02/14/2020*/

import java.util.Scanner;
public class JobPricing
{
    public static void main(String[] args)
    {
        //variables and constants
        String jobName;
        double costMaterials;
        double hourRate = 35;
        double travelRate = 12;
        int travelTime;
        int hoursRequired;
        double totalCost;

        //objects
        Scanner input = new Scanner(System.in);

        //input phase
        System.out.print("Please enter the name of the job >> ");
        jobName = input.nextLine();

        System.out.print("Please enter the cost of the materials >> ");
        costMaterials = input.nextDouble();

        System.out.print("Please enter the number of hours required to complete this job >> ");
        hoursRequired = input.nextInt();

        System.out.print("Please enter the number of hours of travel time spent during this job >> ");
        travelTime = input.nextInt();

        //calculation phase
        totalCost = estimate(costMaterials, hourRate, travelRate, travelTime, hoursRequired);

        //output phase
        System.out.println("The estimated price for the job titled " + jobName + " is $" + totalCost + ".");
    }

    public static double estimate(double materials, double HR, double TR, int travel, int hours)
    {
        double price;
        price = (materials + (HR * hours)) + (TR * travel);
        return price;
    }
}
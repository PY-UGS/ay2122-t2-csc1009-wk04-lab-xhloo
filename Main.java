import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        BMI newBMI = new BMI();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weightPounds = input.nextInt();
        newBMI.setweightPound(weightPounds);

        System.out.println("Enter height in inches: ");
        int heightInches = input.nextInt();
        newBMI.setheightInches(heightInches);

        System.out.println("BMI is " + newBMI.getBMI());
        System.out.println(newBMI.getInterpretation());
    }
}
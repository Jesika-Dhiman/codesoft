import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Take the marks from user
        System.out.println(" Enter Marks of Subject1: ");
        double subject1= scanner.nextDouble();
        System.out.println(" Enter Marks of Subject2: ");
        double subject2= scanner.nextDouble();
        System.out.println(" Enter Marks of Subject3: ");
        double subject3= scanner.nextDouble();
        System.out.println(" Enter Marks of Subject4: ");
        double subject4= scanner.nextDouble();
        System.out.println(" Enter Marks of Subject5: ");
        double subject5= scanner.nextDouble();

        //Calculate total marks
        double total_marks=(subject1 + subject2 + subject3 + subject4 + subject5);

        //Calculate percentage
        double percentage=(total_marks)/5;

        //display details
        System.out.println("**************************");
        System.out.println();
        System.out.println("Marks of Subject1: "+subject1);
        System.out.println("Marks of Subject2: "+subject2);
        System.out.println("Marks of Subject3: "+subject3);
        System.out.println("Marks of Subject4: "+subject4);
        System.out.println("Marks of Subject5: "+subject5);
        System.out.println("Total marks      :      "+total_marks);
        System.out.println("Percentage       :       "+percentage+"%");
        System.out.println("*****************************");



        //Grade Calculation
        if(percentage>=90)
        {
            System.out.println("Grade : "+"A");
        }
        else if (percentage>=60)
        {
            System.out.println("Grade : "+"B");
        }
        else if (percentage>=30)
        {
            System.out.println("Grade : "+"C");
        }
        else
        {
            System.out.println("Fail");
        }


    }
}

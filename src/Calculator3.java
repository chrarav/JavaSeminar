import java.util.Scanner;

/**
 * An upgraded class that serves as a calculator of GPA.
 * Data are given by the user through keyboard.
 * Program checks if admits the module score or the GPA.
 *
 * @author chrarav
 * @version 1
 * @date 2024.06.25
 */

public class Calculator3 {
    public static void main(String[] args) {



        Scanner keyboard =new Scanner(System.in);
        System.out.print("Name: ");
        String name = keyboard.nextLine();
        System.out.print("ID: ");
        int id =keyboard.nextInt();
        System.out.print("Score for Stats: ");
        double scoreForStats=keyboard.nextDouble();
        System.out.print("Score for Stats: ");
        double scoreForRPS=keyboard.nextDouble();
        System.out.print("Score for Path module: ");
        double scoreForPathModule=keyboard.nextDouble();


        double average = (scoreForStats+scoreForRPS+scoreForPathModule)/3.0;
        System.out.println(name+" with id number "+id+" has average equal to "+average);

        if(average<60){
            System.out.println(name+" does not meet the required module score.");
        }else if (average<65){
            System.out.println(name+" does meet the progression score but not the GPA.");
        }else{
            System.out.println("Student is eligible to progress.");
        }

    }

}

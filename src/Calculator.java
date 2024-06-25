/**
 * A class that serves as a calculator of GPA.
 * Input data are fixed.
 *
 * @author chrarav
 * @version 1
 * @date 2024.06.25
 */

public class Calculator {
    public static void main(String[] args) {

        String name="Bob";
        int id =12345;
        double scoreForStats=67.4;
        double scoreForRPS=64;
        double scoreForPathModule=80;
        double average = (scoreForStats+scoreForRPS+scoreForPathModule)/4;

        System.out.println(name+" with id number "+id+" has average equal to "+average);

    }

}

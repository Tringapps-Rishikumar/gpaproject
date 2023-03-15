package gpacall;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gpacall {
    String name;
    Logger lol = Logger.getLogger("gpa");
    int dec;
    int gpa = 0;

    public Gpacall(String name) {
        this.name = name;
    }

    public void gpacalculation(String grade) {

        switch (grade) {
            case "A"-> {
                dec = 4;
                gpa += dec;
            }
            case "B" -> {
                dec = 3;
                gpa += dec;
            }
            case "C" -> {
                dec = 2;
                gpa += dec;
            }
            case "D" -> {
                dec = 1;
                gpa += dec;
            }
            case "F" -> {
                dec = 0;
                gpa = dec;
            }
            default ->lol.info("enter the correct choice");
        }

    }

    public String displayGpa() {
        return name + " has " + gpa + " gpa ";
    }

    public void gpaUpdate() {
        Scanner bn = new Scanner(System.in);
        lol.info("do you need to update gpa(yes/no)");
        String des = bn.next();
        if (des.equals("yes")) {
            gpa = 0;
            lol.info("enter the student grade:");
            String grade = bn.next();
            gpacalculation(grade);
            lol.log(Level.INFO, () ->displayGpa());
        }
    }
}


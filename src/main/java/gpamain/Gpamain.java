package gpamain;


import gpacall.Gpacall;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gpamain {
    public static void main(String [] args){
        Scanner bn=new Scanner(System.in);
        Logger lol = Logger.getLogger("gpa");
        lol.info("enter the student name:");
        String name=bn.next();
        lol.info("enter the student grade:");
        String grade=bn.next();
        Gpacall o=new Gpacall(name);
        o.gpacalculation(grade);
        lol.log(Level.INFO, () ->o.displayGpa());

        o.gpa_update();
    }
}


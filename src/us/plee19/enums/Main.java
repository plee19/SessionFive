package us.plee19.enums;

import java.util.Scanner;

/**
 * Main method to demonstrate enums with user input.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("What are the first three letters of your favorite team (Mascot or City)?");
        Scanner keyboard = new Scanner(System.in);
        Team teamInput;
        try {
            teamInput = Team.valueOf(keyboard.nextLine().toUpperCase());
            getTeam(teamInput);
        } catch (IllegalArgumentException e) {
            System.out.println("No such team");
        }
    }

    public static void getTeam(Team teamInput) {
        switch (teamInput) {
            case CHI:
                System.out.println("Chicago Bears");
                break;
            case GRE:
                System.out.println("Green Bay Packers");
                break;
            case DET:
                System.out.println("Detroit Lions");
                break;
            case MIN:
                System.out.println("Minnesota Vikings");
                break;
            case PAC:
                System.out.println("Green Bay Packers");
                break;
            case VIK:
                System.out.println("Minnesota Vikings");
                break;
            case LIO:
                System.out.println("Detroit Lions");
                break;
            case BEA:
                System.out.println("Chicago Bears");
                break;
        }
    }
}

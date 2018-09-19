package us.plee19.enums;

import java.util.Scanner;

/**
 * Main method to demonstrate enums with user input.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("What is your favorite NFC team?");
        Scanner keyboard = new Scanner(System.in);
        Team teamInput;
        try {
            teamInput = Team.valueOf(keyboard.nextLine().toUpperCase().substring(0,3));
            printTeam(teamInput);
        } catch (IllegalArgumentException e) {
            System.out.println("No such team");
        }
    }

    public static void printTeam(Team teamInput) {
        switch (teamInput) {
            case CHI: case BEA:
                System.out.println("Chicago Bears");
                break;
            case GRE: case PAC:
                System.out.println("Green Bay Packers");
                break;
            case DET: case LIO:
                System.out.println("Detroit Lions");
                break;
            case MIN: case VIK:
                System.out.println("Minnesota Vikings");
                break;
            case DAL: case COW:
                System.out.println("Dallas Cowboys");
                break;
            case PHI: case EAG:
                System.out.println("Philadelphia Eagles");
                break;
            case SEA:
                System.out.println("Seattle Seahawks");
            case NEW: case GIA:
                System.out.println("New York Giants");
            case SAN: case FOR:
                System.out.println("San Francisco Forty-Niners");
            case ATL: case FAL:
                System.out.println("Atlanta Falcons");
                break;
            case LOS: case RAM:
                System.out.println("Los Angeles Rams");
            case WAS: case RED:
                System.out.println("Washington Redskins");
            case TAM: case BUC:
                System.out.println("Tampa Bay Buccaneers");
            case CAR: case PAN:
                System.out.println("Carolina Panthers");
        }
    }
}

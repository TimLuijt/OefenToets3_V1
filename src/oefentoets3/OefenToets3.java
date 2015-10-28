/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoets3;

import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class OefenToets3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Naam: Jeffrey de Boer" + "\n" + "Klas: ID101" + 
                "\n" + "Studentnummer: 500735384");
        
        System.out.print("Naam van team 1: ");
        String basketbalTeam1 = input.next();
        System.out.print("Naam van team 2: ");
        String basketbalTeam2 = input.next();
        
        int basketbalTeamArray1[] = new int[7];
        int basketbalTeamArray2[] = new int[7];
        
        int winstTeam1 = 0;
        int winstTeam2 = 0;
        
        for (int counter = 0; counter < basketbalTeamArray1.length; counter++){
            System.out.print("Voer de score van " + basketbalTeam1 + " wedstrijd in: ");
            basketbalTeamArray1[counter] = input.nextInt();
            System.out.print("Voer de score van " + basketbalTeam2 + " wedstrijd in: ");
            basketbalTeamArray2[counter] = input.nextInt();                                
            
        }
        
        for (int counter2 = 0; counter2 < basketbalTeamArray1.length; counter2++) {
            if(basketbalTeamArray1[counter2] < basketbalTeamArray2[counter2]) {
                winstTeam1++;
            } else
                winstTeam2++;
            }
        System.out.println("winstTeam1 is: " + winstTeam1);
        System.out.println("winstTeam2 is: " + winstTeam2);
        
        /** Controle  Array contents voor mij even om te testen of de for loop werkte.
        System.out.println("test array 1 zesde plek:" + "\n" + 
                basketbalTeamArray1[0]);
        System.out.println("test array 2 zesde plek:" + "\n" + 
                basketbalTeamArray2[0]);
        */
        
        System.out.println("Uitslag van wedstrijd 1" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[0] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[0]);
        System.out.println("Uitslag van wedstrijd 2" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[1] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[1]);
        System.out.println("Uitslag van wedstrijd 3" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[2] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[2]);
        System.out.println("Uitslag van wedstrijd 3" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[3] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[3]);
        System.out.println("Uitslag van wedstrijd 4" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[4] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[4]);
        System.out.println("Uitslag van wedstrijd 5" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[5] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[5]);
        System.out.println("Uitslag van wedstrijd 6" + "\n" + "\t" + "Aantal punten " + basketbalTeam1 +
                ": " + basketbalTeamArray1[6] + "\n" + "\t" + "Aantal punten " + basketbalTeam2 + ": " + basketbalTeamArray2[6]);
    
        printWinnaar(basketbalTeam1,basketbalTeam2,winstTeam1,winstTeam2);
        
    }
    
    static void printWinnaar(String team1, String team2, int aantalWinstTeam1, int aantalWinstTeam2)
    {    
        if (aantalWinstTeam1 < aantalWinstTeam2) {
            System.out.println(team1 + " heeft gewonnen met " + aantalWinstTeam1 + aantalWinstTeam2);
        }   else
        System.out.println(team2 + " heeft gewonnen met " + aantalWinstTeam2 + aantalWinstTeam1);   
    }    
}

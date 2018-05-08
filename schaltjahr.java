
package schaltjahrüberprüfung;

import java.util.Scanner;
public class SchlatjahrÜberprüfung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib das Jahr ein:");
        int jahr = eingabe.nextInt();

        if(jahr%4==0 && jahr%400==0 ){
            System.out.println(jahr + " ist ein Schaltjahr!");
        }
        else {
            System.out.println(jahr + " ist kein Schaltjahr!");        
        }
    }
}

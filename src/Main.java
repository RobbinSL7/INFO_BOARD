import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) { // Main
        Scanner scnr = new Scanner(System.in);


        System.out.println("Enter Announcement Title"); // Prompt user for Announcement Title

          String aTitle = scnr.nextLine(); // Scan Title

        System.out.println("Enter Details"); // Prompt user for Details

          String aDetails = scnr.nextLine(); // Scan Details

        System.out.println("Enter authorID"); // Prompt user for authorID

          int authorID = scnr.nextInt(); // Scan authorID

          scnr.nextLine(); // Clears ENTER from the scanner

        InfoItem.VarStore(aTitle, aDetails, authorID);
        
        System.out.println(aTitle);   // Print Title Variable
        System.out.println(aDetails);  // Print Details Variable
        System.out.println(authorID);  // Print authorID Variable





    }
}

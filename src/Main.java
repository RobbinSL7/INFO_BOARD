import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) { // Main
        Scanner scnr = new Scanner(System.in);

        BoardManager bm = new BoardManager(); // Create Object for Board Manager


        System.out.println("Enter Announcement Title"); // Prompt user for Announcement Title

          String title = scnr.nextLine(); // Scan Title

        System.out.println("Enter Details"); // Prompt user for Details

          String content = scnr.nextLine(); // Scan Details

        System.out.println("Enter authorID"); // Prompt user for authorID

          int authorID = scnr.nextInt(); // Scan authorID

          scnr.nextLine(); // Clears ENTER from the scanner


        InfoItem item = bm.addAnnouncement(title, content, authorID); //Create post using Post as holder

        
        System.out.println(item.title);   // Print Title Variable
        System.out.println(item.details);  // Print Details Variable
        System.out.prin
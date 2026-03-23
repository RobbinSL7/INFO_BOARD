
public class InfoItem {


    String title;  // Title String Variable
    String details;  // Details String Variable
    int authorID;    // Author ID Integer Variable

    public InfoItem(String title, String details, int authorID) {    // Post Method for Permanent Variable Storage
        this.title = title;    // Move Title from Temp to Perma Variable
        this.details = details;   // Move details from Temp to Perma Variable
        this.authorID = authorID;    // Move Author ID from Temp to Perma Variable
    }


    
}


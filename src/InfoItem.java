
public class InfoItem {


    static String aTitle;  // Title String Variable
    static  String aDetails;  // Details String Variable
    static int authorID;    // Author ID Integer Variable

    public static void VarStore(String aTitle, String aDetails, int authorID) {    // Post Method for Permanent Variable Storage
        InfoItem.aTitle = aTitle;    // Move Title from Temp to Perma Variable
        InfoItem.aDetails = aDetails;   // Move details from Temp to Perma Variable
        InfoItem.authorID = authorID;    // Move Author ID from Temp to Perma Variable
    }


    
}


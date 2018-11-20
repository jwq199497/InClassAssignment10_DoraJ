import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	System.out.println("Welcome! What would you like to tweet?");
	String tText = in.nextLine();
	if(tText.length()<= 140){
	    System.out.println("Length correct.");

        Counter at = new Counter();
        System.out.println("Number of Attributions: " + at.getCount(tText, "@"));


        Counter hashtag = new Counter();
        System.out.println("Number of Hashtags: " +hashtag.getCount(tText, "#"));

        Counter link = new Counter();
        System.out.println("Number of Links: " + link.getLinkCount(tText, "http://"));
    }
    else {
        int excess = tText.length() - 140;
        System.out.println("Excess Characters: " + excess);
        return;
    }


    }
}

//import javax.swing.text.StyledEditorKit;

/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 22 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        if (m.length() > 0) {
            this.message = m;
        } else {
            this.message = ("Happy Halloween!");
        }
        
    }

    /*
     * Prints a decorative banner, resized to fit message
     */
    public void display() {
        System.out.print(" ");
        for(int i = 0; i < message.length() + 6; i++) 
        {
        System.out.print("*");
        }
        System.out.println("\n***~" + this.message + "~***");
        System.out.print(" ");
        for(int i = 0; i < message.length() + 6; i++) 
        {
        System.out.print("*");
        }
        System.out.println("\n           ***");
        System.out.println("             *");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("");
        myBanner.display();
    }
}
/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 22 October 2022
 */
public class Pants {

    /*
     * Prints ASCII art depicting pants to the console
     */
    public void display() {
        System.out.println("       [======++======]");
        System.out.println("       |______________|");
        System.out.println("       |              |");
        System.out.println("       | ++   __   ++ |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("       |     |  |     |");
        System.out.println("      |_+_+_+_||_+_+_+_|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}

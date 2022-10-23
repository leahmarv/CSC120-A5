/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 22 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * 
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor
     * Initializes parts of scarecrow
     */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot l, Boot r, Banner b) {
        head = h;
        body = s;
        legs = p;
        leftFoot = l;
        rightFoot = r;
        sign = b;
 
    }

    /* Displays the Scarecrow 
     * 
    */
    public void display() {
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner(" "));

        // If a message was passed in on the command line, extract and store it
        // in Step 4, you'll pass this value along to your Banner constructor
        
        
         
         if (args.length > 0) {
            myScarecrow.message = args[0];
            
        }
        
        myScarecrow.display();
    }

}

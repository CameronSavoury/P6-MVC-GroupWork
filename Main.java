package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        
        //Instantiate Multiple Instances of Controller 2
        Controller2 c2 = new Controller2(model); // Create second controller
        Controller2 c21 = new Controller2(model); // Create 2nd instance of the second controller
        Controller2 c22 = new Controller2(model); // Create 3rd instance of thesecond controller
        
    } // main
  
} // Main

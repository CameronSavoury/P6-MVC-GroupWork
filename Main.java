package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1 (Main)", 40, 40); // Create first controller
        Controller2 c2 = new Controller2(model, "Observer 1", 380, 40); // Create second controller
        Controller2 c21 = new Controller2(model, "Observer 2", 840, 40);
        Controller2 c22 = new Controller2(model, "Observer 3", 1200, 40);
        
    } // main1
  
} // Main

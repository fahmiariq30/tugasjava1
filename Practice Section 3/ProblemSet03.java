/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemset03;


/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class ProblemSet03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// 1. Accept at least 1 input, to be parsed as a String
//    Uncomment below code to run

//        String name = "Fahmi Ariq";
//        JOptionPane.showMessageDialog(null,"Hallo "+ name);
        
        
// 2. Accept at least 1 niput, to be parsed as an int
//    Uncomment below code to run
        
//        int x = 3;
//        JOptionPane.showMessageDialog(null,"Your int value is "+ x);


// 3. Accept at least 1 input, to be parsed as a double
//    Uncomment below code to run
         
//        double x = 5;
//        JOptionPane.showMessageDialog(null, "Your double value is "+ x);
   
// 4. Accept at least 1 input in a question for the user
//    Uncomment below code to run

//        String name;
//        name = JOptionPane.showInputDialog("What is your name?");
//        JOptionPane.showMessageDialog(null,"Hai "+ name + " Welcome to Java Programming");
    

// 5. Do math with at least 1 double input.
//    Uncomment below code to run

//         int x, y, z, result;
//         x = Integer.parseInt(JOptionPane.showInputDialog(null,"Summation \n Input 1 : "));
//         y = Integer.parseInt(JOptionPane.showInputDialog(null,"Input 2 : "));           
//         result = x + y;  
//         JOptionPane.showMessageDialog(null,""+x+ " + "+y+ " = "+result,
//         "Summation", JOptionPane.INFORMATION_MESSAGE);
            
            
// 6. Accept at least 10 total inputs.
//    Uncomment below code to run

         String name, email, city, education, phone, religion, country, university;
         int age;
         double ipk;
           
         name = JOptionPane.showInputDialog("Input your name");
         email = JOptionPane.showInputDialog("Input your email");
         phone = JOptionPane.showInputDialog("Input your phone number");
         age = Integer.parseInt(JOptionPane.showInputDialog("Input your age"));
         religion = JOptionPane.showInputDialog("Input your religion");
         university = JOptionPane.showInputDialog("Input your University");
         ipk = Double.parseDouble(JOptionPane.showInputDialog("Input your ipk (Example: 3.6)"));
         city = JOptionPane.showInputDialog("Input your city");
         country = JOptionPane.showInputDialog("Input your country ");
            
         JOptionPane.showMessageDialog(null,"Nama : "+name+ "\nEmail : "+email+
                 "\nPhone : "+phone+ "\nAge : "+age+ "\nReligion : "+religion+
                 "\nUniversity : "+university+ "\nIPK : "+ipk+ "\nCity : "+city+
                 "\nCountry : "+country);
             
    }
    
}

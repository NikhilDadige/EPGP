//This is a sample java program
import java.util.Scanner;
class taxcalculator {
    
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        // Write your logic here
        //no tax slab
        if(income<=250000){
            tax = 0.0;
        }
        //tax slab 1
        else if ((income>250000 && income<=300000) && age<60) {
            tax = 0.10 * (income);
        }
        else if ((income>250000 && income<=300000) && (age>=60 && age<80)) {
            tax = 0.0;
        }
        else if ((income>250000 && income<=300000) && age>=80) {
            tax = 0.0;
        }
        //tax slab 2
        else if ((income>300000 && income<=500000) && age<60) {
            tax = 0.10 * (income-300000);
        }
        else if ((income>300000 && income<=500000) && (age>=60 && age<80)) {
            tax = 0.10 * (income-300000);
        }
        else if ((income>300000 && income<=500000) && age>=80) {
            tax = 0.0;
        } 
        //tax slab 3
        else if ((income>500000 && income<=1000000) && age<60) {
            tax = (0.1*(500000-250000)) + (0.2*(income-500000));
        }
        else if ((income>500000 && income<=1000000) && (age>=60 && age<80)) {
            tax = (0.1*(500000-250000)) + (0.2*(income-500000));
        }
        else if ((income>500000 && income<=1000000) && age>=80) {
            tax = (0.1*(500000-250000)) + (0.2*(income-500000));
        }
        // tax slab 4
        else if (income>1000000) {
            tax = (0.3*income) - 25000;
        }
        else {
            System.out.println("Invalid Information");
        }

        System.out.print(tax);
        scan.close();
    }
}

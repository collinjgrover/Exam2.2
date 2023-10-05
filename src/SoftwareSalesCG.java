/*
Collin Grover
CMIS106 - Exam 2
11/18/2022
SoftwareSalesCG.java
 */
import javax.swing.*; // import JOption Pane

public class SoftwareSalesCG {
    public static void main(String[] args) {

        String unitsStr = JOptionPane.showInputDialog(null, "Enter a quantity of software packages you want to buy: ", "Hello,", JOptionPane.INFORMATION_MESSAGE); // collect input
        double unitsNum = Double.parseDouble(unitsStr); // convert to double
        double baseCost = unitsNum * 99; //un-discounted price
        double totalCost; // initialized total cost variable

        // Determining discount if any, then output response
        if (unitsNum >= 10 && unitsNum <= 19){
            totalCost = baseCost - (baseCost * 0.2);
            JOptionPane.showMessageDialog(null,  unitsNum + " of software costs " + baseCost +" but with your discount it will cost $" + totalCost +"!" );
        } else if (unitsNum >= 20 && unitsNum <= 49){
            totalCost = baseCost - (baseCost * 0.3);
            JOptionPane.showMessageDialog(null,  unitsNum + " of software costs " + baseCost +" but with your discount it will cost $" + totalCost +"!" );
        } else if (unitsNum <= 50 && unitsNum >=99){
            totalCost = baseCost - (baseCost * 0.4);
            JOptionPane.showMessageDialog(null,  unitsNum + " of software costs " + baseCost +" but with your discount it will cost $" + totalCost +"!" );
        } else if (unitsNum <= 100){
            totalCost = baseCost - (baseCost* 0.5);
            JOptionPane.showMessageDialog(null,  unitsNum + " of software costs " + baseCost +" but with your discount it will cost $" + totalCost +"!" );
        } else if (unitsNum < 10){
            totalCost = baseCost;
            JOptionPane.showMessageDialog(null,  unitsNum + " of software costs $" + baseCost);
        }
    }
}
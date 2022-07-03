import javax.swing.JOptionPane;
import java.util.Scanner;

public class FuelCost {
    private static double dCost;
    private static int intDistance;

    public static void main(String[] args) {
        //  Creating a scanner to read from console
        Scanner reader = new Scanner(System.in);

        //  Main menu
        System.out.println("This console program calculates how much your car costs according to your travel distance\n" +
                "Please answer the following questions to calculate your fuel cost");

        System.out.print("Average fuel cost in one kilometer(exp. 0.99): ");
        String strCost = reader.nextLine();
        try {
            dCost = Double.parseDouble(strCost);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }

        System.out.print("The distance you have travelled(km): ");
        String strDistance = reader.nextLine();
        try {
            intDistance = Integer.parseInt(strDistance);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }

        //  AvgCost * Distance (general formula to calculate total cost)
        double dResult = dCost * intDistance;
        System.out.println("Total cost of your travel is: " + dResult + "$");
    }
}

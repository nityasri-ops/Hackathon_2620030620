import java.util.Scanner;public class DataTypes {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        int PanelID = sc.nextInt();
        double EnergyGenerated = sc.nextDouble();
        int NumberOfPanels = sc.nextInt();
        char SystemStatus = sc.next().charAt(0);

        System.out.println("Panel ID: " + PanelID);
        System.out.println("Energy Generated in kwh: " + EnergyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + NumberOfPanels);
        System.out.println("System Status: " + SystemStatus);
    }
}
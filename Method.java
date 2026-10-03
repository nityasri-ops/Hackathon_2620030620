import java.util.Scanner;

public class Method {

    static double calculateTotalEnergy(double MorningEnergy, double EveningEnergy) {
        return MorningEnergy + EveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double MorningEnergy = sc.nextDouble();
        double EveningEnergy = sc.nextDouble();

        double TotalEnergy = MorningEnergy + EveningEnergy;

        System.out.println("Total Energy Generated: " + TotalEnergy + " kWh");
    }
}

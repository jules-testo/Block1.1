public class DistanceDemo {

    public static void main(String[] args) {
        int kilometerValue = 12;

        double miles = kilometerToMiles(kilometerValue);
        System.out.println(kilometerValue + " Kilometer entsprechen " + miles + " Meilen");

        double milesValue = 7.45;

        double kilometer = milesToKilometer(milesValue);
        System.out.println(milesValue + " Meilen entsprechen " + kilometer + " Kilometer");
    }
    public static double kilometerToMiles (int kilometer) {
        double result = kilometer / 1.609;

        return result;
    }

    public static double milesToKilometer (double miles) {
        double result1 = miles * 1.609;
        return result1;
    }
}

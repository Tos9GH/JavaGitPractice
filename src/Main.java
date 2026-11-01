public class Main {
    public static void main(String[] args) {
        System.out.println(isTemperatureNormal(75));
        System.out.println(isTemperatureNormal(85));
        System.out.println(isTemperatureNormal(0));
        System.out.println(isTemperatureNormal(80));
        }
    public static boolean isTemperatureNormal (double temperature) {
        return temperature >= 0 && temperature <= 80;
    }
    }
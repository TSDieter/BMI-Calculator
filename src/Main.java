import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a new input by scanner
        Scanner myObject = new Scanner(System.in);

        System.out.println("Enter your Kilogram and height (height in cm)");
        int Kilo = myObject.nextInt();
        double height = myObject.nextDouble();
        double BMI = (Kilo / (height * height) * 10000);

        //request if your BMI is normal,to low or above
        //to low is 18,5
        //to high is 25
        if(BMI > 18.5 && BMI < 25) {
            System.out.println("Your BMI is alright! " + BMI);
        } else if (BMI < 18.5) {
            System.out.println("Your BMI is to low!" + BMI);
        } else {
            System.out.println("Your BMI is to HIGH!" + BMI);
        }
    }
}
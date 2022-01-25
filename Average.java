import java.util.Scanner;

public class Average {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float first = input.nextFloat();
        float second = input.nextFloat();
        float third = input.nextFloat();
        input.close();

        double average = (first + second + third)/3;
        System.out.println("The average of " + first + " " + second + " " + third + " " + "is" + " " + average);
    }
}

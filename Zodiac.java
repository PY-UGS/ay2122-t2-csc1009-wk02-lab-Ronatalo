import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        input.close();
        int number = year%12;

        if(number == 0){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is monkey");
        }

        if(number == 1){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is rooster");
        }

        if(number == 2){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is dog");
        }

        if(number == 3){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is pig");
        }

        if(number == 4){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is rat");
        }

        if(number == 5){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is ox");
        }

        if(number == 6){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is tiger");
        }

        if(number == 7){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is rabbit");
        }

        if(number == 8){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is dragon");
        }

        if(number == 9){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is snake");
        }

        if(number == 10){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is horse");
        }

        if(number == 11){
            System.out.println("The Chinese Zodiac sign for the year " + year + " is sheep");
        }

    }
}

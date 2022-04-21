import org.w3c.dom.ls.LSOutput;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class HexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HexadecimalConverter converter = new HexadecimalConverter();

        try {
            System.out.print("Please enter a whole number to convert: ");
            String stringNum = scanner.nextLine();
            int number = Integer.parseInt(stringNum);

            if (number < 0){
                throw new IllegalArgumentException("Only positive numbers accepted. Please try again.");
            }

            System.out.println(number + " in hex is " + converter.hexConverter(number));
            System.out.println(number + " in binary is " +converter.binaryConverter(number));

        } catch (NumberFormatException | IllegalFormatException e) {
            System.out.println("Error! Please try again with a whole number.");
        }
    }

    public String hexConverter(int number) {
        String output = "";
        int remainder;
        if (number == 0){
            return "0";
        }
        while (number > 0) {
            remainder = number % 16;
            number = number / 16;
            if (remainder < 10) {
                output = remainder + output;
            } else if (remainder == 10) {
                output = "A" + output;
            } else if (remainder == 11) {
                output = "B" + output;
            } else if (remainder == 12) {
                output = "C" + output;
            } else if (remainder == 13) {
                output = "D" + output;
            } else if (remainder == 14) {
                output = "E" + output;
            } else {
                output = "F" + output;
            }
        }
        return output;
    }

    public String binaryConverter(int number){
        String binaryNum = "";
        int remainder;
        if (number == 0){
            return "0";
        }
        while (number > 0){
            remainder = number % 2;
            number = number / 2;
            binaryNum = remainder + binaryNum;
        }
        return binaryNum;
    }


}

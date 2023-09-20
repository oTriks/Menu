import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String choice = "";
        while (!choice.equals("e")) {
            System.out.println("Vad vill du göra?\n1. Addera två tal\n2. Räkna bokstäver i en sträng\n3. Spegelvänd en sträng\n4. Summera alla tal i en sträng\ne för att lämna");
            choice = sc.nextLine();

            if (choice.equals("1")) {
                add();
            } else if (choice.equals("2")) {
                countChar();
            } else if (choice.equals("3")) {
                mirror();
            } else if (choice.equals("4")) {
                sum();
            }else if (choice.equals("e")) {
                break;
            }
        }
        System.out.println("Hejdå!");

    }

    public static void add() {
        System.out.println("Vilka 2 tal vill du summera?");
        String answer = sc.nextLine();
        String[] numbers = answer.split(" ");
        int number1 = Integer.parseInt(numbers[0]);  // funktionen för att omvandla sträng till "int"
        int number2 = Integer.parseInt(numbers[1]);
        int sum = number1 + number2;
        System.out.println("Summan blir: " + sum);
    }

    public static void countChar() {
        System.out.println("Skriv något!");
        String answer = sc.nextLine();
        System.out.println("Vilken bokstav vill du räkna?");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Bokstaven förekommer " + count + " gång(er)");
    }

    public static void mirror() {
        System.out.println("Skriv något!");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Baklänges blir det " + reversed + "!");
    }

    public static void sum() {
        System.out.println("Skriv ett långt tal");
        String answer = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < answer.length(); i++) {
            sum += (Character.getNumericValue(answer.charAt(i)));  // göra om char to "int"
        }
        System.out.println("Summan blir: " + sum);
    }
}
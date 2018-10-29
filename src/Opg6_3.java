import java.util.Scanner;

public class Opg6_3 {
//(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
// public static int reverse(int number)
// Return true if number is a palindrome
// public static boolean isPalindrome(int number)
// Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
// Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal for at få det spejlvendt og undersøgt om det er et palindrom-tal");

        int indtastet = input.nextInt();
        int reversed = reverse(indtastet);

        System.out.println("Du har indtastet " + indtastet);
        System.out.println("Spejlvendt ser det således ud : " + reversed);


        if (isPalindrome(reversed))
            System.out.println("Dit tal er et palindrom-tal");
        else
            System.out.println("Dit tal er ikke et palindrom-tal");

    }

    public static int reverse(int number){

        //Her findes frem til hvor mange tal 'number' består af
        int length = String.valueOf(number).length();

        int reversed = 0;
        String reversed2="";
        int temp;
        double divisor = 1.0;

        //Her køres der et loop der først finder de enkelte tal og dernæst lægger dem sammen
        for (int i = 0;  i < length ; i++) {

            if (i==0)
            {temp = (int)number % 10;}
            else
            {
                //her angives hvor meget der skal divideres med ved at tage antal gange loopet har kørt opløftet i 10
                divisor = Math.pow(10,i);

                //Her findes hvert enkelt tal ved hjælp af ovenstående
                temp = (int)number/(int)divisor %10;}

            //Her lægges tallene sammen
             reversed2 += "" + temp;
        }

        reversed = Integer.parseInt(reversed2);
        return reversed;
    }

    public static boolean isPalindrome(int number){

        boolean palindrom;
        if (number == reverse(number))
            palindrom = true;
        else palindrom = false;
        return palindrom;
    }
}

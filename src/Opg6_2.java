import java.util.Scanner;

public class Opg6_2 {

    // (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Her bedes brugeren om et input der lægges over i variablen 'n'
        System.out.println("Indtast et tal for at regne tværsummen ud");
        long n = input.nextLong();

        //Her kaldes der på nedenstående metode
        System.out.println("tværsummen af " + n + " er " + sumDigits(n));
    }

    //Her starter metoden 'sumDigits()'
    public static int sumDigits(long n) {

        int sum=0;
        double divisor = 1.0;

        //Her findes frem til hvor mange tal 'n' består af
        int length = String.valueOf(n).length();

        //Her køres der et loop der først finder de enkelte tal og dernæst lægger dem sammen
        for (int i = 0;  i < length ; i++) {

            int temp;
            if (i==0)
            {temp = (int)n % 10;}
            else
            {
                //her angives hvor meget der skal divideres med ved at tage antal gange loopet har kørt opløftet i 10
            divisor = Math.pow(10,i);

            //Her findes hvert enkelt tal ved hjælp af ovenstående
            temp = (int)n/(int)divisor %10;}

            //Her lægges tallene sammen
            sum+=temp;
        }

        //Her returneres tværsummen
        return sum;
    }

}



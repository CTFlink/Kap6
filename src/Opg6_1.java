public class Opg6_1 {

    // (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for n = 1, 2,  . . ., and so on.
    // Therefore, the first few numbers are 1, 5, 12, 22, . . . . Write a method with the following header
    // that returns a pentagonal number: public static int getPentagonalNumber(int n)
    // Write a test program that uses this method to display the first 100 pentagonal numbers
    // with 10 numbers on each line.



    public static void main(String[] args) {

        for (int i = 0; i <101 ; i++) {

            if (i%10 == 0)
                System.out.println(getPentagonalNumber(i)+ " ");
            else
                System.out.print(getPentagonalNumber(i)+ " ");
        }


    }

    public static int getPentagonalNumber(int n){

        int pentagonal = n*(3 * n -1)/2;

        return pentagonal;
    }



}

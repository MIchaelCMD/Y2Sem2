public class TestMyMath {

    public static void main(String[] args)
    {
        //Testing findSmallest

        int smallestResult;

        smallestResult= MyMath.findSmallest(10,5,6);
        System.out.println(smallestResult);

        smallestResult = MyMath.findSmallest(18,22,15);
        System.out.println(smallestResult);

        smallestResult = MyMath.findSmallest(12,1,60);
        System.out.println(smallestResult);

        //End of Test for findSmallest


        //Testing myPower

        int powerResult;

        powerResult = MyMath.myPower(2,3);

        if(powerResult != 0)
            System.out.println("\n" + powerResult + "\n");
        else
            System.out.print("\nOne of the values equals 0\n");

        //End of Test for myPower

        //Testing isPrime()

        boolean resultPrime =  MyMath.isPrime(7);

        System.out.println(resultPrime);

        //End of Test for isPrime()


        //Testing myFactorial

        int factResult;

        factResult = MyMath.myFactorial(5);

        System.out.print(factResult);

        //End of Test for myFactorial
    }
}

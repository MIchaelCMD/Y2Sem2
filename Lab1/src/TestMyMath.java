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

        powerResult = MyMath.myPower(4,9);

        if(powerResult != 0)
            System.out.println("\n" + powerResult + "\n");
        else
            System.out.print("\nOne of the values equals 0\n");

        //End of Test for myPower


        //Testing myFactorial

        long factResult;

        factResult = MyMath.myFactorial(4);

        //if(factResult == 0)
          //  System.out.print("Input was equal to 0");
        //else
            System.out.print(factResult);

        //End of Test for myFactorial
    }
}

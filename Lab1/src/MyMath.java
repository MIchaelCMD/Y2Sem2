public class MyMath {

    public static int findSmallest(int x, int y, int z)
    {

        int smallest = 0;

        if(x < y)
            smallest = x;
        else
            smallest = y;

        if(z < smallest)
            smallest = z;

        return smallest;

    }

    public static int myPower(int a, int b)
    {

        int resultPower = 0;

        for (int i = 0; i < b; i++)
        {
            if (a != 0)
            {
                if(b != 0)
                {
                    if (i == 0)
                        resultPower = a;
                    else
                        resultPower = resultPower * a;
                }
                else
                    resultPower = 0;
            }
            else
                resultPower = 0;
        }
        return resultPower;

    }

    public static long myFactorial(int n)
    {

        long nFact = 1;

        for(int i=2;i<n;i++)
        {

            nFact *= i;

        }

        return nFact;

    }
}

import java.util.Random;

public class TestMyArrays {

    public static void main(String[] args) {

        int [] values = new int[10];
        values[0] = 12;
        values[1] = 66;
        values[2] = 78;
        values[3] = 3;
        values[4] = 13;
        values[5] = 56;
        values[6] = 87;
        values[7] = 56;
        values[8] = 45;
        values[9] = 67;

        int currentSize = 5;

        currentSize = MyArrays.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55

        /*for (int i=0; i < currentSize; i++)
            System.out.println(values[i]);
*/

        MyArrays.mergeSort(values);

        /*for(int j=0; j < values.length;j++)
        {
            System.out.println(values[j]);
        }*/

        Random random = new Random();
        final int SIZE = 100000;
        int[] a = new int[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }

        long start = System.currentTimeMillis();
        MyArrays.insertionSort(a);
        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println(duration);

       /* for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }*/


    }


}

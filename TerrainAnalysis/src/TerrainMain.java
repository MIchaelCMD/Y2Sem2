public class TerrainMain
{
    public static void main(String[] args)
    {
        TerrainGrid grid = new TerrainGrid();

       int [][] result = grid.checkPeak();

       for (int[] aResult : result)
       {
           for (int j = 0; j < result[0].length; j++)
           {
               System.out.print(aResult[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

    }
    int peakNumber = TerrainGrid().getPeakNumber()
}

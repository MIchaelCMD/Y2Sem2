public class TerrainGrid {

    int peakNum;

    int elevationArray[][] = {
            {1, 2, 4, 6, 2, 6},
            {3, 6, 2, 8, 6, 3},
            {2, 4, 6, 5, 9, 5},
            {3, 4, 5, 4, 2, 5}
    };

    int peakArray[][] = new int[4][6];

    public int[][] checkPeak()
    {

        for(int i = 1; i < elevationArray.length - 1; i++)
        {
            for (int j = 1; j < elevationArray[0].length - 1; j++) {
                //check if elevationArray[i][j] is a peak
                //Check if elevationArray[i][j] > than elevationArray[][] Above && below && left && right
                if ((elevationArray[i][j] > elevationArray[i - 1][j]) && (elevationArray[i][j] > elevationArray[i + 1][j]) && (elevationArray[i][j] > elevationArray[i][j - 1]) && (elevationArray[i][j] > elevationArray[i][j + 1]))
                {
                    peakArray[i][j] = elevationArray[i][j];
                    peakNum++;
                }

            }
        }

        return peakArray;

    }

    public int getPeakNumber(int peakNum)
    {
       return peakNum;
    }

}

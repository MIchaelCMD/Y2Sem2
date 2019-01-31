public class Encryption {

    public static String encrypt(String plaintext, int numColumns)
    {

        String noSpacesText = "";

        String encryptedString = "";

        String paddedText = "";

        //noSpacesText  = plaintext.replaceAll(" ","");

        for(int i = 0; i < plaintext.length(); i++)
        {
            if(plaintext.charAt(i) != ' ')
            {
                noSpacesText += plaintext.charAt(i);
            }
        }

        int numRows = 0;

        if(noSpacesText.length() % numColumns == 0)
        {
            numRows = noSpacesText.length() / numColumns;
            paddedText = noSpacesText;
        }
        else
        {
            numRows = (noSpacesText.length() / numColumns) + 1;

            int numX = numColumns - (noSpacesText.length() % numColumns);
            System.out.println("Number of X's: " + numX);

            for(int i = 0; i < numX;i++)
            {
                noSpacesText += "x";
                paddedText = noSpacesText;
            }
        }

        String cipherText = "";

        for(int col = 0; col <= (numColumns-1);)
        {
            int index = col;

            for(int row = 0; row <= (numRows-1);)
            {
                cipherText += paddedText.charAt(index);
                index += numColumns;
                row++;
            }

            col++;
        }

        encryptedString = cipherText.toUpperCase();
        System.out.println("Number of Rows: " + numRows);
        return encryptedString;

    } //End of encrypt()

}

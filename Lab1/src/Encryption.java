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
            System.out.println(numX);

            for(int i = 0; i < numX;i++)
            {

                noSpacesText += "x";
                paddedText = noSpacesText;
            }

        }

        System.out.println(numRows);
        return paddedText;

    }

}

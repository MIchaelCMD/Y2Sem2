public class RecursiveTextReverse {

    public static String reverse(String txt)
    {

        if(txt.length() == 0)
        {
            txt = "Empty String!";
            return txt;
        }
        else if(txt.length() == 1)
        {
            return txt;
        }
        else
        {
            return reverse(txt.substring(1)) + txt.charAt(0);
        }

    }

}

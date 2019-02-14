import javax.swing.*;

public class TestRecursiveTextReverse {

    public static void main(String[] args) {

        String reverseResult = RecursiveTextReverse.reverse("This is an extra long message so that one person online will be very happy that it is really a very long message");
        System.out.println(reverseResult);


        String reverseOutput = RecursiveTextReverse.reverse(JOptionPane.showInputDialog("Enter a string to be reversed"));
        JOptionPane.showMessageDialog(null,reverseOutput,"Reversed Message",JOptionPane.INFORMATION_MESSAGE);

    }

}

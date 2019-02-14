import javax.swing.*;

public class TestRecursiveTextReverse {

    public static void main(String[] args) {

        String reverseResult = RecursiveTextReverse.reverse("R");
        System.out.println(reverseResult);


        String reverseOutput = RecursiveTextReverse.reverse(JOptionPane.showInputDialog("Enter a string to be reversed"));
        JOptionPane.showMessageDialog(null,reverseOutput,"Reversed Message",JOptionPane.INFORMATION_MESSAGE);

    }

}

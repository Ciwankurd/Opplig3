package Araay2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        UnikeTall nyarray = new UnikeTall(30);
        nyarray.fyllarray();
        String result = nyarray.formatering();
        JOptionPane.showMessageDialog(null,result);
    }
}

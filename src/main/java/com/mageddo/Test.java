package com.mageddo;

import java.awt.*;

import javax.swing.*;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 5/2/16 11:41 AM
 */
public class Test extends JFrame {

    public Test() throws HeadlessException {
        super("Swing Example app builded on idea with maven 1.0");
        setSize(300, 300);
        setContentPane(new LoginForm().getMainPanel());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        final Test test = new Test();
    }
}

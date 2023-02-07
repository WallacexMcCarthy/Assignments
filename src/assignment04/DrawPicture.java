/**
 * This project is an exploration of the graphics class in java in correlation with JPanel adn JFrame. Here i drew
 * a landscape picture that includes stars, a moon, hills, a big rock, trees as well as houses.
 * This class handles creating the JPanel and JFrame for this project, creating and running it as well.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 31, 2023
 **/

package assignment04;

import javax.swing.*;

public class DrawPicture implements Runnable
{

    @Override
    public void run()
    {

        JFrame frame = new JFrame ("My window.");
        JPanel panel = new PictureLogic();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new DrawPicture());
    }
}

/**
 * This project is an exploration of the graphics class in java in correlation with JPanel adn JFrame. Here i drew
 * a landscape picture that includes stars, a moon, hills, a big rock, trees as well as houses.
 * This class handles all the logic of the picture.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 31, 2023
 **/

package assignment04;

import javax.swing.*;
import java.awt.*;

public class PictureLogic extends JPanel
{
    public void paint(Graphics g)
    {
        setBackground(Color.BLACK);
        drawSky(g);
        drawMoon(g, 0, 0);
        drawLandscape(g);
        drawVillage(g);
    }

    public void drawVillage(Graphics g)
    {
        for(int i = 0; i < 50; i++)
        {
            int randX = (int)(Math.random() * 800);
            int randY = (int)(Math.random() * 300);
            drawHouse(g, randX, 500 + randY);
        }
    }


    public void drawSky(Graphics g)
    {
        for(int i = 0; i < 150; i++)
        {
            int randomB = (int)(Math.random()*57) + 1;
            int randomG = (int)(Math.random()*10) + 1;
            Color color = new Color(252, 220 + randomG, 159 + randomB);
            int randomX = (int) (Math.random()*790);
            int randomY = (int) (Math.random()*450);
            drawSmallerStar(g, randomX, randomY, color);
        }
        for(int i = 0; i < 150; i++)
        {
            int randomB = (int)(Math.random()*57) + 1;
            int randomG = (int)(Math.random()*10) + 1;
            Color color = new Color(252, 220 + randomG, 159 + randomB);
            int randomX = (int) (Math.random()*790);
            int randomY = (int) (Math.random()*450);
            drawSmallStar(g, randomX, randomY, color);
        }
    }

    public void drawSmallStar(Graphics g, int xPoint, int yPoint, Color color)
    {
        g.setColor(color);
        Polygon polygon = new Polygon();
        polygon.addPoint(xPoint, yPoint);
        polygon.addPoint(xPoint + 2, yPoint + 4);
        polygon.addPoint(xPoint + 6, yPoint + 6);
        polygon.addPoint(xPoint + 2, yPoint + 8);
        polygon.addPoint(xPoint, yPoint + 12);
        polygon.addPoint(xPoint - 2, yPoint + 8);
        polygon.addPoint(xPoint - 6, yPoint + 6);
        polygon.addPoint(xPoint - 2, yPoint + 4);
        g.fillPolygon(polygon);
    }

    public void drawSmallerStar(Graphics g, int xPoint, int yPoint, Color color)
    {
        g.setColor(color);
        Polygon polygon = new Polygon();
        polygon.addPoint(xPoint, yPoint);
        polygon.addPoint(xPoint + 1, yPoint + 2);
        polygon.addPoint(xPoint + 3, yPoint + 3);
        polygon.addPoint(xPoint + 1, yPoint + 4);
        polygon.addPoint(xPoint, yPoint + 6);
        polygon.addPoint(xPoint - 1, yPoint + 4);
        polygon.addPoint(xPoint - 3, yPoint + 3);
        polygon.addPoint(xPoint - 1, yPoint + 2);
        g.fillPolygon(polygon);
    }
    public void drawMoon(Graphics g, int startX, int startY)
    {
        g.setColor(Color.WHITE);
        g.fillOval(startX + 20, startY + 20, 40, 40);
        g.setColor(Color.BLACK);
        g.fillOval(startX + 18, startY + 18, 36, 36);
    }

    public void drawSmallTree(Graphics g, int xPoint, int yPoint)
    {
        Color treeColor = new Color(65, 89, 35);
        Color trunkColor = new Color(59, 37, 28);
        Polygon polygon = new Polygon();
        polygon.addPoint(xPoint, yPoint);
        polygon.addPoint(xPoint + 3, yPoint + 15);
        polygon.addPoint(xPoint - 3, yPoint + 15);
        g.setColor(trunkColor);
        g.fillRect(xPoint - 2, yPoint + 15, 4, 4);
        g.setColor(treeColor);
        g.fillPolygon(polygon);
    }

    public  void drawLandscape(Graphics g)
    {
        Color landscapeColor = new Color(53, 64, 35);
        Color rockColor = new Color(92, 94, 94);
        g.setColor(rockColor);
        g.fillOval(700, 200, 200, 800);
        g.setColor(Color.BLACK);
        g.drawOval(700, 200, 200, 800);
        g.setColor(landscapeColor);
        g.fillOval(400, 400, 600, 600);
        g.setColor(Color.BLACK);
        g.drawOval(400, 400, 600, 600);
        g.setColor(landscapeColor);
        g.fillOval(200, 450, 700, 600);
        g.setColor(Color.BLACK);
        g.drawOval(200, 450, 700, 600);
        g.setColor(landscapeColor);
        g.fillOval(-200, 400, 700, 600);
        g.setColor(Color.BLACK);
        g.drawOval(-200, 400, 700, 600);

        for(int i = 0; i < 300; i++)
        {
            int x = (int)(Math.random() * 800);
            int y = (int)(Math.random() * 400);
            g.drawLine(x, 400 + y, x + 2, 400 + y + 2);
        }
        for(int i = 0; i < 300; i++)
        {
            int x = (int)(Math.random() * 800);
            int y = (int)(Math.random() * 430);
            if((x >= 280 && x <= 600) && (y + 400 <= 460))
            {
            }else
            {
                drawSmallTree(g, x, 420 + y);
            }
        }
    }
    public void drawHouse(Graphics g, int x, int y)
    {
        Color houseColor = new Color(77, 49, 38);
        Color roofColor = new Color(86, 93, 94);
        Color chimneyLowColor = new Color(96, 101, 102);
        Color chimneyHighColor = new Color(75, 78, 79);
        Color windowColor = new Color(215, 216, 217);
        Color doorColor = new Color(61, 44, 36);
        g.setColor(houseColor);
        g.fillRect(x, y, 15, 15);
        Polygon polygon = new Polygon();
        polygon.addPoint(x - 2, y);
        polygon.addPoint(x + 7,y - 5);
        polygon.addPoint(x + 17, y);
        g.setColor(chimneyLowColor);
        g.fillRect(x + 11, y - 6, 2, 6);
        g.setColor(chimneyHighColor);
        g.fillRect(x + 10, y - 6, 3, 1);
        g.setColor(roofColor);
        g.fillPolygon(polygon);
        g.setColor(windowColor);
        g.fillRect(x + 3, y + 3, 3, 3);
        g.fillRect(x + 9, y + 3, 3, 3);
        g.setColor(doorColor);
        g.fillRect(x + 4, y + 9, 3, 5);
        g.setColor(Color.BLACK);
        g.drawRect(x + 4, y + 9, 3, 5);
        g.setColor(doorColor);
        g.fillRect(x + 7, y + 9, 3, 5);
        g.setColor(Color.BLACK);
        g.drawRect(x + 7, y + 9, 3, 5);
    }



    public Dimension getMinimumSize()
    {
        return new Dimension(800, 800);
    }

    public Dimension getMaximumSize()
    {
        return new Dimension(800, 800);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 800);
    }

}

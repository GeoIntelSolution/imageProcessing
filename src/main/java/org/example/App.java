package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        5/33.943/111.797
//        此经纬度对应的code
        int level=5;
//        double longitude =111.797;
//        double latitude = 33.943;
        double longitude =12445185.11;
        double latitude = 4021150.88;
        int counter =1<<level;
        double  delta_x=20026376.39*2/counter;
        double  delta_y=20048966.10*2/counter;
        System.out.println(counter+","+delta_x+","+delta_y);
        int rowCode= (int) Math.ceil((20037508.34+longitude)/delta_x);
        System.out.println(rowCode);
        int colCode = (int) Math.ceil((20048966.10-latitude) / delta_y);
        System.out.println(colCode);
    }
}

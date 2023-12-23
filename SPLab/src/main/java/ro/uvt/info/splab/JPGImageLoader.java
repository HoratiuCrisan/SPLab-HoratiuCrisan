package ro.uvt.info.splab;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class JPGImage implements ImageLoader{

    @Override
    public BufferedImage load(String url) {
        try {
            // Load image from URL
            URL imageUrl = new URL(url);
            BufferedImage image = ImageIO.read(imageUrl);

            // Display the image in a JFrame
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


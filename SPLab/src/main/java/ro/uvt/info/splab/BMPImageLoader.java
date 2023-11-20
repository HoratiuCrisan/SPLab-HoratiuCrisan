package ro.uvt.info.splab;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BMPImageLoader implements ImageLoader{
    @Override
    public BufferedImage load(String url) {
        if (url.contains(".bmp"))
            return null;
        if (isValidURL(url)) {
            try {
                URL new_url = new URL(url);
                BufferedImage myPicture = ImageIO.read(new_url);
                return myPicture;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    private static boolean isValidURL(String urlString) {
        try {
            new URL(urlString).toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

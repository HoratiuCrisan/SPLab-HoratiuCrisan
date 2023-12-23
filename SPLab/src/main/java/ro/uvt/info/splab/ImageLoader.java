package ro.uvt.info.splab;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageLoader {
    public BufferedImage load(String url) throws IOException;
}

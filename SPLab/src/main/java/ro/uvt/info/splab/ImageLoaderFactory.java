package ro.uvt.info.splab;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class ImageFactory {
    public void create(String url) throws Exception {
        if (url.contains(".bmp"))
            displayImage(new BMPImage().load(url));
        else if (url.contains(".png"))
            displayImage(new PNGImage().load(url));
        else if (url.contains(".jpg"))
            displayImage(new JPGImage().load(url));
        else
            throw new Exception("Unsupported image type !");
    }

    private void displayImage(BufferedImage image) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an ImageIcon from the Image
        ImageIcon icon = new ImageIcon(image);

        // Create a JLabel to display the ImageIcon
        JLabel label = new JLabel(icon);

        // Add the JLabel to the JFrame
        frame.getContentPane().add(label);

        // Set JFrame properties
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the JFrame
        frame.setVisible(true);
    }
}

}

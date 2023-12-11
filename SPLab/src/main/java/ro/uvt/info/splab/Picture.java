package ro.uvt.info.splab;

import java.awt.*;

public interface Picture {
    public String url() throws Exception;
    public Dimension dim() throws Exception;
    public String content() throws Exception;
}
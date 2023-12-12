package ro.uvt.info.splab;

import java.io.IOException;

public interface Visitee {
    public void accept(Visitor visitor) throws IOException;
}

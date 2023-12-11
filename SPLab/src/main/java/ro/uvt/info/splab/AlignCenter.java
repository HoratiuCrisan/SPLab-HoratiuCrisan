package ro.uvt.info.splab;

public class AlignCenter implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + 20 + "s", paragraph);
    }
}

package ro.uvt.info.splab;

public class AlignRight implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + 40 + "s", paragraph);
    }
}

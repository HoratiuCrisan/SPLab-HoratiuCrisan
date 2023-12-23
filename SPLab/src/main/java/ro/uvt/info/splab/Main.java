package ro.uvt.info.splab;

public class Main {
    public static void main(String[] args) throws Exception{
        Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		ImageProxy i = new ImageProxy("https://fileinfo.com/img/ss/xl/bmp_13.png");
		ImageProxy ii = new ImageProxy("https://people.math.sc.edu/Burkardt/data/bmp/bmp_24.bmp");
		cap1.add(i);
		cap1.add(ii);
		cap1.print();
    }

}

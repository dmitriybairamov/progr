// osnovi nasledovania

class TwoDShape {
	private double width;
	private double height;
	//konstryktor bez parametrov
	TwoDShape() {
		width = height = 0.0;
	}
	//konstruktor s 2 parametrami
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	//konstryktor object s odinak w and h
	TwoDShape(double x) {
		width = height = x;
	}

	void showDim() {
		System.out.println("Shirina and visota" + width + " and " + height);
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if (w>200)
			width = 200;
		else width = w;
	}
	void setHeight (double h) {
		if (h > 290)
			height = 290;
		else
			height = h;
	}
}

class Triangle extends TwoDShape {
	String style;
	
	//konstryktor po umolcaniyou
	Triangle() {
		super();
		style = "otsytstvyet";
	}
	//konstruktor
	Triangle(String s, double w, double h) {
		// vizov konstyktora super classa
		super(w, h);
		//ystanovka znachenia dlya peremennoi podklassa
		style = s;
	}
	//kostryktor s 1 parametrom
	Triangle(double x) {
		super(x);
		style = "zakrashenniy";
	}

	double area() {
		return getWidth()*getHeight()/2;
	}

	void showStyle() {
		System.out.println("Style: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;
	
	//konstrutori
	Rectangle() {
		super();
		outline = "otsytstvyet";
	}

	Rectangle (double x) {
		super(x);
		outline = "sploshnaya";
	}
	Rectangle(String o, double w, double h) {
		// vizov konstryktora super classa
		super(w, h);
		//ystanovka znachenia dlya peremennoi podklassa
		outline=o;
	}

	double area() {
		return getWidth() * getHeight();
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	void showOutline() {
                System.out.println("Ramka: " + outline);
        }

}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("konturniy", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Rectangle r1 = new Rectangle("sploshnaya", 4.0, 4.0);
		Rectangle r2 = new Rectangle(5.0);
/*		
		t1.setWidth (4.0);
		t1.setHeight (4.0);
		t1.style = "zakrashenni";
		t2.setWidth (8.0);
        	t2.setHeight (12.0);
        	t2.style = "kontyrni";
		r1.setWidth (4.0);
		r1.setHeight (4.0);
		r1.outline = "sploshnaya";
		r2.setWidth (8.0);
                r2.setHeight (12.0);
                r2.outline = "punktirnaya";
*/
		t1 = t2;

		System.out.println("Info about t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("S: " + t1.area());
		System.out.println();

		System.out.println("Info about t2: ");
		t2.showStyle();
        	t2.showDim();
		System.out.println("S: " + t2.area());
                System.out.println();

		System.out.println("Info about t3: ");
                t3.showStyle();
                t3.showDim();
        	System.out.println("S: " + t3.area());
        	System.out.println();

		System.out.println("Info about r1: ");
                r1.showOutline();
                r1.showDim();
		if (r1.isSquare())
			System.out.println("Yavlyaetsa kvadratom");
		else
			System.out.println("NE yavlyaetsa kvadratom");
                System.out.println("S: " + r1.area());
                System.out.println();
		System.out.println("Info about r2: ");
                r2.showOutline();
                r2.showDim();
                if (r2.isSquare())
                        System.out.println("Yavlyaetsa kvadratom");
                else
                        System.out.println("NE yavlyaetsa kvadratom");
                System.out.println("S: " + r2.area());
                System.out.println();
	}
}

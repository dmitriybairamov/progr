// osnovi nasledovania

class TwoDShape {
	double width;
	double height;
	void showDim() {
		System.out.println("Shirina and visota" + width + " and " + height);
	}
}

class Triangle extends TwoDShape {
	String style;
	double area() {
		return width*height/2;
	}

	void showStyle() {
		System.out.println("Style: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;

	double area() {
		return width * height;
	}
	boolean isSquare() {
		if(width == height) return true;
		return false;
	}
	void showOutline() {
                System.out.println("Ramka: " + outline);
        }

}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "zakrashenni";
		t2.width = 8.0;
        	t2.height = 12.0;
        	t2.style = "kontyrni";
		r1.width = 4.0;
		r1.height = 4.0;
		r1.outline = "sploshnaya";
		r2.width = 8.0;
                r2.height = 12.0;
                r2.outline = "punktirnaya";
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

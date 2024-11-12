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

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "zakrashenni";
		t2.width = 8.0;
        	t2.height = 12.0;
        	t2.style = "kontyrni";
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
	}
}

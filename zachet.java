class checks {
	public void dvigatel() {
		System.out.println("Y mashini est dvigatel");
	}
}

class BMW extends checks {
	public void dvigatel() {
		System.out.println("Dvigatel V8!!");
	}
}

class Volvo extends checks {
	public void dvigatel() {
		System.out.println("Dvigatel V4!!");
	}
}

class detection{
	public static void main (String[] args) {
		checks auto = new checks();
		checks BMW = new BMW();
		checks Volvo = new Volvo();
		
		auto = BMW;

		auto.dvigatel();
		auto = Volvo;
		auto.dvigatel();
	}
}

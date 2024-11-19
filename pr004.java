class Avtomobil {
	private int pass;
	private int v;
	private double rash;

	void rasst() {
		System.out.println("Rasstoyanie na polnom bake: " + ((int)(v/rash *100)));
	}
	int rasst2() {
		return (int)(v/rash *100);
	}

	double fuelNeeded (int km) {
		return ((double)(km/100))*rash; 
	}	

	//metodi dostypa k peremennim ekzemplyara
	int getPass() {
		return pass;
	}
	void setPass(int p) {
		pass = p;
	}
	int getV() {
		return v;
	}
	void setV(int V) {
		v = V;
	}
	double getRash() {
		return rash;
	}
	void setRash(double r) {
		rash = r;
	}
}

class pr004 {
	public static void main (String args[]) {
	Avtomobil lada = new Avtomobil();
	Avtomobil porsche = new Avtomobil();
			int rasst, rasst2;
	
	lada.pass = 4;
	lada.v = 40;
	lada.rash = 5.5;

	porsche.pass = 1;
	porsche.v = 100;
	porsche.rash = 14.0;

	System.out.println("Lada fuelneeded: " + lada.fuelNeeded(10));

	System.out.println("Dlya lada: ");
	lada.rasst();
	rasst = lada.rasst2();
	System.out.println("Result rasst2: " + rasst);
	
	System.out.println("Dlya porsche: ");
	porsche.rasst();
	System.out.println("Result rasst2: " + porsche.rasst(10));










	}
}

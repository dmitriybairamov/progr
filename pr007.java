// ypravlenie dostypom k chlenam klassa
class Mod {
	private int alpha; // closed peremennaya
                public int beta; // opened peremennaya
                int gamma;// peremennaya s dostypom po ymolchaniyou
                void setAlpha(int a) {
                        alpha = a;
                }
                int getAlpha() {
                        return alpha;
                }
}
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOk(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOk(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	private boolean indexOk(int index) {
		if(index >= 0 & index < length)
			return true;
		return false;
	}
}
class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		// izmenenie and prosmotr closed peremennoiosyshestv cherez metods iz Mod
		ob.setAlpha(77);
		System.out.println("znachenie ob.alpha: " + ob.getAlpha());
		// priamoi dostyp k peremennoi zaprewen: ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;

		// primer ispolzovania klassa otkaza ustoichevogo povedenia massiva
		System.out.println();
		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;
		// primer raboti klassa bez vivoda soobsheniy o neprav indeksax
		
		System.out.println("Skritaya ot polzovatelia obrabotka oshibok: ");
		for(int i=0; i<(fs.length * 2); i++)
			fs.put(i, i*10);
		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.print(x + " ");
		}
		System.out.println();

		// primer raboti klassa s vivodom soobsheniy ob oshibkax
		
		for (int i=0; i<(fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.print("Index" + " vixodit za granitsi massiva");

		for(int i=0; i < (fs.length * 2); i++) {
                        x = fs.get(i);
                        if(x != -999) System.out.print(x + " ");
                	else
				System.out.println("Index" + i + " vixodit za granitsi massiva");
		}
		System.out.println();


	}
}

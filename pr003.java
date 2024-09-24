class pr003 {
	public static void main(String args[]) throws java.io.IOException {

		// chtenie s klavatyri
		char ch;
		System.out.print("Nazhmite klavishy na klaviatyre and ENTER");
		ch = (char) System.in.read();
		System.out.println("Vi nazhali klavishy: " + ch);

		// operatorator cycle for

		System.out.println ("\n");
		double num, sroot, rerr;

		for (num=1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println ("Kvadratnii koren chisli " + num + " raven " + sroot);
			// vichslenie oshibki okryglenia
			rerr = num - (sroot * sroot);
			System.out.println ("Oshibkaokryglenia sostavliaet " + rerr);
			System.out.println();
		}

		int x1;

		for (x1 = 100; x1 > -100; x1 -= 5)
			System.out.println (x1);

		System.out.println("\n");

		int i7, j7;
		for (i7 = 0, j7 = 10; i7 < j7; i7++, j7--)
			System.out.println("i7 and j7: " + i7 + " " + j7);
		
		System.out.println ("\n");

		int i8;
		System.out.println ("Dlya ostanovki cycle najmite klavishy \"S\"");
		for (i8 = 0; (char) System.in.read() != 'S'; i8++)
			System.out.println("Iteration №" + i8);

		System.out.println ("\n");
		for (i8 = 0; i8 < 10;) {
			System.out.println ("Iteration №" + i8);
			i8++;
		}	
		
		System.out.println ("\n");
		for (; i8 < 20;) {
			System.out.println ("Iteration №" + i8);
                        i8++;
		}
		
		//beskonechnii cycle
		// System.out.println ("\n");
		// for (;;);
		
		System.out.println ("\n");
		int sum = 0;
		// vichislenie summ chisel ot 1 do 5
		for (i8 = 1; i8 <=5; sum += i8++);
		System.out.println("Summa chisel ravna " + sum);


	}
}

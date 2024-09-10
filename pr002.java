class pr002 {
        public static void main(String args[]) {
		byte b, bb, bbb; // 8-bit peremennaya
		short s, ss, sss; // 16-bit peremennaya
		int i, ii, I; // 32- bit peremennaya
		long l, ll, L;	// 64-bit peremennaya
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb = sss; avtopreobrazovanie zapreweno tak kak mojet privesti k potere dannyx
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// primer ispolzovaniya razlichnix celyx tipov 
		ii = 700000; // storona kyba v millimetrax
		int V = ii*ii*ii; // obyem kyba
		long VV = (long)ii*ii*ii;
		System.out.println(VV);
		
		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);

		//simvolniy tip
		System.out.println("PRIMERI ISPOLZOVANOYA SYMBOL TYPE \n");
		char ch;
		ch = 'D';
		System.out.println("Znachenie ch: " + ch);
		ch++;
		System.out.println("novoe znachenie ch: " + ch); 
		ch = 97;
		System.out.println("Znachenie ch s kodom 97: " + ch); 
		I = (int)ch;
		System.out.println("kode ch: " + I); 
		ch = 'А';
		for (i=0; i<63; i++) {
			I = (int)ch;
			System.out.print("kod simvola " + ch + ": " + I + " \n");
			ch++;
			}

		//logicheskiy type dannix
		System.out.println ("PRIMERI ISPOLZOVANIYA LOGICHESKOGO TYPE\n");
		boolean ligm;
		ligm = false;
		System.out.println("znachenie ligm: " + ligm);
		ligm = true;
		System.out.println("znachenie ligm: " + ligm);
		if(ligm) System.out.println("vivodim stroky, esli \"ligm\" true");
		if(!ligm) System.out.println("vivodim stroky, esli inversia \"ligm\" true");
		ligm = ch=='я';
		if(ligm) 
			System.out.println("Symbol ch raven \"я\""); 


	}
}

class pr006 {
	public static void main(String[] args) {

		// sbros 6 bita v kodirovke symvola 
		char ch;
		for (int i = 0; i < 26; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			ch = (char) ((int) ch & 65503);

			System.out.print(ch + " ");
		}
		System.out.println();

		// otobrajenie bite predstav chisla
		System.out.println();
		int t;
		byte val;
		val = (byte) 'A';
		for (t = 128; t > 0; t = t/2) {
			if((val&t) != 0) System.out.print(" 1 ");
			else System.out.print("0 ");
		}
		System.out.println();

		//ystanovlenie 6 buta v kodirovke simbolov
		System.out.println();

		for (int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			ch = (char) ((int) ch | 32);

			System.out.print(ch + " ");
		}

		//primitivnoe shifrovanie 
		System.out.println();
		String msg = "Usxodnaya test stroka";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.print ("Nezashifrov soobshenie: ");
		System.out.println(msg);

		//shifrovanie soobshenia:
		for (int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		System.out.print("Zashifrovannoe soobshenie: ");
		System.out.print(encmsg);

		//deshifrovka soobshenia
		for (int i  = 0; i < msg.length(); i++)
			decmsg = encmsg + (char) (msg.charAt(i) ^ key);
		System.out.print("Deshifrovannoe soobshenie: ");
		System.out.print(decmsg);

		// operation pobitovogo HE
		System.out.println();
		byte b = -34;
		for (int t1=128; t1>0; t1=t1/2) {
			if ((b&t1) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();

		b = (byte) ~b;
		System.out.println(b);

		for(int t1 = 128; t1 > 0; t1 =t1/2) {
			if ((b & t1) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();

		// sdvigovie bitovie operations
		System.out.println();
		int v = 1;
		for (int i=0; i < 8; i++) {
			for(int t1 = 128; t1 > 0; t1 =t1/2) {
                        	if ((v & t1) != 0)
                                	System.out.print("1 ");
                        	else
                                	System.out.print("0 ");
                	}
	            	System.out.println();
			v = v << 1;
		}
		System.out.println();
		v = 128;
		for (int i=0; i < 8; i++) {
                        for(int t1 = 128; t1 > 0; t1 =t1/2) {
                                if ((v & t1) != 0)
                                        System.out.print("1 ");
                                else
                                        System.out.print("0 ");
                        }
                        System.out.println();
                        v = v >> 1;
                }

	}
}
		

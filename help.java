class help {
        public static void main(String args[]) throws java.io.IOException {
                char choice, ignore;
		do {
			System.out.println("Справка по операторам: ");
                	System.out.println(" 1. if");
                	System.out.println(" 2. switch");
			System.out.println(" 3. for ");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
                	System.out.println(" Выберите номер раздела: ");
                	choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while (choice < '1' | choice > '5');

                System.out.println("\n");
                switch(choice) {
                        case '1':
                                System.out.println("Оператор if:\n");
                                System.out.println("if(условие) оператор;");
                                System.out.println("else оператор, ");
                                break;
                        case '2':
                                System.out.println("Оператор switch:\n");
                                System.out.println("switch(выражение) {");
                                System.out.println(" case константа:");
                                System.out.println(" последовательность операторов");
                                System.out.println(" break;");
                                System.out.println(" ... ");
                                System.out.println("} ");
                                break;
			case '3':
				System.out.println("cycle for:\n");
                                System.out.println("for(inicialize; uslovie; iterration) ");
                                System.out.println("operator");
				break;
			case '4':
				System.out.println("cycle while:\n");
                                System.out.println("while (uslovie) operator ");
				break;
			case '5':
				System.out.println("cycle do-while:\n");
                                System.out.println("do { ");
                                System.out.println(" operator: ");
				System.out.println("while (uslovie)");
				break;
                
        	
		}
        }
}
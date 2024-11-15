//рекурсия
class Factorial {
        int factR(int n) {
                int result;

                if(n==1) return 1;
                result = factR(n-1) * n;
                return result;
        }

        int factI(int n) {
                int t, result;
                result = 1;
                for(t=1; t<=n; t++)
                        result *= t;
                return result;
        }
}

//статические переменные
class StaticDemo {
        int x;
        static int y;
        int sum() {
                return x + y;
        }
}

class StaticBlock {
        static double rootOf2;
        static double rootOf3;
        static {
                System.out.println("внутри статического блока");
                rootOf2 = Math.sqrt(2.0);
                rootOf3 = Math.sqrt(3.0);
        }
        StaticBlock(String msg) {
                System.out.println(msg);

        }
}
class Outer {
	int[] nums;
	Outer(int[] n) {
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();
		System.out.println("minimalnoe znachenie: " + inOb.min());
		System.out.println("Max znachenie: " + inOb.max());
		System.out.println("Srednee znachenie: " + inOb.avg());
	}

	// vnytrennii klass
	class Inner {
		int min() {
			int m = nums[0];
			for(int i=1; i<nums.length; i++)
				if(nums[i] < m) m = nums[i];
			return m;
		}
		int max() {
                        int m = nums[0];
                        for(int i=1; i<nums.length; i++)
                                if(nums[i] > m) m = nums[i];
                        return m;
                }
		int avg() {
                        int a = 0;
                        for(int i=0; i<nums.length; i++)
                                a += nums[i];
                        return a/nums.length;
                }

	}
}


class VarArgs {
	static void vaTest(int ... v ) {
		System.out.println("Kolvo args: " + v.length);
		System.out.println("Soderjimoe args: ");
		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		System.out.println();
	}
	static void vaTest2(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.println("Soderjimoe args: ");
                for (int i = 0; i < v.length; i++)
                        System.out.println(" arg " + i + ": " + v[i]);
                System.out.println();
	}
}
class pr008 {
        public static void main(String[] args) {

                Factorial f = new Factorial();

                System.out.println("вычисление факторияала рекурсивным методом");
                System.out.println("факторияал 3 равен " + f.factR(3));
                System.out.println("факториал 4 равен " + f.factR(4));
                System.out.println("фактоияал 5 равен " + f.factR(5));

                System.out.println();

                System.out.println("вычисление факторияала рекурсивным методом");
                System.out.println("факторияал 3 равен " + f.factI(3));
                System.out.println("факториал 4 равен " + f.factI(4));
                System.out.println("фактоияал 5 равен " + f.factI(5));

                //демонтрация использования статической переменной
                StaticDemo ob1 = new StaticDemo();
                StaticDemo ob2 = new StaticDemo();

                ob1.x = 10;
                ob2.x = 20;

                System.out.println("ob1.x and ob2.x независимы друг от друга");
                System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);

                System.out.println();

                System.out.println("статистическая переменная у является общей");
                StaticDemo.y = 19;
                System.out.println("для у=19");

                System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());

                StaticDemo.y = 100;
                System.out.println("для у=100");
                System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());

                //демонстрация работы статистического блока
                System.out.println();
                StaticBlock ob = new StaticBlock("Внктри конструктора");

                System.out.println("квадратный корень из 2: " + StaticBlock.rootOf2);
                System.out.println("квадратный корень из 3: " + StaticBlock.rootOf3);

		//demonstacia raboti vnytr classa
		int[] x = { 3, 2, 1, 5, 6, 9, 7, 2};
		Outer outOb = new Outer (x);

		outOb.analyze();

		class ShowBt {
			int numbits;
			ShowBt (int n) {
				numbits = n;
			}
			void show(long val) {
				long mask = 1;
				mask <<= numbits-1;
				int spacer = 0;
				for(;mask!=0; mask>>>=1) {
					if ((val & mask) != 0)
						System.out.print("1");
					else
						System.out.print("0");
					spacer++;
					if((spacer%8)==0) {
						System.out.print(" ");
						spacer = 0;
					}
				}
			System.out.println();
			}
		}
		System.out.println();
		for (byte b=0; b<10; b++) {
			ShowBt byteval = new ShowBt(8);
			System.out.print(b + " v dvoichnom vide: ");
			byteval.show(b);
		}
        	System.out.println();

		//demonstr vizova metoda s premenn kolvom args

		VarArgs.vaTest(10);
		VarArgs.vaTest(1, 2, 3);
		VarArgs.vaTest();

		System.out.println();
		VarArgs.vaTest("Odin argyment: ", 10);
                VarArgs.vaTest("dva argymenta: ", 1, 2, 3);
                VarArgs.vaTest("bez args");
	}
}

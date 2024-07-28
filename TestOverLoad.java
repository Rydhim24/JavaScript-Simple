package Test;

public class TestOverLoad {
	//overloading as there are 2 methods with same name but different parameters
		public void add() {
			int a,b,c;
			a=10;
			b=20;
			c=a+b;
			System.out.println(c);
		}
		public void add(int x) {
			int a,b,c;
			a=10;
			b=20;
			c=x+b;
			System.out.println(c);
		}
	}



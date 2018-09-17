package br.com.cursojava;

public class OperadoresCompostos {
	
	public static void main(String[] args) {
//		
//		+=
//		-=
//		*=
//		/=
//		%=
				

	System.out.println("//////////// ( +=) //////////");
	int num1 = 10;
	int num2 = 5;
	System.out.println(num1 += num2);
	

	System.out.println("//////////// ( -=) //////////");
	int num3 = 10;
	int num4 = 5;
	System.out.println(num3 -= num4);
	

	System.out.println("//////////// ( *=) //////////");
	int num5 = 10;
	int num6 = 5;
	System.out.println(num5 *= num6);
	
	System.out.println("//////////// ( /=) //////////");
	int num7 = 10;
	int num8 = 5;
	System.out.println(num7 /= num8);
	
	System.out.println("//////////// ( *=) primeiro resolve depois //////////");
	int num9 = 10;
	System.out.println(num9 *= 8 + 2);
	
	System.out.println("//////////// ( %=) //////////");
	int num11 = 10;
	int num12 = 5;
	System.out.println(num11 %= num12);
		
	}

	

}

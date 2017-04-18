public class Assgn2 {
	public static void main(String args[]) {
		int a = 20;
		int b = 10;
		int c =0, d =0, e = 0;
		System.out.println("Value of a is "+a);
		b = a-- - --a;
		System.out.println("The value of b=a-- - --aa is :" +b +". Value of a after this operation is " +a);
		c = a--;
		System.out.println("The value of c=a-- is :" +c +". The value of a after this operation is "+a);
		d=a>>2;
		System.out.println("The value of d when d=a>>2 is "+d +". The value of a after this operation is "+a);
		System.out.println("Value of a is "+a +" and b is "+b);
		e=a&b;
		System.out.println("The value of e when e=a&b is "+e);
	}	
}
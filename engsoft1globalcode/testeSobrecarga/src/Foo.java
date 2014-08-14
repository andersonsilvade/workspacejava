
public class Foo {

	
	public static void main(String[] args) {
		
		Foo foo = new Foo();
		short s1 = 123;
		short s2 = 456;
		 foo.metodo(s1,s2);
		

	}

	public void metodo(int... parametro){
		System.out.println("variais");
	}
	public void metodo(int a,int b){
		System.out.println("int   int");
	}
	public void metodo(int a ,long b){
		System.out.println("int long");
	}
	public void metodo(long x,int y){
		System.out.println("long  int");
	}
}

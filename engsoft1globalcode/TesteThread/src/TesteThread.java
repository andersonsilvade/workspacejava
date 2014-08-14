
public class TesteThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread m1 = new MyThread(1);
		MyThread m2 = new MyThread(2);
		MyThread m3 = new MyThread(3);
		
		m1.start();
		m2.start();
		m3.start();
		

	}

}

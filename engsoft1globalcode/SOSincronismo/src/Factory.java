import java.nio.Buffer;


public class Factory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoundeBuffer buffer = new BoundeBuffer();
		
		Thread producer = new Thread(new Producer(buffer));
		Thread consumer = new Thread(new Consumer(buffer));
		
		producer.start();
		consumer.start();

	}

}

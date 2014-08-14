import java.nio.Buffer;
import java.util.Date;


public class Producer implements Runnable{
	private BoundeBuffer buffer;

	public Producer(BoundeBuffer buffer) {
		
		this.buffer = buffer;
	}
	public void run(){
		Date message;
		while(true){
			Object SleepUtilties;
			 SleepUtilties.nap();
			message = new Date();
			 buffer.Insert(message);
		}
	}
	
	

}

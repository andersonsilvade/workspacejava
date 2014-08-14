import java.nio.Buffer;
import java.util.Date;
import java.lang.*;


public class Consumer implements Runnable{
	
	private BoundeBuffer buffer;

	public Consumer(BoundeBuffer buffer) {
	
		this.buffer = buffer;
	}
	
	public void run(){
		
		Date message;
		
		while(true){
			
			SleepUtilities.nap();
			
			message = (Date)buffer.remove();
		}
	}
	

}

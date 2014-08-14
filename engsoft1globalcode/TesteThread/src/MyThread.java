
public class MyThread extends Thread {
	
	private int id;
	int x = 10;
	
	public MyThread(int id){
		this.id = id;
	}
	public void run(){
		for (int i = 0 ;i < x;i++){
			
			if (i == x-1){
				System.out.println("Thread "+ id +" cheguei ao final");
			}else{
				System.out.println("Thread "+  id + "  interação " +i );
				
			}
		}
	}

}

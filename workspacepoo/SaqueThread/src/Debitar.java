
public class Debitar extends Thread {
	 Saque s = new Saque();
	 @Override
	 public void run(){
		 for(int i = 0 ;i < 10;i++){
			 System.out.println("debitando 50");
		 s.sacar(-50);
		 }
	 }

}

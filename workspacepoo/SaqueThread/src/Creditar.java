
public class Creditar extends Thread{
	 Saque s = new Saque();
	 @Override
	 public void run(){
		 for(int i = 0 ;i < 10;i++){
			 System.out.println("creditando 100");
		 s.sacar(100);
		 }
	 }

}

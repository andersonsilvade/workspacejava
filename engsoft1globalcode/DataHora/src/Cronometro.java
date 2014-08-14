
public class Cronometro {
	 private long begin, end;
	 
	    public void start(){
	        begin = System.currentTimeMillis();
	    }
	 
	    public void stop(){
	        end = System.currentTimeMillis();
	    }
	 
	    public long getTime() {
	        return end-begin;
	    }
	 
	    public long getMilliseconds() {
	        return end-begin;
	    }
	 
	    public double getSeconds() {
	        return (begin - end) / 1000.0;
	    }
	 
	    public double getMinutes() {
	        return (begin - end) / 60000.0;
	    }
	 
	    public double getHours() {
	        return (begin - end) / 3600000.0;
	    }
	 
	    public static void main(String[] arg) {
	        Cronometro ch = new Cronometro();
	        while(true){
	        ch.start();
	       /* for (int i = 1;i<10000000;i++) {}
	        ch.stop();*/
	        
	        System.out.println(ch.getTime());
	        }
	       /* ch.start();
	        for (int i = 10000000;i>0;i--) {}
	        ch.stop();
	        System.out.println(ch.getTime());*/
	    }
	}



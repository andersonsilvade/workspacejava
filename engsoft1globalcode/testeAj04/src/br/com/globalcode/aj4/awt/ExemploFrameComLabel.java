package br.com.globalcode.aj4.awt;

import java.awt.Frame;
import java.awt.Label;

public class ExemploFrameComLabel extends Frame {
	
	public ExemploFrameComLabel(String titulo){
        setTitle(titulo);
		
		setSize(500,250);
		
		setVisible(true);
		
		Label prim = new Label("Label");
		
		add(prim);
		
	}

	public static void main(String[] args) {
		
		ExemploFrameComLabel janela = new ExemploFrameComLabel("TITULO");

	}

}

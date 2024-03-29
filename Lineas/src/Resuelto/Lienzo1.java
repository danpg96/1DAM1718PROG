package Resuelto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;

public class Lienzo1 extends JPanel implements ComponentListener {

	int n;
	double dx;
	double dy;
	
	public Lienzo1(int ancho, int alto, int numLineas) {
		addComponentListener(this);
		setPreferredSize(new Dimension(ancho, alto));
		n = numLineas + 1;
		dx = (double) ancho / (double) n;
		dy = (double) alto / (double) n;
	}
	
	public void setNumeroLineas(int numLineas) {
		n = numLineas + 1;
		dx = (double) getWidth() / (double) n;
		dy = (double) getHeight() / (double) n;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		
		for(int i=1; i<n; i++) {
			int x1 = (int) (dx * (n - i));
			int x2 = (int) (dx * i);
			int y = (int) (dy * i);
			g.drawLine(0, 0, x1 , y);
			g.drawLine(getWidth() - 1, getHeight() - 1, x1, y);
			g.drawLine(getWidth() - 1, 0, x2, y);
			g.drawLine(0, getHeight() - 1, x2, y);
		}
	}

	@Override
	public void componentHidden(ComponentEvent arg0) { //cuando minimizamos
		
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) { //cuando cambiamos la ventana de posicion
		
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) { // cuando cambia de tama�o
		dx = (double) getWidth() / (double) n;
		dy = (double) getHeight() / (double) n;
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) { // cuando la ventana se hace visible
		
		
	}
	
}


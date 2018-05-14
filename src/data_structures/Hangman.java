package data_structures;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener {

	public static void main(String[] args) {
		Hangman Hg = new Hangman();

	}
	Hangman(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Lives");
		frame.add(panel);
		panel.add(label1);
		frame.setVisible(true);
		frame.setSize(800, 500);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}

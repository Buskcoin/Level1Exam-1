import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorButtons implements MouseListener {
	public static void main(String[] args) {
		MouseEvent MouseEvent;
		ColorButtons nag = new ColorButtons(MouseEvent);
	}


	ColorButtons(MouseEvent MouseEvent) {
		JFrame jframe = new JFrame();
		JButton redbutton = new JButton();
		JButton greenbutton = new JButton();
		JButton yellowbutton = new JButton();
		JButton bluebutton = new JButton();
		JPanel jpanel = new JPanel();
		jframe.setVisible(true);
		jframe.setSize(500, 500);
		jframe.add(jpanel);
		jpanel.add(redbutton);
		jpanel.add(greenbutton);
		jpanel.add(yellowbutton);
		jpanel.add(bluebutton);
		redbutton.setBackground(Color.RED);
		redbutton.setOpaque(true);
		greenbutton.setBackground(Color.GREEN);
		greenbutton.setOpaque(true);
		bluebutton.setBackground(Color.BLUE);
		bluebutton.setOpaque(true);
		yellowbutton.setBackground(Color.YELLOW);
		yellowbutton.setOpaque(true);
		mousePressed(MouseEvent);
		}
	
		void speak(String words) {
		try {
			Runtime.getRuntime().exec("say" + words);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
		
}

		
		public void mousePressed(MouseEvent e, yellowbutton, greenbutton, redbutton, bluebutton) {
			e.getSource();	
			if((yellowbutton=e.getSource())) {
				speak("yellow");
			}
			else if(greenbutton=e.getSource()){
				speak("green");
			}
			else if(redbutton=e.getSource()) {
				speak("red");
			}
			else if(bluebutton=e.getSource()) {
				speak("blue");
			}
			
		}

	
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ColorButtons implements MouseListener {
public static void main(String[] args) {
ColorButtons nag= new ColorButtons();
}
ColorButtons(){
JFrame jframe= new JFrame();
JButton redbutton= new JButton();
JButton greenbutton= new JButton();
JButton yellowbutton= new JButton();
JButton bluebutton= new JButton();
JPanel jpanel= new JPanel();
jframe.setVisible(true);
jframe.setSize(500,500);
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
}

void speak(String words) {
	try {
		Runtime.getRuntime().exec("say" + words);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
@Override
public void mouseClicked(MouseEvent e) {

	
}
public void mousePressed(MouseEvent e) {
	
	
}
public void mouseReleased(MouseEvent e) {
	
	
}
public void mouseEntered(MouseEvent e) {
	
	
}
public void mouseExited(MouseEvent e) {
	
}
}

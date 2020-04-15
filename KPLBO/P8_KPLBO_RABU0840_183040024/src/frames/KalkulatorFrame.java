package frames;

import javax.swing.JFrame;

import panels.KalkulatorPanel;

public class KalkulatorFrame {
	public KalkulatorFrame() {
		KalkulatorPanel kp = new KalkulatorPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Kalkulator");
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 200);
		
		frame.add(kp);
	}


	
	
}

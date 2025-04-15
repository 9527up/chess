import java.awt.*;
public class FIRPointBlack extends Canvas {
	// git test
	fivechess padBelonged;//黑棋棋盘
	public FIRPointBlack(fivechess padBelonged) {
		setSize(20,20);//棋子大小
		this.padBelonged =padBelonged;
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(0, 0, 14, 14);
	}

}
// master conflict

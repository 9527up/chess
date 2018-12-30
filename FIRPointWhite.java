import java.awt.*;
public class FIRPointWhite extends Canvas{
	fivechess padBelonged;//白棋棋盘
	public FIRPointWhite(fivechess padBelonged) {
		setSize(20,20);//棋子大小
		this.padBelonged =padBelonged;
	}
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(0, 0, 14, 14);
	}

}

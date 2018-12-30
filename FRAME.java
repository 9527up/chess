import javax.swing.*;
import java.awt.*;
/**
 * Created by YR on 2018/12/23.
 */
public class FRAME extends JFrame{

    public JButton createButton = new JButton("创建游戏");
    public JButton joinButton = new JButton("加入游戏");
    public JButton cancelButton = new JButton("放弃游戏");
    public JButton exitButton = new JButton("退出游戏");

    public FRAME(){

        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.LIGHT_GRAY);
        add(createButton);
        add(joinButton);
        add(cancelButton);
        add(exitButton);
        setSize (670, 660);
        setVisible (true);
        setResizable (false);
        this.validate ();

    }

}


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class test extends Frame implements ActionListener {
    FRAME userControlPad = new FRAME();
    UserListPad userListPad = new UserListPad();
    // 下棋区
    fivechess firPad = new fivechess();
    // 面板区
    Panel southPanel = new Panel();
    Panel northPanel = new Panel();
    Panel centerPanel = new Panel();
    Panel eastPanel = new Panel();
    // 构造方法，创建界面
    public void FIRClient() {
        setLayout(new BorderLayout());
        eastPanel.setLayout(new BorderLayout());
        eastPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(firPad, BorderLayout.CENTER);
        eastPanel.add(userListPad, BorderLayout.NORTH);
        centerPanel.setBackground(Color.LIGHT_GRAY);
        userControlPad.createButton.addActionListener(this);
        userControlPad.joinButton.addActionListener(this);
        userControlPad.cancelButton.addActionListener(this);
        userControlPad.exitButton.addActionListener(this);
        userControlPad.createButton.setEnabled(false);
        userControlPad.joinButton.setEnabled(false);
        userControlPad.cancelButton.setEnabled(false);
        southPanel.add(userControlPad, BorderLayout.CENTER);
        southPanel.setBackground(Color.LIGHT_GRAY);
        System.exit(0);
        add (eastPanel, BorderLayout.EAST);
        add (centerPanel, BorderLayout.CENTER);
        add (southPanel, BorderLayout.SOUTH);
        pack ();
        setSize (670, 660);
        setVisible (true);
        setResizable (false);
        this.validate ();
    }
public void actionPerformed(ActionEvent e) {


    if (e.getSource() == userControlPad.joinButton) { // 加入游戏按钮单击事件

    }
    if (e.getSource() == userControlPad.createButton) { //创建游戏

    }
    if (e.getSource() == userControlPad.cancelButton) { // 认输

    }


}

    public static void main(String args[]){
        test test = new test();
        fivechess chess =new fivechess();

    }
}

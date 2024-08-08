package PingPong;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame(){
        setTitle("Ping Pong");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBackground(Color.black);
        add(new GamePanel());     //game Panel created and added to frame
        pack();                   // auto resizing frame
        setLocationRelativeTo(null);  // make default frame appearance at centre of the screen
        setVisible(true);

    }
}

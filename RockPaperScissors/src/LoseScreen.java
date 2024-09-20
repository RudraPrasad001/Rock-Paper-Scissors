import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoseScreen implements ActionListener {
    JButton replay = new JButton("Replay");
    JButton exit = new JButton("Exit");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel loss = new JLabel("YOU LOST");

    LoseScreen() {
        {
            frame.setSize(500, 500);
            frame.setLayout(null);
            panel.add(loss);
            loss.setHorizontalAlignment(JLabel.CENTER);
            loss.setVerticalAlignment(JLabel.CENTER);
            loss.setFont(new Font(null, Font.BOLD, 25));
            panel.setLayout(new BorderLayout(1,5));
            panel.setBounds(50, 50, 350, 350);
            panel.setLayout(new FlowLayout());

            frame.getContentPane().setBackground(Color.GRAY);
            panel.setBackground(Color.YELLOW);
            frame.add(panel);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel.add(replay);
            panel.add(exit);
            exit.addActionListener(this);
            replay.addActionListener(this);
            replay.setSize(30,10);
            exit.setSize(30,10);

            frame.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit)
        {
            frame.dispose();
        }
        if(e.getSource()==replay)
        {
            frame.dispose();
            new RockPaperScissors();
        }
    }
}

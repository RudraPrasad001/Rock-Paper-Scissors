import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawScreen implements ActionListener {
    JButton replay = new JButton("Replay");
    JButton exit = new JButton("Exit");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel draw = new JLabel("DRAW");
    DrawScreen()
    {
        {
            frame.setSize(500,500);
            frame.setLayout(null);
            panel.add(draw);
            draw.setHorizontalAlignment(JLabel.CENTER);
            draw.setVerticalAlignment(JLabel.CENTER);
            draw.setFont(new Font(null,Font.BOLD,25));
            panel.setLayout(new BorderLayout(1,5));
            panel.setBounds(50,50,350,350);
            panel.setLayout(new FlowLayout());

            frame.getContentPane().setBackground(Color.GREEN);
            panel.setBackground(Color.PINK);
            frame.add(panel);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel.add(replay);
            panel.add(exit);
            exit.addActionListener(this);
            replay.setSize(30,10);
            exit.setSize(30,10);
            replay.addActionListener(this);
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

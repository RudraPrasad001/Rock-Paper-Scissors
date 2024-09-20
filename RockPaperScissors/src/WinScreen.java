import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinScreen implements ActionListener
{
    JButton replay = new JButton("Replay");
    JButton exit = new JButton("Exit");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    //JLabel filler1 = new JLabel();
    //JLabel filler2 = new JLabel();
    JLabel win = new JLabel("YOU WON");
   // ImageIcon fire1 = new ImageIcon("Fire.PNG");
    WinScreen()
    {
        frame.setSize(500,500);
        panel.add(win);
        panel.setLayout(new BorderLayout(1,5));
        win.setHorizontalAlignment(JLabel.CENTER);
        win.setVerticalAlignment(JLabel.CENTER);
        win.setFont(new Font(null,Font.BOLD,25));
        frame.setLayout(null);
//        filler1.setIcon(fire1);
//        filler1.setSize(new Dimension(500,500));
//        filler1.setHorizontalAlignment(JLabel.RIGHT);

        //2nd

       // filler2.setIcon(fire1);
//filler2.setHorizontalAlignment(JLabel.LEFT);

        panel.setBounds(50,50,350,350);
        panel.setLayout(new FlowLayout());
        //frame.add(filler1);
       // frame.add(filler2);
        frame.getContentPane().setBackground(Color.BLACK);
        panel.setBackground(Color.CYAN);
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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissors implements ActionListener {
    JFrame gameFrame = new JFrame();
    JButton rock = new JButton("Rock");
    JButton Paper = new JButton("Paper");
    JButton Scissors = new JButton("Scissors");
    JLabel border = new JLabel("Welcome to Rock Paper Scissors!");
    JPanel inside = new JPanel();
    ImageIcon rockImage = new ImageIcon("Rock.PNG");
    ImageIcon paperImage = new ImageIcon("Paper.PNG");
    ImageIcon scissorsImage = new ImageIcon("Scissor.PNG");

    Random rand = new Random();
    int compChoice= rand.nextInt(1,4);

    RockPaperScissors()
    {
        playGame();
    }

    public void playGame()
    {
        border.setBorder(BorderFactory.createLineBorder(Color.BLACK,50));
        border.setVerticalAlignment(JLabel.TOP);
        border.setHorizontalAlignment(JLabel.CENTER);
        Paper.setIcon(paperImage);
        rock.setIcon(rockImage);
        Scissors.setIcon(scissorsImage);
        inside.setBounds(100,100,300,150);
        inside.setBackground(Color.DARK_GRAY);
        inside.setLayout(new GridLayout(1,3,2,0));

        Paper.setSize(50,50);
        rock.setSize(50,50);
        Scissors.setSize(50,50);
        inside.add(Paper);
        inside.add(rock);
        inside.add(Scissors);
        gameFrame.add(inside);
        Paper.addActionListener(this);
        rock.addActionListener(this);
        Scissors.addActionListener(this);


        gameFrame.add(border);
        gameFrame.setSize(new Dimension(500,500));
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Scissors)
        {
            switch(compChoice)
            {
                case 1: {
                    gameFrame.dispose();
                    new LoseScreen();
                    break;
                }
                case 2:{
                    gameFrame.dispose();
                    new WinScreen();
                    break;
                }
                case 3:{
                    gameFrame.dispose();
                    new DrawScreen();
                    break;
                }

            }
        }
        if(e.getSource()==rock)
        {
            switch(compChoice)
            {
                case 2: {
                    gameFrame.dispose();
                    new LoseScreen();
                    break;
                }
                case 3:{
                    gameFrame.dispose();
                    new WinScreen();
                    break;
                }
                case 1:{
                    gameFrame.dispose();
                    new DrawScreen();
                    break;
                }

            }
        }
        if(e.getSource()==Paper)
        {
            switch(compChoice)
            {
                case 3: {
                    gameFrame.dispose();
                    new LoseScreen();
                    break;
                }
                case 1:{
                    gameFrame.dispose();
                    new WinScreen();
                    break;
                }
                case 2:{
                    gameFrame.dispose();
                    new DrawScreen();
                    break;
                }

            }
        }
    }

}

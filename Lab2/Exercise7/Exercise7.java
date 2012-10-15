import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Exercise7 implements ActionListener {
    private JButton[] squares = new JButton[9];
    private int count=0;

    Exercise7() {
        JFrame window = new JFrame("X's and O's");
        window.setSize(390,420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3,3));

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i=0; i<9; i++) {
            squares[i] = new JButton();
            squares[i].setFocusPainted(false);
            squares[i].setBackground(Color.lightGray);
            squares[i].addActionListener(this);
            window.add(squares[i]);
        }

        window.setVisible(true);
    }

    void reset() {
      for(int i=0;i<squares.length;i++) {
        squares[i].setText("");
        squares[i].setBackground(Color.lightGray);
        squares[i].setEnabled(true);
      }
    }

    public void actionPerformed(ActionEvent a) {
        count++;
        String letter="";
        boolean win = false;
        int[][] winCombo = new int[][] {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

        JButton pressedButton = (JButton)a.getSource();
        pressedButton.setFont(new Font("Comic Sans MS", Font.BOLD, 115));

        if(count % 2 == 0) {
            letter="O";
            pressedButton.setText("<html><font color=red>" + letter + "</font></html>");
            pressedButton.setBackground(Color.darkGray);
            pressedButton.setEnabled(false);

        } else {
            letter="X";
            pressedButton.setText("<html><font color=blue>" + letter + "</font></html>");
            pressedButton.setBackground(Color.WHITE);
            pressedButton.setEnabled(false);
        }

        for(int i=0; i<8; i++) {
            if(
                squares[winCombo[i][0]].getText().equals(squares[winCombo[i][1]].getText()) &&
                squares[winCombo[i][1]].getText().equals(squares[winCombo[i][2]].getText()) &&
                squares[winCombo[i][0]].getText() != ""
            ) {
                win = true;
            }
        }


        if(win == true) {
            JOptionPane.showMessageDialog(null, letter + " wins the game!");
            this.reset();
        } else if(count == 9 && win == false) {
            JOptionPane.showMessageDialog(null, "Tie!");
            this.reset();
        }
    }

    public static void main(String[] args) {
        new Exercise7();
    }
}
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth = 600;
        int boardheight = boardwidth;


        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardheight,boardwidth);
        frame.setLocationRelativeTo(null); // Set the window center
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardwidth, boardheight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
        
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Timer;
import java.util.TimerTask;

public class GameBoard extends JFrame implements MouseListener
{
	private JPanel leftPanel_Game, centerPanel_Game, rightPanel_Game, rightPanel2_Game, piecePanel[];
	private JLabel lblScores, lblPlayer1, lblPlayer2, lblPlayer3, lblPlayer4,
		lblPlayer1Score, lblPlayer2Score, lblPlayer3Score, lblPlayer4Score, thetime;
	private JButton btnBoard[][], btnPiece;
	private JScrollPane scrollPieces;
	private Timer timer;

	private int row, col, seconds, piecePanelY, choice;
	
	private JLabel textLabel;
	

	

	public GameBoard(int sec)
	{
		setTitle("Blokus");
		setSize(810, 529);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		this.row = 20;
     	this.col = 20;
		
		//.......... Panels ..........
		leftPanel_Game = new JPanel();
		leftPanel_Game.setBackground(Color.WHITE);
		leftPanel_Game.setBounds(0, 0, 155, 500);
		getContentPane().add(leftPanel_Game);
		leftPanel_Game.setLayout(null);
		
		centerPanel_Game = new JPanel();
		centerPanel_Game.setBackground(Color.BLUE);
		centerPanel_Game.setBounds(155, 0, 500, 500);
		getContentPane().add(centerPanel_Game);
		centerPanel_Game.setLayout(new GridLayout(row, col));	
		
		rightPanel_Game = new JPanel();
		rightPanel_Game.setBackground(Color.LIGHT_GRAY);
		rightPanel_Game.setBounds(655, 0, 155, 500);
		getContentPane().add(rightPanel_Game);
		rightPanel_Game.setLayout(new GridLayout(11, 2));
		//.......... Panels ..........
		
		
		//.......... Left Panel ..........
		lblScores = new JLabel("Scores");
		lblScores.setFont(new Font("Dyuthi", Font.BOLD, 20));
		lblScores.setBounds(45, 100, 85, 20);
		leftPanel_Game.add(lblScores);
		
		lblPlayer1 = new JLabel("Player 1:");
		lblPlayer1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayer1.setBounds(12, 135, 75, 15);
		leftPanel_Game.add(lblPlayer1);
		
		lblPlayer2 = new JLabel("Player 2:");
		lblPlayer2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayer2.setBounds(12, 165, 75, 15);
		leftPanel_Game.add(lblPlayer2);
		
		lblPlayer3 = new JLabel("Player 3:");
		lblPlayer3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayer3.setBounds(12, 195, 75, 15);
		leftPanel_Game.add(lblPlayer3);
		
		lblPlayer4 = new JLabel("Player 4:");
		lblPlayer4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayer4.setBounds(12, 225, 75, 15);
		leftPanel_Game.add(lblPlayer4);
		
		lblPlayer1Score = new JLabel("00");
		lblPlayer1Score.setBounds(90, 135, 50, 15);
		leftPanel_Game.add(lblPlayer1Score);
		
		lblPlayer2Score = new JLabel("00");
		lblPlayer2Score.setBounds(90, 165, 50, 15);
		leftPanel_Game.add(lblPlayer2Score);
		
		lblPlayer3Score = new JLabel("00");
		lblPlayer3Score.setBounds(90, 195, 66, 15);
		leftPanel_Game.add(lblPlayer3Score);
		
		lblPlayer4Score = new JLabel("00");
		lblPlayer4Score.setBounds(90, 225, 66, 15);
		leftPanel_Game.add(lblPlayer4Score);
		
		
		
		seconds = sec;
	    thetime = new JLabel();
        thetime.setFont(new Font("Courier", Font.PLAIN, 20));
        timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
            	if (seconds == 0) {
            		thetime.setText("");
            	}
                if (seconds >= 1){
                    thetime.setText("" + seconds--);
                   }
                   else{
                       cancel();
                   }
               }
           };

         timer.schedule(task,0,1000);
         leftPanel_Game.add(thetime);
         thetime.setBounds(20, 10, 60, 60);
		//.......... Left Panel ..........
		

		
		//.......... Center Panel ..........
		btnBoard = new JButton[row][col];
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < col; j++) {
                btnBoard[i][j] = new JButton();
                btnBoard[i][j].addMouseListener(this);
            centerPanel_Game.add(btnBoard[i][j]);
            btnBoard[i][j].setBackground(Color.white);
	        }
	    }
        
        btnBoard[0][0].setBackground(Color.RED);
        btnBoard[0][19].setBackground(Color.GREEN);
        btnBoard[19][0].setBackground(Color.YELLOW);
        btnBoard[19][19].setBackground(Color.BLUE);
		//.......... Center Panel .......... 
        
        
		
		//.......... Right Panel ..........	
        this.piecePanelY = 5;
        piecePanel = new JPanel[21];
        for (int i = 0; i < 21; i++) {
        	piecePanel[i] = new JPanel();
        	piecePanel[i].setBackground(Color.LIGHT_GRAY);
        	piecePanel[i].addMouseListener(this);
        	//piecePanel[i].setBounds(5, piecePanelY, 145, 145);
    		rightPanel_Game.add(piecePanel[i]);
    		piecePanel[i].setLayout(new GridLayout(7, 7));
    		piecePanelY += 150;
		}
        
        
        int[][][] shapes = new Piece().getAllShapes();
		
		for (int i = 0; i < 21; i++) {
			
			for (int j = 0; j < 7; j++) {
				for (int k = 0; k < 7; k++) {
					btnPiece = new JButton();
					if (shapes [i][j][k] == 3) { 
						//btnPiece.setEnabled(false);
						btnPiece.setBackground(Color.RED);
						btnPiece.addMouseListener(this);
					}
					else {
						btnPiece.setVisible(false);
					}
					piecePanel[i].add(btnPiece);
				}
			}
			
		}
		
		//.......... Right Panel ..........
		
		setResizable(false);
		setVisible(true);
	}	
	
	
	public void mouseClicked (MouseEvent e) {
		for (int i = 0; i < 21; i++) {
			if (e.getSource() == piecePanel[i]) 
			{
				if(i==4) {
					piecePanel[i].setVisible(false);
					btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[1][0].setBackground(Color.RED);
					btnBoard[2][0].setBackground(Color.RED);
					btnBoard[2][1].setBackground(Color.RED);
					
					
				}
				else if(i==10) {
					piecePanel[i].setVisible(false);
					btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[0][2].setBackground(Color.RED);
					btnBoard[0][3].setBackground(Color.RED);
					btnBoard[1][3].setBackground(Color.RED);
				}
				else if(i==11) {
					piecePanel[i].setVisible(false);
					btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[0][2].setBackground(Color.RED);
					btnBoard[0][3].setBackground(Color.RED);
					btnBoard[0][4].setBackground(Color.RED);
					
				}
				else if(i==13) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[1][0].setBackground(Color.RED);
					btnBoard[1][1].setBackground(Color.RED);
					
				}
				else if(i==15) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[0][2].setBackground(Color.RED);
					btnBoard[1][2].setBackground(Color.RED);
					
				}
				else if(i==16) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[0][2].setBackground(Color.RED);
					btnBoard[0][3].setBackground(Color.RED);
					
				}
				else if(i==18) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					btnBoard[0][2].setBackground(Color.RED);
					
				}
				else if(i==19) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
					btnBoard[0][1].setBackground(Color.RED);
					
				}
				else if(i==20) {
					piecePanel[i].setVisible(false);
	            	btnBoard[0][0].setBackground(Color.RED);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Choice");	
				}
			}


			
			
			
		}
	}
	
	public void mouseEntered(MouseEvent e) {
		//
	}  
	
    public void mouseExited(MouseEvent e) {
    	//
    }
    
    public void mousePressed(MouseEvent e) {
    	//
    }
    
    public void mouseReleased(MouseEvent e) {
    	//
    } 
}
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Home
{
	public static void main(String[] args) 
	{
		MainMenu start = new MainMenu();	
	}
}

class MainMenu extends JFrame implements ActionListener
{
	private String[] themes = {"Theme 1", "Theme 2", "Theme 3"};
	
	private JPanel panelTop_Home, panelBottomMain_Home, panelNewGame_Home, panelSettings_Home, panelCpuPlayers_Home;
	private JLabel lblTitle_Home, lblChoosePlayers_NewGame, lblSettings, lblChooseCpuPlayers, lblDifficulty;
	private JButton btnNewGame_Home, btnResume_Home, btnSettings_Home, btn1Player_NewGame, 
		btn2Players_NewGame, btn3Players_NewGame, btn4Players_NewGame, btnGoBack_NewGame, 
		btnGoBack_Settings, btnGoBack_CpuPlayers, btnStartGame_CpuPlayers;
	private JCheckBox chckbxHints, chckbxCpuPlayer1, chckbxCpuPlayer2, chckbxCpuPlayer3, 
		chckbxEasy, chckbxMedium, chckbxHard;
	private JComboBox comboBoxTheme;
	private ButtonGroup cpuPlayerGrp, difficlutyGrp;
	
	public MainMenu() 
	{
		setTitle("Blokus");
		setBounds(300, 150, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Top Panel
		panelTop_Home = new JPanel();
		panelTop_Home.setBackground(new Color(30, 144, 255));
		panelTop_Home.setBounds(0, 0, 700, 110);
		getContentPane().add(panelTop_Home);
		panelTop_Home.setLayout(null);
		
		lblTitle_Home = new JLabel("Blokus");
		lblTitle_Home.setFont(new Font("Manjari Bold", Font.BOLD, 60));
		lblTitle_Home.setBounds(251, 27, 210, 70);
		panelTop_Home.add(lblTitle_Home);
		
		//.......... Bottom Panels ..........		
		panelBottomMain_Home = new JPanel();
		panelBottomMain_Home.setBackground(UIManager.getColor("TabbedPane.highlight"));
		panelBottomMain_Home.setBounds(0, 110, 700, 262);
		getContentPane().add(panelBottomMain_Home);
		panelBottomMain_Home.setLayout(null);
		
		panelNewGame_Home = new JPanel();
		panelNewGame_Home.setBackground(UIManager.getColor("TabbedPane.highlight"));
		panelNewGame_Home.setBounds(0, 110, 700, 262);
		getContentPane().add(panelNewGame_Home);
		panelNewGame_Home.setLayout(null);
		
		panelSettings_Home = new JPanel();
		panelSettings_Home.setBackground(UIManager.getColor("TabbedPane.highlight"));
		panelSettings_Home.setBounds(0, 110, 700, 262);
		getContentPane().add(panelSettings_Home);
		panelSettings_Home.setLayout(null);
		
		panelCpuPlayers_Home = new JPanel();
		panelCpuPlayers_Home.setBackground(UIManager.getColor("TabbedPane.highlight"));
		panelCpuPlayers_Home.setBounds(0, 110, 700, 262);
		getContentPane().add(panelCpuPlayers_Home);
		panelCpuPlayers_Home.setLayout(null);
		//.......... Bottom Panels ..........		

		
		//.......... Main Menu ..........
		btnNewGame_Home = new JButton("New Game");
		btnNewGame_Home.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnNewGame_Home.setBackground(new Color(0, 255, 0));
		btnNewGame_Home.setBounds(240, 31, 220, 45);
		btnNewGame_Home.addActionListener(this);
		panelBottomMain_Home.add(btnNewGame_Home);
		
		btnResume_Home = new JButton("Resume");
		btnResume_Home.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnResume_Home.setBackground(new Color(255, 255, 0));
		btnResume_Home.setBounds(240, 107, 220, 45);
		panelBottomMain_Home.add(btnResume_Home);
		
		btnSettings_Home = new JButton("Settings");
		btnSettings_Home.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnSettings_Home.setBackground(new Color(169, 169, 169));
		btnSettings_Home.setBounds(240, 183, 220, 45);
		btnSettings_Home.addActionListener(this);
		panelBottomMain_Home.add(btnSettings_Home);
		//.......... Main Menu ..........				
		
		
		//.......... New Game ..........		
		lblChoosePlayers_NewGame = new JLabel("Choose Player(s)");
		lblChoosePlayers_NewGame.setFont(new Font("Dyuthi", Font.BOLD, 30));
		lblChoosePlayers_NewGame.setBounds(245, 20, 250, 35);
		panelNewGame_Home.add(lblChoosePlayers_NewGame);
		
		btn1Player_NewGame = new JButton("Single Player");
		btn1Player_NewGame.setBackground(new Color(0, 250, 154));
		btn1Player_NewGame.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btn1Player_NewGame.setBounds(100, 75, 200, 35);
		btn1Player_NewGame.addActionListener(this);
		panelNewGame_Home.add(btn1Player_NewGame);
		
		btn2Players_NewGame = new JButton("2 Players");
		btn2Players_NewGame.setBackground(new Color(100, 149, 237));
		btn2Players_NewGame.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btn2Players_NewGame.setBounds(400, 75, 200, 35);
		btn2Players_NewGame.addActionListener(this);
		panelNewGame_Home.add(btn2Players_NewGame);
		
		btn3Players_NewGame = new JButton("3 Players");
		btn3Players_NewGame.setBackground(new Color(30, 144, 255));
		btn3Players_NewGame.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btn3Players_NewGame.setBounds(100, 145, 200, 35);
		btn3Players_NewGame.addActionListener(this);
		panelNewGame_Home.add(btn3Players_NewGame);
		
		btn4Players_NewGame = new JButton("4 Players");
		btn4Players_NewGame.setBackground(new Color(144, 238, 144));
		btn4Players_NewGame.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btn4Players_NewGame.setBounds(400, 145, 200, 35);
		btn4Players_NewGame.addActionListener(this);
		panelNewGame_Home.add(btn4Players_NewGame);
		//.......... New Game ..........
		
		
		//.......... Settings ..........	
		lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Dyuthi", Font.BOLD, 30));
		lblSettings.setBounds(290, 30, 120, 35);
		panelSettings_Home.add(lblSettings);
		
		chckbxHints = new JCheckBox("      Hints");
		chckbxHints.setBackground(new Color(192, 192, 192));
		chckbxHints.setSelected(true);
		chckbxHints.setFont(new Font("Dyuthi", Font.PLAIN, 25));
		chckbxHints.setBounds(240, 90, 220, 45);
		panelSettings_Home.add(chckbxHints);
		
		comboBoxTheme = new JComboBox(themes);
		comboBoxTheme.setBackground(new Color(192, 192, 192));
		comboBoxTheme.setFont(new Font("Dyuthi", Font.PLAIN, 21));
		comboBoxTheme.setBounds(240, 170, 220, 45);
		panelSettings_Home.add(comboBoxTheme);
		//.......... Settings ..........
		
		
		//.......... CPU Players ..........
		lblChooseCpuPlayers = new JLabel("Choose CPU Player(s)");
		lblChooseCpuPlayers.setFont(new Font("Dyuthi", Font.BOLD, 25));
		lblChooseCpuPlayers.setBounds(225, 15, 250, 35);
		panelCpuPlayers_Home.add(lblChooseCpuPlayers);
		
		lblDifficulty = new JLabel("Difficulty"); 
		lblDifficulty.setFont(new Font("Dyuthi", Font.BOLD, 25));
		lblDifficulty.setBounds(290, 108, 120, 35);
		panelCpuPlayers_Home.add(lblDifficulty);
		
		chckbxCpuPlayer1 = new JCheckBox("1");
		chckbxCpuPlayer1.setBackground(Color.LIGHT_GRAY);
		chckbxCpuPlayer1.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxCpuPlayer1.setBounds(88, 55, 115, 35);
		chckbxCpuPlayer1.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxCpuPlayer1);
		
		chckbxCpuPlayer2 = new JCheckBox("2");
		chckbxCpuPlayer2.setBackground(Color.LIGHT_GRAY);
		chckbxCpuPlayer2.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxCpuPlayer2.setBounds(291, 55, 115, 35);
		chckbxCpuPlayer2.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxCpuPlayer2);
		
		chckbxCpuPlayer3 = new JCheckBox("3");
		chckbxCpuPlayer3.setBackground(Color.LIGHT_GRAY);
		chckbxCpuPlayer3.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxCpuPlayer3.setBounds(494, 55, 115, 35);
		chckbxCpuPlayer3.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxCpuPlayer3);
		
		chckbxEasy = new JCheckBox("Easy");
		chckbxEasy.setBackground(Color.GREEN);
		chckbxEasy.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxEasy.setBounds(88, 150, 115, 35);
		chckbxEasy.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxEasy);
		
	    chckbxMedium = new JCheckBox("Medium");
		chckbxMedium.setBackground(Color.ORANGE);
		chckbxMedium.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxMedium.setBounds(291, 150, 115, 35);
		chckbxMedium.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxMedium);
		
		chckbxHard = new JCheckBox("Hard");
		chckbxHard.setBackground(Color.RED);
		chckbxHard.setFont(new Font("Dyuthi", Font.PLAIN, 20));
		chckbxHard.setBounds(494, 150, 115, 35);
		chckbxHard.addActionListener(this);
		panelCpuPlayers_Home.add(chckbxHard);
		
		btnStartGame_CpuPlayers = new JButton("Start Game");
		btnStartGame_CpuPlayers.setBackground(Color.GREEN);
		btnStartGame_CpuPlayers.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnStartGame_CpuPlayers.setBounds(525, 210, 150, 35);
		btnStartGame_CpuPlayers.addActionListener(this);
		panelCpuPlayers_Home.add(btnStartGame_CpuPlayers);
		
		cpuPlayerGrp = new ButtonGroup();
		cpuPlayerGrp.add(chckbxCpuPlayer1);
		cpuPlayerGrp.add(chckbxCpuPlayer2);
		cpuPlayerGrp.add(chckbxCpuPlayer3);
		
		difficlutyGrp = new ButtonGroup();
		difficlutyGrp.add(chckbxEasy);
		difficlutyGrp.add(chckbxMedium);
		difficlutyGrp.add(chckbxHard);
		//.......... CPU Players ..........
		
		
		//.......... Go Back buttons ..........
		btnGoBack_NewGame = new JButton("Go Back");
		btnGoBack_NewGame.setBackground(Color.YELLOW);
		btnGoBack_NewGame.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnGoBack_NewGame.setBounds(25, 210, 115, 35);
		btnGoBack_NewGame.addActionListener(this);
		panelNewGame_Home.add(btnGoBack_NewGame);
		
		btnGoBack_Settings = new JButton("Go Back");
		btnGoBack_Settings.setBackground(Color.YELLOW);
		btnGoBack_Settings.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnGoBack_Settings.setBounds(25, 210, 115, 35);
		btnGoBack_Settings.addActionListener(this);
		panelSettings_Home.add(btnGoBack_Settings);
		
		btnGoBack_CpuPlayers = new JButton("Go Back");
		btnGoBack_CpuPlayers.setBackground(Color.YELLOW);
		btnGoBack_CpuPlayers.setFont(new Font("Dyuthi", Font.PLAIN, 23));
		btnGoBack_CpuPlayers.setBounds(25, 210, 115, 35);
		btnGoBack_CpuPlayers.addActionListener(this);
		panelCpuPlayers_Home.add(btnGoBack_CpuPlayers);
		//.......... Go Back buttons ..........

		
		panelNewGame_Home.setVisible(false);
		panelSettings_Home.setVisible(false);
		panelCpuPlayers_Home.setVisible(false);
		panelBottomMain_Home.setVisible(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource().equals(btnNewGame_Home)) 
        {
        	panelBottomMain_Home.setVisible(false);
        	panelSettings_Home.setVisible(false);
        	panelCpuPlayers_Home.setVisible(false);
        	panelNewGame_Home.setVisible(true);
        }
        else if (e.getSource().equals(btnSettings_Home)) 
        {
        	panelBottomMain_Home.setVisible(false);
        	panelNewGame_Home.setVisible(false);
        	panelCpuPlayers_Home.setVisible(false);
        	panelSettings_Home.setVisible(true);
		}
        else if (e.getSource().equals(btn1Player_NewGame) || e.getSource().equals(btn2Players_NewGame) 
        		|| e.getSource().equals(btn3Players_NewGame) || e.getSource().equals(btn4Players_NewGame)) 
        {
        	panelNewGame_Home.setVisible(false);
        	panelSettings_Home.setVisible(false);
        	panelBottomMain_Home.setVisible(false);
        	panelCpuPlayers_Home.setVisible(true);
		}
        else if (e.getSource().equals(btnGoBack_NewGame) || e.getSource().equals(btnGoBack_Settings)
        		|| e.getSource().equals(btnGoBack_CpuPlayers)) 
        {
        	panelNewGame_Home.setVisible(false);
        	panelSettings_Home.setVisible(false);
        	panelCpuPlayers_Home.setVisible(false);
        	panelBottomMain_Home.setVisible(true);
		}
        else if (e.getSource().equals(btnStartGame_CpuPlayers)) 
        {
        	if ((chckbxCpuPlayer1.isSelected() || chckbxCpuPlayer2.isSelected() || chckbxCpuPlayer3.isSelected())
        			&& (chckbxEasy.isSelected() || chckbxMedium.isSelected() || chckbxHard.isSelected())) 
        	{
        		setVisible(false);
            	GameGrid gridWindow = new GameGrid();
			}
		}
    }
}
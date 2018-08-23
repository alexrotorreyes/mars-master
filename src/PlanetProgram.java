import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.*;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlanetProgram extends JFrame {

	private JPanel contentPane, optionsPane;
	private ImageIcon earthIcon, marsIcon, manIcon, womanIcon, lionIcon, cowIcon, grainIcon, spaceshipIcon;
	private JLabel earthLabel, marsLabel, passNumLabel, passengersLabel, spaceshipLabel,
					manEarthLbl, womanEarthLbl, lionEarthLbl, cowEarthLbl, grainEarthLbl,
					manMarsLbl, womanMarsLbl, lionMarsLbl, cowMarsLbl, grainMarsLbl;
	private JComboBox numberCmb, passengersCmb;
	private JButton btnMan, btnWoman, btnLion, btnCow, btnGrain;
	private int ctr=0, number=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetProgram frame = new PlanetProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PlanetProgram() {
		setBackground(new Color(0, 0, 128));
		try {
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		optionsPane = new JPanel();
		optionsPane.setBounds(0, 600, 1200, 50);
		contentPane.add(optionsPane);
		optionsPane.setLayout(null);
		
		passNumLabel = new JLabel("How many passengers?");
		passNumLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		passNumLabel.setBounds(20, 14, 180, 24);
		optionsPane.add(passNumLabel);
		
		numberCmb = new JComboBox();
		numberCmb.addItem(1);
		numberCmb.addItem(2);
		numberCmb.setBounds(199, 13, 40, 30);
		optionsPane.add(numberCmb);
		
		passengersLabel = new JLabel("Which passengers?");
		passengersLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		passengersLabel.setBounds(375, 14, 149, 24);
		optionsPane.add(passengersLabel);
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		
		earthLabel = new JLabel("");
		earthIcon = new ImageIcon(this.getClass().getResource("Earth.png"));
		earthLabel.setIcon(earthIcon);
		earthLabel.setBounds(-247, -111, 623, 514);
		contentPane.add(earthLabel);
		
		marsLabel = new JLabel("");
		marsLabel.setBackground(new Color(0, 0, 128));
		marsIcon = new ImageIcon(this.getClass().getResource("Mars.png"));
		marsLabel.setIcon(marsIcon);
		marsLabel.setBounds(795, -411, 733, 912);
		contentPane.add(marsLabel);
		
		spaceshipLabel = new JLabel("");
		spaceshipIcon = new ImageIcon(this.getClass().getResource("Spaceship.png"));
		spaceshipLabel.setIcon(spaceshipIcon);
		spaceshipLabel.setBounds(509, 81, 256, 281);
		contentPane.add(spaceshipLabel);
		
		manEarthLbl = new JLabel("");
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		manEarthLbl.setIcon(manIcon);
		manEarthLbl.setBounds(20, 400, 256, 281);
		contentPane.add(manEarthLbl);
		
		womanEarthLbl = new JLabel("");
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		womanEarthLbl.setIcon(womanIcon);
		womanEarthLbl.setBounds(120, 400, 256, 281);
		contentPane.add(womanEarthLbl);
		
		lionEarthLbl = new JLabel("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		lionEarthLbl.setIcon(lionIcon);
		lionEarthLbl.setBounds(220, 400, 256, 281);
		contentPane.add(lionEarthLbl);
		
		cowEarthLbl = new JLabel("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		cowEarthLbl.setIcon(cowIcon);
		cowEarthLbl.setBounds(320, 400, 256, 281);
		contentPane.add(cowEarthLbl);
		
		grainEarthLbl = new JLabel("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		grainEarthLbl.setIcon(grainIcon);
		grainEarthLbl.setBounds(420, 400, 256, 281);
		contentPane.add(grainEarthLbl);
		
		manMarsLbl = new JLabel("");
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		manMarsLbl.setIcon(manIcon);
		manMarsLbl.setBounds(650, 400, 256, 281);
		contentPane.add(manMarsLbl);
		manMarsLbl.setVisible(false);
		
		womanMarsLbl = new JLabel("");
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		womanMarsLbl.setIcon(womanIcon);
		womanMarsLbl.setBounds(750, 400, 256, 281);
		contentPane.add(womanMarsLbl);
		womanMarsLbl.setVisible(false);
		
		lionMarsLbl = new JLabel("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		lionMarsLbl.setIcon(lionIcon);
		lionMarsLbl.setBounds(850, 400, 256, 281);
		contentPane.add(lionMarsLbl);
		lionMarsLbl.setVisible(false);
		
		cowMarsLbl = new JLabel("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		cowMarsLbl.setIcon(cowIcon);
		cowMarsLbl.setBounds(950, 400, 256, 281);
		contentPane.add(cowMarsLbl);
		cowMarsLbl.setVisible(false);
		
		grainMarsLbl = new JLabel("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		grainMarsLbl.setIcon(grainIcon);
		grainMarsLbl.setBounds(1050, 400, 256, 281);
		contentPane.add(grainMarsLbl);
		grainMarsLbl.setVisible(false);
		
		btnMan = new JButton("");
		btnMan.setBounds(553, 0, 61, 61);
		optionsPane.add(btnMan);
		btnMan.setIcon(manIcon);

		btnWoman = new JButton("");
		btnWoman.setBounds(662, 0, 68, 61);
		optionsPane.add(btnWoman);
		btnWoman.setIcon(womanIcon);
		
		btnLion = new JButton("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		btnLion.setIcon(lionIcon);
		btnLion.setBounds(771, 0, 68, 61);
		optionsPane.add(btnLion);
		
		btnCow = new JButton("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		btnCow.setIcon(cowIcon);
		btnCow.setBounds(883, 0, 68, 61);
		optionsPane.add(btnCow);
		
		btnGrain = new JButton("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		btnGrain.setIcon(grainIcon);
		btnGrain.setBounds(996, 0, 61, 61);
		optionsPane.add(btnGrain);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = (Integer) numberCmb.getSelectedItem();
				System.out.println("number is: " + number);
				btnMan.setEnabled(true);
				btnWoman.setEnabled(true);
				btnLion.setEnabled(true);
				btnCow.setEnabled(true);
				btnGrain.setEnabled(true);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnEnter.setBounds(249, 17, 61, 23);
		optionsPane.add(btnEnter);
		
		numberCmb.setSelectedItem("");
		
		btnMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(manEarthLbl.isVisible())
				{
					manEarthLbl.setVisible(false);
					manMarsLbl.setVisible(true);
				}
				else 
				{
					manEarthLbl.setVisible(true);
					manMarsLbl.setVisible(false);
				}
				
				System.out.println("selected item is: " + numberCmb.getSelectedItem());
				
				if (numberCmb.getSelectedItem().equals(1))
				{
					System.out.println("DID IT ENTER??");
					System.out.println("yes");
					btnWoman.setEnabled(false);
					btnLion.setEnabled(false);
					btnCow.setEnabled(false);
					btnGrain.setEnabled(false);
				}
				else if (numberCmb.getSelectedItem().equals(2))
				{
					ctr=0;
					
					while(ctr<2)
					{	
						ctr++;
						System.out.println("entered boooooger equals(2) ctr: " + ctr);
						btnWoman.setEnabled(true);
						btnLion.setEnabled(true);
						btnCow.setEnabled(true);
						btnGrain.setEnabled(true);
						
						if (ctr==3)
						{	
							System.out.println("entered if loop! ctr is: " + ctr);
							btnWoman.setEnabled(false);
							btnLion.setEnabled(false);
							btnCow.setEnabled(false);
							btnGrain.setEnabled(false);
						}
					}
				}

				ctr=0;
			}
		});
		
		btnWoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(womanEarthLbl.isVisible())
				{
					womanEarthLbl.setVisible(false);
					womanMarsLbl.setVisible(true);
				}
				else 
				{
					womanEarthLbl.setVisible(true);
					womanMarsLbl.setVisible(false);
				}
				
				if (numberCmb.getSelectedItem().equals(1))
				{
					btnMan.setEnabled(false);
					btnLion.setEnabled(false);
					btnCow.setEnabled(false);
					btnGrain.setEnabled(false);
				}
				else if (numberCmb.getSelectedItem().equals(2))
				{
					ctr=0;
					while(ctr<2)
					{	
						ctr++;
						System.out.println("woman ctr: " + ctr);
						btnMan.setEnabled(true);
						btnLion.setEnabled(true);
						btnCow.setEnabled(true);
						btnGrain.setEnabled(true);
					}
					
					if (ctr==2)
					{	
						System.out.println("final woman ctr: " + ctr);
						btnMan.setEnabled(false);
						btnLion.setEnabled(false);
						btnCow.setEnabled(false);
						btnGrain.setEnabled(false);
					}
					ctr=0;
				}
				ctr=0;
			}
		});
		
		btnLion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lionEarthLbl.isVisible())
				{
					lionEarthLbl.setVisible(false);
					lionMarsLbl.setVisible(true);
				}
				else 
				{
					lionEarthLbl.setVisible(true);
					lionMarsLbl.setVisible(false);
				}
				
				if (numberCmb.getSelectedItem().equals(1))
				{
					System.out.println("yes");
					btnMan.setEnabled(false);
					btnWoman.setEnabled(false);
					btnCow.setEnabled(false);
					btnGrain.setEnabled(false);
				}
				else if (numberCmb.getSelectedItem().equals(2))
				{
					ctr=0;
					while(ctr<2)
					{	
						ctr++;
						System.out.println("lion ctr: " + ctr);
						btnMan.setEnabled(true);
						btnWoman.setEnabled(true);
						btnCow.setEnabled(true);
						btnGrain.setEnabled(true);
		
						if (ctr==2)
						{	btnMan.setEnabled(false);
							btnWoman.setEnabled(false);
							btnCow.setEnabled(false);
							btnGrain.setEnabled(false);
						}
					}
				}
				ctr=0;
			}
		});
		
		btnCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cowEarthLbl.isVisible())
				{
					cowEarthLbl.setVisible(false);
					cowMarsLbl.setVisible(true);
				}
				else 
				{
					cowEarthLbl.setVisible(true);
					cowMarsLbl.setVisible(false);
				}
				
				if (numberCmb.getSelectedItem().equals(1))
				{
					System.out.println("yes");
					btnMan.setEnabled(false);
					btnLion.setEnabled(false);
					btnWoman.setEnabled(false);
					btnGrain.setEnabled(false);
				}
				else if (numberCmb.getSelectedItem().equals(2))
				{
					ctr=0;
					while(ctr<2)
					{	
						btnMan.setEnabled(true);
						btnLion.setEnabled(true);
						btnWoman.setEnabled(true);
						btnGrain.setEnabled(true);
						ctr++;
					}
					
					if (ctr==2)
					{	btnMan.setEnabled(false);
						btnLion.setEnabled(false);
						btnWoman.setEnabled(false);
						btnGrain.setEnabled(false);
					}
					
					ctr=0;
				}
			}
		});
		
		btnGrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(grainEarthLbl.isVisible())
				{
					grainEarthLbl.setVisible(false);
					grainMarsLbl.setVisible(true);
				}
				else 
				{
					grainEarthLbl.setVisible(true);
					grainMarsLbl.setVisible(false);
				}
				
				if (numberCmb.getSelectedItem().equals(1))
				{
					System.out.println("yes");
					btnMan.setEnabled(false);
					btnLion.setEnabled(false);
					btnCow.setEnabled(false);
					btnWoman.setEnabled(false);
				}
				else if (numberCmb.getSelectedItem().equals(2))
				{
					ctr=0;
					while(ctr<2)
					{	
						btnMan.setEnabled(true);
						btnLion.setEnabled(true);
						btnCow.setEnabled(true);
						btnWoman.setEnabled(true);
						ctr++;
					}
					
					System.out.println("ctr grain: " + ctr);
					if (ctr==2)
					{	btnMan.setEnabled(false);
						btnLion.setEnabled(false);
						btnCow.setEnabled(false);
						btnWoman.setEnabled(false);
					}
					
					ctr=0;
				}
			}
		});
		
		System.out.println("selected item: " + numberCmb.getSelectedItem());
		
	}
}

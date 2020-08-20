package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e->{String Stringnum1 = JOptionPane.showInputDialog("Choose your first number to add.");
		String Stringnum2 = JOptionPane.showInputDialog("Choose your second number to add.");
		int num1 = Integer.parseInt(Stringnum1);
		int num2 = Integer.parseInt(Stringnum2);
		int answer = num1+num2;
		JOptionPane.showMessageDialog(null, "The sum of your 2 numbers is "+answer+".");});
		
		randNumber.addActionListener(e->{Random r = new Random();
		JOptionPane.showMessageDialog(null, "Your random number is:\n"+r.nextInt(101));});
		
		tellAJoke.addActionListener(e->{Random r = new Random();
		int num = r.nextInt(2);
		if(num==0) {
			JOptionPane.showInputDialog("Why are fish so smart?");
			JOptionPane.showMessageDialog(null, "Because they live in schools!");
		} else {
			JOptionPane.showInputDialog("What type of tree fits in your hand?");
			JOptionPane.showMessageDialog(null, "A palm tree!");
		}});
		
		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}

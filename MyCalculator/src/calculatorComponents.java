
/*
 * Name: Joshua Chukwuezi
 * Student Number: C18709101
 * File name: calculatorComponents.java
 * Description of class: this class will create the components for the calculator
 */
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class calculatorComponents {
//Note: anything that has to be handled in the outer class needs to be created here and declared in the constructor
	JTextField calculationField;
	

	public calculatorComponents() { // constructor to create components
		// creating the frame and panel and setting the layout
		JFrame f = new JFrame("Chukwuezi Calculator");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new MigLayout());
		mainPanel.setLayout(new MigLayout());
		f.setSize(500, 500);
		f.add(mainPanel);

		// buttons on the calculator
		JButton backspace_button = new JButton("<-");
		JButton clear_button = new JButton("C");
		JButton erase_button = new JButton("CE");
		JButton button_1 = new JButton("1");
		JButton button_2 = new JButton("2");
		JButton button_3 = new JButton("3");
		JButton button_4 = new JButton("4");
		JButton button_5 = new JButton("5");
		JButton button_6 = new JButton("6");

		JButton button_7 = new JButton("7");
		JButton button_8 = new JButton("8");
		JButton button_9 = new JButton("9");
		JButton button_0 = new JButton("0");
		JButton plus_button = new JButton("+");
		JButton divide_button = new JButton("/");
		JButton multiply_button = new JButton("*");
		JButton minus_button = new JButton("-");
		JButton decimal_button = new JButton(".");
		JButton equals_button = new JButton("=");

		// text field to hold the numbers
	    calculationField = new JTextField(30);
		calculationField.setEditable(false);

		// Putting a border around this text field
		Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
		calculationField.setBorder(border);

		// adding components
		mainPanel.add(calculationField, "wrap 15, span");
		// leaving that out for now because it wasn't working

		// first row
		mainPanel.add(backspace_button);
		mainPanel.add(erase_button);
		mainPanel.add(clear_button);
		mainPanel.add(plus_button, "wrap 5");

		// second row
		mainPanel.add(button_7);
		mainPanel.add(button_8);
		mainPanel.add(button_9);
		mainPanel.add(divide_button, "wrap 5");

		// third row
		mainPanel.add(button_4);
		mainPanel.add(button_5);
		mainPanel.add(button_6);
		mainPanel.add(multiply_button, "wrap 5");

		// forth row
		mainPanel.add(button_1);
		mainPanel.add(button_2);
		mainPanel.add(button_3);
		mainPanel.add(minus_button, "wrap 5");

		// fifth row
		mainPanel.add(button_0, "span 2 3, growx");
		mainPanel.add(decimal_button);
		mainPanel.add(equals_button);

		// registering listener
		listenerClass l = new listenerClass(this);

		// passing outer class instance for each component
		backspace_button.addActionListener(l);
		clear_button.addActionListener(l);
		erase_button.addActionListener(l);

		button_1.addActionListener(l);
		button_2.addActionListener(l);
		button_3.addActionListener(l);
		button_4.addActionListener(l);
		button_5.addActionListener(l);
		button_6.addActionListener(l);
		button_7.addActionListener(l);
		button_8.addActionListener(l);
		button_9.addActionListener(l);
		button_0.addActionListener(l);
		
		plus_button.addActionListener(l);
		divide_button.addActionListener(l);
		multiply_button.addActionListener(l);
		minus_button.addActionListener(l);
		decimal_button.addActionListener(l);
		equals_button.addActionListener(l);

	    f.setVisible(true);

	}

	public static void main(String[] args) {
		calculatorComponents run = new calculatorComponents();
		
	}

}


/*
 * Name: Joshua Chukwuezi
 * Student Number: C18709101
 * File name: Outer.java
 * Description of class: this class will handle the events in the program
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class listenerClass implements ActionListener {
	// Strings to store things entered in the calculator
	String s1, s2, s3;
	double result = 0.0;
	double newResult = 0.0;

	// String to store the display
	String display;

	calculatorComponents obj; // this variable allows this outer class to handle events from
								// calculatorComponents class

	listenerClass(calculatorComponents obj) {
		this.obj = obj;

	}

	public void actionPerformed(ActionEvent e) {
		// storing get source in a JButton
		JButton s = (JButton) e.getSource();

		// storing the calculation field in a string
		display = obj.calculationField.getText();
		
		

		if (s.equals(obj.button_1)) {

			// whenever a number button is pressed it will be stored in a variable so the
			// button can keep being pressed
			String button_1 = display + obj.button_1.getText();

			// display what was stored
			obj.calculationField.setText(button_1);

		}

		if (s.equals(obj.button_2)) {
			String button_2 = display + obj.button_2.getText();
			obj.calculationField.setText(button_2);

		}

		if (s.equals(obj.button_3)) {
			String button_3 = display + obj.button_3.getText();
			obj.calculationField.setText(button_3);
		}

		if (s.equals(obj.button_4)) {
			String button_4 = display + obj.button_4.getText();
			obj.calculationField.setText(button_4);

		}

		if (s.equals(obj.button_5)) {
			String button_5 = display + obj.button_5.getText();
			obj.calculationField.setText(button_5);
		}

		if (s.equals(obj.button_6)) {
			String button_6 = display + obj.button_6.getText();
			obj.calculationField.setText(button_6);

		}

		if (s.equals(obj.button_7)) {
			String button_7 = display + obj.button_7.getText();
			obj.calculationField.setText(button_7);

		}

		if (s.equals(obj.button_8)) {
			String button_8 = display + obj.button_8.getText();
			obj.calculationField.setText(button_8);
		}

		if (s.equals(obj.button_9)) {
			String button_9 = display + obj.button_9.getText();
			obj.calculationField.setText(button_9);
		}

		if (s.equals(obj.button_0)) {
			String button_0 = display + obj.button_0.getText();
			obj.calculationField.setText(button_0);
		}

		if (s.equals(obj.plus_button)) {
			String plus_button = display + obj.plus_button.getText();
			obj.calculationField.setText(plus_button);
		}

		if (s.equals(obj.minus_button)) {
			String minus_button = display + obj.minus_button.getText();
			obj.calculationField.setText(minus_button);
		}

		if (s.equals(obj.multiply_button)) {
			String multiply_button = display + obj.multiply_button.getText();
			obj.calculationField.setText(multiply_button);
		}

		if (s.equals(obj.divide_button)) {
			String divide_button = display + obj.divide_button.getText();
			obj.calculationField.setText(divide_button);
		}

		if (s.equals(obj.clear_button)) {
			String clear_button = display + obj.clear_button.getText();
			obj.calculationField.setText("");
		}

		if (s.equals(obj.equals_button)) {
			String equals_button = display + obj.equals_button.getText();
			obj.calculationField.setText("");
		}

	
		
		

		// for loop to perform operations
		// It is using the charAt to find the operators and when it does it perfoms
		// operation
		for (int i = 0; i < display.length(); i++) {

			// if equals is pressed
			if (s == obj.equals_button) {
				if (display.charAt(i) == '+') {
					// when + is found parse the first and second value and add them together
					result = Double.parseDouble(display.substring(0, i))
							+ Double.parseDouble(display.substring(i + 1, display.length()));
					// display the result
					obj.calculationField.setText(display + "=" + result);	
                
				} 
						
				else if (display.charAt(i) == '-') {
					// when - is found parse the first and second value and minuses them
					result = Double.parseDouble(display.substring(0, i))
							- Double.parseDouble(display.substring(i + 1, display.length()));
					obj.calculationField.setText(display + "=" + result);

				} else if (display.charAt(i) == '*') {
					// when * is found parse the first and second value and multiplies them
					result = Double.parseDouble(display.substring(0, i))
							* Double.parseDouble(display.substring(i + 1, display.length()));
					obj.calculationField.setText(display + "=" + result);
				} else if (display.charAt(i) == '/') {
					// when / is found parse the first and second value and divides them
					result = Double.parseDouble(display.substring(0, i))
							/ Double.parseDouble(display.substring(i + 1, display.length()));
					obj.calculationField.setText(display + "=" + result);
				}
				
				
			
			}

		
		}

	}

}

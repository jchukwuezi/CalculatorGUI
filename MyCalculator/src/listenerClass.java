/*
 * Name: Joshua Chukwuezi
 * Student Number: C18709101
 * File name: Outer.java
 * Description of class: this class will handle the events in the program
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listenerClass implements ActionListener  {
   //Strings to store operators and operands
	String s1,s2,s3;
	
	calculatorComponents obj; //this variable allows this outer class to handle events from calculatorComponents class
	
	listenerClass(calculatorComponents obj){
		this.obj=obj;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//returning a string representation of action performed
		String s = e.getActionCommand();
		 
		
		
		
		
	}

}

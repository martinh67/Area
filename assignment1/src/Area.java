/* in order to use dialogue box methods */
import javax.swing.JOptionPane;

/* name of the class */
public class Area

{
	/* main method */
	public static void main(String[] args) 
	
	{
		
		/* declare and initialise the variables required */	
		double height = 0, width = 0, area = 0;
		
		int option = 0;
		
		String heightStr, widthStr, optionStr;
		
		/* give information about the program */	
		JOptionPane.showMessageDialog(null, "Calculate the area of a triangle or a rectangle", "Area Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		/* a do loop to get a valid choice of shape from the user */
		do {
			
			try {
		
				/* ask the user to make the shape choice */	
				optionStr = JOptionPane.showInputDialog(null, "Enter 1 for a Triangle\nEnter 2 for a Rectangle", "Choose Shape", JOptionPane.INFORMATION_MESSAGE );
				
				/* convert the choice of shape to an integer */
				option = Integer.valueOf(optionStr);
				
				/* if the user enters either 1 or 2 */
				if (option == 1 | option == 2) 
				{
					/* break out of the loop */
					break;
					
				}
				
				/* if the user enters a number other than 1 or 2 */	
				else 
				{
					
					/* display error message */
					JOptionPane.showMessageDialog(null, "Invalid input please enter either 1 or 2", "Invalid Option",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			
			} 
			/* catch any symbols or characters entered for the shape choice */
			catch(NumberFormatException e) 
			
				{
				
				/* display error message */
				JOptionPane.showMessageDialog(null, "Invalid input please enter either 1 or 2", "Invalid Option", JOptionPane.INFORMATION_MESSAGE);
		
				}
				
		/* continue to ask the user for valid input */
		} while (option != 1 || option !=2);
		
		/* if the user chooses a triangle */
		if (option == 1) {
			
			/* a do loop to get a valid choice of triangle height from the user */
			do {
				
				try {
					/* ask the user for the height */	
					heightStr = JOptionPane.showInputDialog(null, "Enter the height of the triangle in meters", "Triangle Height", JOptionPane.INFORMATION_MESSAGE);
					
					/* convert the height to a double */
					height = Double.parseDouble(heightStr);
					
					
					/* if the user enters a valid height value */
					if (height >= 0) 
					{
						/* break out of the loop */
						break;
						
					}
					
					/* if the user enters a negative number */	
					else {
						
						/* display error message */
						JOptionPane.showMessageDialog(null, "Invalid input please enter a positive number", "Negative Number",JOptionPane.INFORMATION_MESSAGE);
						
					}
				
				} 
				
				/* catch any symbols or characters entered for the height */
				catch(NumberFormatException e) 
				
				  {
					/* display error message */
					JOptionPane.showMessageDialog(null, "Invalid input please enter a number", "Number Not Entered", JOptionPane.INFORMATION_MESSAGE);
			
				  }
				
			/* continue to ask the use for valid input */	
			} while (height <= 0);
			
			/* a do loop to get a valid choice of triangle width from the user */
			do {
				
					
				try {
					/* ask the user for the width */
					widthStr = JOptionPane.showInputDialog(null, "Enter the width of the triangle in meters", "Triangle Width", JOptionPane.INFORMATION_MESSAGE);
					
					/* convert the width to a double */
					width = Double.parseDouble(widthStr);
					
					/* break out of the loop if the user enters 1 or 2 */
					if (width >= 0) 
					{
						/* break out of the loop if the user enters 1 or 2 */
						break;
						
					}
					
					/* if the user enters a negative number */	
					else {
						
						/* display error message */
						JOptionPane.showMessageDialog(null, "Invalid input please enter a positive number", "Negative Number",JOptionPane.INFORMATION_MESSAGE);
						
					}
				
				} 
				/* catch any symbols or characters entered for the width */
				catch(NumberFormatException e) 
				
					{
					/* display error message */
					JOptionPane.showMessageDialog(null, "Invalid input please enter a number", "Number Not Entered", JOptionPane.INFORMATION_MESSAGE);
			
				    }
					
				
			} while (width <= 0);
			
			/* calculate the area of the triangle with valid input */
			area = 0.5 * height * width;
			
			/* display the result */
			JOptionPane.showMessageDialog(null, "The area of the triangle is " + area + "m^2");
			
			/* exit the program */
			System.exit(0);
			
		}
		
		/* if the rectangle option is selected */
		else 
			
		{
			/* a do loop to get a valid choice of rectangle height from the user */
			do {
				
				try {
					
					/* ask the user for the height */	
					heightStr = JOptionPane.showInputDialog(null, "Enter the height of the rectangle in meters", "Rectangle Height", JOptionPane.INFORMATION_MESSAGE);
					
					/* convert the string to a double */
					height = Double.parseDouble(heightStr);
					
					/* if a valid height is entered */
					if (height >= 0) 
					{
						/* break out of the loop */
						break;
						
					}
					
					/* if a negative number is entered */	
					else {
						/* display error message */
						JOptionPane.showMessageDialog(null, "Invalid input please enter a positive number", "Negative Number",JOptionPane.INFORMATION_MESSAGE);
						
					}
				
				} 
				/* catch any symbols or characters entered for the height */
				catch(NumberFormatException e) 
				
					{
					/* display error message */
					JOptionPane.showMessageDialog(null, "Invalid input please enter a number", "Number Not Entered", JOptionPane.INFORMATION_MESSAGE);
			
				  }
					
				
			} while (height <= 0);
			
			
			do {
				
				try {
			
					/* ask the user for the width */	
					widthStr = JOptionPane.showInputDialog(null, "Enter the width of the rectangle in meters", "Rectangle Width", JOptionPane.INFORMATION_MESSAGE);
					
					/* convert the string to a double */
					width = Double.parseDouble(widthStr);
					
					/* if a valid width is entered */
					if (width >= 0) 
					{
						/* break out of the loop */
						break;
						
					}
					
					/* if the user enters a negative number */	
					else 
					{
						
						/* display error message */
						JOptionPane.showMessageDialog(null, "Invalid input please enter a positive number", "Negative Number",JOptionPane.INFORMATION_MESSAGE);
						
					}
				
				} 
				
				/* catch any symbols or characters entered for the width */
				catch(NumberFormatException e) 
				
					{
					/* display error message */
					JOptionPane.showMessageDialog(null, "Invalid input please enter a number", "Number Not Entered", JOptionPane.INFORMATION_MESSAGE);
			
				}
					
				
			} while (width <= 0);
			
			/* calculate the area */
			area = height * width;
			
			/* display the result */
			JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area + "m^2", "Result", JOptionPane.INFORMATION_MESSAGE);
			
			/* exit the program */
			System.exit(0);
			
		}
			
			
	}
		
		
}

/**
 *
 * @author Ouda
 */

//importing the libraries that will be needed in this program

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//the class with button and main method
public class SortGUI {

	// import javax.swing.JFrame;

	// a variable that holds the amount of time for the selection sort takes to
	// execute
	public static double selectionTime = 0.0;
	// a variable that holds the amount of time for the recursive merge sort takes
	// to execute
	public static double rmergeTime = 0.0;
	// a variable that holds the amount of time for the iterative merge sort takes
	// to execute
	public static double imergeTime = 0.0;

	public static double insertionTime = 0.0;

	public static double bubbleTime = 0.0;

	// Sam Spell quick Sort
	public static double quickTime = 0.0;

	public static double radixTime = 0.0;
	public static double shellTime = 0.0;

	// Boolean variable that is made to keep track whether or not the selection sort
	// has already been used
	public boolean Selection_Done = false;

	public boolean Insertion_Done = false;

	public boolean Bubble_Done = false;

	// Boolean variable that is made to keep track whether or not the recursive
	// merge sort has already been used
	public boolean Recersive_Merge_Done = false;
	// Boolean variable that is made to keep track whether or not the iterative
	// merge sort has already been used
	public boolean Iterative_Merge_Done = false;
	// Sam Spell quick sort
	public boolean Quick_Sort_Done = false;
	public boolean Radix_Done = false;
	public boolean Shell_Done = false;
	// Making a object from the class SortShow
	SortShow sortArea = new SortShow();

	// Default constructor for SortGUI
	public SortGUI() {
		// making a MyScreen object

		// You need to adjust the following values to your Screen dimensions

		MyScreen screen = new MyScreen();
		// Setting a title to the GUI window
		screen.setTitle("Assignment-1 Group 2");
		// setting the size of the window
		screen.setSize(975 + sortArea.total_number_of_lines, 450);
		// the operation when the frame is closed
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// is set to true to display the frame
		screen.setVisible(true);
	}

	// A public class that extends JFrame
	public class MyScreen extends JFrame {
		// making a scramble button with a text "Scramble Lines" on it
		JButton scramble_button = new JButton("Scramble Lines");
		// making a selection button with a text "Selection" on it
		JRadioButton selection = new JRadioButton("Selection");
		// making a recursive merge button with a text "Scramble Lines" on it
		JRadioButton rmerge = new JRadioButton("Merge Recursive");

		JRadioButton insertion = new JRadioButton("Insertion");

		JRadioButton bubble = new JRadioButton("Bubble");

		JRadioButton radixsort = new JRadioButton("Radix Sort");

		JRadioButton shellsort = new JRadioButton("Shell Sort");

		// making a iterative merge button with a text "Selection" on it
		JRadioButton imerge = new JRadioButton("Merge Iterative");
		// Sam Spell quick sort

		JRadioButton quicksort = new JRadioButton("Quick Sort Recursive");
		// making a reset button with a text "Selection" on it
		JRadioButton reset = new JRadioButton("Reset");

		// A label that displays the time it took for the Selection sort took to execute
		JLabel selection_time_label = new JLabel("Selection Time");
		JLabel selection_time_taken = new JLabel("");

		JLabel insertion_time_label = new JLabel("Insertion Time");
		JLabel insertion_time_taken = new JLabel("");

		JLabel bubble_time_label = new JLabel("Bubble Time");
		JLabel bubble_time_taken = new JLabel("");

		// A label that displays the time it took for the recursive merge sort took to
		// execute
		JLabel rmerge_time_label = new JLabel("Merge-Rec Time");
		JLabel rmerge_time_taken = new JLabel("");

		// A label that displays the time it took for the iterative merge sort took to
		// execute
		JLabel imerge_time_label = new JLabel("Merge-Ita Time");
		JLabel imerge_time_taken = new JLabel("");

		JLabel quicksort_time_label = new JLabel("Quick-Rec Time");
		JLabel quicksort_time_taken = new JLabel("");

		JLabel radixsort_time_label = new JLabel("Radix Time");
		JLabel radixsort_time_taken = new JLabel("");

		JLabel shellsort_time_label = new JLabel("Shell Time");
		JLabel shellsort_time_taken = new JLabel("");

		// the default constructor for the class MyScreen
		public MyScreen() {
			// Panel where sorted lines_lengths will displayed
			// The time displayed for selection sort will be the colour red
			selection_time_taken.setForeground(Color.RED);
			// The time displayed for recursive merge sort will be the colour red

			insertion_time_taken.setForeground(Color.RED);

			bubble_time_taken.setForeground(Color.RED);

			rmerge_time_taken.setForeground(Color.RED);
			// The time displayed for iterative merge sort will be the colour red
			imerge_time_taken.setForeground(Color.RED);

			quicksort_time_taken.setForeground(Color.RED);
			// The selection button text will be the colour blue
			selection.setForeground(Color.BLUE);

			insertion.setForeground(Color.BLUE);

			bubble.setForeground(Color.BLUE);
			// The recursive merge button text will be the colour blue
			rmerge.setForeground(Color.BLUE);
			// The iterative merge button text will be the colour blue
			imerge.setForeground(Color.BLUE);
			quicksort.setForeground(Color.BLUE);

			radixsort.setForeground(Color.BLUE);
			shellsort.setForeground(Color.BLUE);

			// The scramble button's text will be blue
			scramble_button.setForeground(Color.BLUE);
			// setting the font of scramble button
			scramble_button.setFont(new Font("Arial", Font.BOLD, 15));
			// A Panel to hold the radio_button_selection and set the GridLayout
			JPanel radio_button_selection_Panel = new JPanel(new GridLayout(4, 1, 3, 3));

			// Adding the selection button to the radio_button_selection_Panel
			radio_button_selection_Panel.add(selection);
			// Adding the recursive merge button to the radio_button_selection_Panel

			radio_button_selection_Panel.add(insertion);

			radio_button_selection_Panel.add(bubble);

			radio_button_selection_Panel.add(rmerge);
			// Adding the iterative merge button to the radio_button_selection_Panel
			radio_button_selection_Panel.add(imerge);
			radio_button_selection_Panel.add(quicksort);

			radio_button_selection_Panel.add(radixsort);
			radio_button_selection_Panel.add(shellsort);

			// Adding the reset button to the radio_button_selection_Panel
			radio_button_selection_Panel.add(reset);
			// giving the radio_button_selection_Panel a border with a title
			radio_button_selection_Panel.setBorder(new javax.swing.border.TitledBorder("Sort Algorithms"));

			// A Panel to hold the time_Panel and set the GridLayout
			JPanel time_Panel = new JPanel(new GridLayout (5, 1, 3, 3));

			// Adding the selection_time_label to the time_Panel
			time_Panel.add(selection_time_label);
			// Adding the selection_time_taken to the time_Panel
			time_Panel.add(selection_time_taken);

			time_Panel.add(insertion_time_label);
			// Adding the selection_time_taken to the time_Panel
			time_Panel.add(insertion_time_taken);

			time_Panel.add(bubble_time_label);
			// Adding the selection_time_taken to the time_Panel
			time_Panel.add(bubble_time_taken);

			// Adding the rmerge_time_label to the time_Panel
			time_Panel.add(rmerge_time_label);
			// Adding the rmerge_time_taken to the time_Panel
			time_Panel.add(rmerge_time_taken);
			// Adding the imerge_time_label to the time_Panel
			time_Panel.add(imerge_time_label);
			// Adding the imerge_time_taken to the time_Panel
			time_Panel.add(imerge_time_taken);

			time_Panel.add(quicksort_time_label);
			time_Panel.add(quicksort_time_taken);

			time_Panel.add(radixsort_time_label);
			time_Panel.add(radixsort_time_taken);

			time_Panel.add(shellsort_time_label);
			time_Panel.add(shellsort_time_taken);

			// A Panel to hold the buttons_area_Panel and set the GridLayout
			// This buttons_area_Panel will hold scrambleButton, radio_button_selection and
			// the time_Panel
			JPanel buttons_area_Panel = new JPanel(new GridLayout(5, 1, 5, 5));
			// adding scramble_button to the buttons_area_Panel
			buttons_area_Panel.add(scramble_button);
			// adding radio_button_selection_Panel to the buttons_area_Panel
			buttons_area_Panel.add(radio_button_selection_Panel);
			// adding time_Panel to the buttons_area_Panel
			buttons_area_Panel.add(time_Panel);

			// placing the buttons_area_Panel to the east side of the window
			add(buttons_area_Panel, BorderLayout.EAST);
			// placing the sortArea object in the center of the window
			add(sortArea, BorderLayout.CENTER);
			// setting all booleans to false
			Set_Available_Chooses(false, false, false, false, false, false, false, false, true);

			// The following code is for creating a listener for each GUI element

			// Creating an action listener for scramble button
			// This button will be used to scramble the lines in a random way
			// this same scrambled lines will be used for all threes sort methods used in
			// this program
			scramble_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Scrambling the lines_lengths array
					sortArea.scramble_the_lines();
					// Since it has already been clicked, it will no longer be enabled
					scramble_button.setEnabled(false);
					// setting all booleans true except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			// Creating an action listener for selection button
			selection.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the selection sort method
					sortArea.SelectionSort();
					// Selection sort has finished/been clicked
					Selection_Done = true;
					// The amount of time taken for selection sort took
					selection_time_taken.setText(selectionTime / 1000 + " Seconds");
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			insertion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the selection sort method
					sortArea.InsertionSort();
					// Selection sort has finished/been clicked
					Insertion_Done = true;
					// The amount of time taken for selection sort took
					insertion_time_taken.setText(insertionTime / 1000 + " Seconds");
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			bubble.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the selection sort method
					sortArea.BubbleSort();
					// Selection sort has finished/been clicked
					Bubble_Done = true;
					// The amount of time taken for selection sort took
					bubble_time_taken.setText(bubbleTime / 1000 + " Seconds");
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			// Creating an action listener for recursive merge button
			rmerge.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the recursive merge sort method
					sortArea.R_MergeSort();
					// The amount of time taken for recursive merge sort took
					rmerge_time_taken.setText((rmergeTime / 1000) + " Seconds");
					// recursive merge sort has finished/been clicked
					Recersive_Merge_Done = true;
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			// Creating an action listener for iterative merge button
			imerge.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the iterative merge sort method
					sortArea.I_MergeSort();
					// The amount of time taken for iterative merge sort took
					imerge_time_taken.setText((imergeTime / 1000) + " Seconds");
					// iterative merge sort has finished/been clicked
					Iterative_Merge_Done = true;
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			quicksort.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Sorting the array in the iterative merge sort method
					sortArea.Quick_Sort_Recursive();
					// The amount of time taken for iterative merge sort took
					quicksort_time_taken.setText((quickTime / 1000) + " Seconds");
					// iterative merge sort has finished/been clicked
					Quick_Sort_Done = true;
					// setting all booleans false except for reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			radixsort.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Call the Radix Sort method
					sortArea.RadixSort();
					// Display the time taken for Radix Sort
					radixsort_time_taken.setText((radixTime / 1000) + " Seconds");
					Radix_Done = true;
					// Disable other sorting options except reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			shellsort.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Call the Shell Sort method
					sortArea.ShellSort();
					// Display the time taken for Shell Sort
					shellsort_time_taken.setText((shellTime / 1000) + " Seconds");
					Shell_Done = true;
					// Disable other sorting options except reset
					Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
				}
			});

			// Creating an action listener for reset button
			// Creating an action listener for the reset button

			reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Disabling the reset button since it was clicked
					reset.setEnabled(false);
					// Resetting the lines_lengths to their scrambled state
					sortArea.reset();

					// If all sorts are done, enable the scramble button
					if (Selection_Done && Recersive_Merge_Done && Iterative_Merge_Done && Insertion_Done && Bubble_Done
							&& Quick_Sort_Done && Radix_Done && Shell_Done) {
						scramble_button.setEnabled(true);

						// Reset all sorting completion flags
						resetSortingFlags();
						Set_Available_Chooses(false, false, false, false, false, false, false, false, true);
						// Reset time labels
						resetTimeLabels();

					} else {
						updateButtonStates();
					}
				}
			});

		}

		// all should be set to false.
		private void resetSortingFlags() {
			Selection_Done = false;
			Recersive_Merge_Done = false;
			Iterative_Merge_Done = false;
			Insertion_Done = false;
			Bubble_Done = false;
			Quick_Sort_Done = false;
			Radix_Done = false;
			Shell_Done = false;
		}

		// this is to extract out sections of the action listen code
		private void resetTimeLabels() {
			selection_time_taken.setText("");
			insertion_time_taken.setText("");
			bubble_time_taken.setText("");
			rmerge_time_taken.setText("");
			imerge_time_taken.setText("");
			quicksort_time_taken.setText("");
			radixsort_time_taken.setText("");
			shellsort_time_taken.setText("");
		}

		// bools need to be updated for inverse of what they are
		private void updateButtonStates() {
			boolean selection_state = !Selection_Done;
			boolean rmerge_state = !Recersive_Merge_Done;
			boolean imerge_state = !Iterative_Merge_Done;
			boolean insertion_state = !Insertion_Done;
			boolean bubble_state = !Bubble_Done;
			boolean quicksort_state = !Quick_Sort_Done;
			boolean radixsort_state = !Radix_Done;
			boolean shellsort_state = !Shell_Done;

			Set_Available_Chooses(selection_state, rmerge_state, imerge_state, insertion_state, bubble_state,
					quicksort_state, radixsort_state, shellsort_state, false);
		}

		/*
		 * reset.addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent e) {
		 * // Disabling the reset button since it was clicked
		 * reset.setEnabled(false);
		 * // Resetting the lines_lengths to their scrambled state
		 * sortArea.reset();
		 * 
		 * 
		 * Set_Available_Chooses(Selection_Done, Recersive_Merge_Done,
		 * Iterative_Merge_Done, Insertion_Done, Bubble_Done, Quick_Sort_Done,
		 * Radix_Done, Shell_Done, false);
		 * 
		 * 
		 * // There are many different combinations of what could be clicked
		 * // Handling the different combinations of completed sorts
		 * if (Selection_Done && Recersive_Merge_Done && Iterative_Merge_Done &&
		 * Insertion_Done
		 * && Bubble_Done && Quick_Sort_Done && Radix_Done && Shell_Done) {
		 * // If all sorts are done, enable scramble button
		 * scramble_button.setEnabled(true);
		 * // Reset all sorting completion flags
		 * Selection_Done = false;
		 * Recersive_Merge_Done = false;
		 * Iterative_Merge_Done = false;
		 * Insertion_Done = false;
		 * Bubble_Done = false;
		 * Quick_Sort_Done = false;
		 * Radix_Done = false;
		 * Shell_Done = false;
		 * 
		 * // Disable sorting buttons and reset time labels
		 * Set_Available_Chooses(false, false, false, false, false, false, false);
		 * selection_time_taken.setText("");
		 * insertion_time_taken.setText("");
		 * bubble_time_taken.setText("");
		 * rmerge_time_taken.setText("");
		 * imerge_time_taken.setText("");
		 * quicksort_time_taken.setText("");
		 * radixsort_time_taken.setText("");
		 * shellsort_time_taken.setText("");
		 * 
		 * 
		 * }else if (Recersive_Merge_Done && Iterative_Merge_Done) {
		 * Set_Available_Chooses(true, false, false, true, true, false, false, false);
		 * 
		 * } else if (Selection_Done && Recersive_Merge_Done) {
		 * Set_Available_Chooses(false, false, true, true, true, false, false, false);
		 * 
		 * } else if (Selection_Done && Iterative_Merge_Done) {
		 * Set_Available_Chooses(false, true, false, true, true, false, false, false);
		 * 
		 * } else if (Selection_Done) {
		 * Set_Available_Chooses(false, true, true, true, true, false, false, false);
		 * 
		 * } else if (Recersive_Merge_Done) {
		 * Set_Available_Chooses(true, false, true, true, true, false, false, false);
		 * 
		 * } else if (Insertion_Done) {
		 * Set_Available_Chooses(true, false, true, false, true, false, false, false);
		 * 
		 * } else if (Bubble_Done) {
		 * Set_Available_Chooses(true, false, true, true, false, false, false, false);
		 * 
		 * } else if (Radix_Done){
		 * Set_Available_Chooses(true, false, true, true, true, false, false, false);
		 * 
		 * } else if (Shell_Done) {
		 * Set_Available_Chooses(true, false, true, true, true, true, false, false);
		 * 
		 * } else {
		 * Set_Available_Chooses(true, true, false, false, false, false, false, false);
		 * }
		 * }
		 * });
		 * 
		 * }
		 */

		// Sam Spell need to add quick
		// A method that sets if the button are enabled or disabled
		public void Set_Available_Chooses(boolean selection_state, boolean rmerge_state, boolean imerge_state,
				boolean insertion_state, boolean bubble_state, boolean quicksort_state, boolean radixsort_state,
				boolean shellsort_state, boolean reset_state) {
			this.selection.setEnabled(selection_state);

			this.insertion.setEnabled(insertion_state);
			this.bubble.setEnabled(bubble_state);

			this.rmerge.setEnabled(rmerge_state);
			this.imerge.setEnabled(imerge_state);
			this.quicksort.setEnabled(quicksort_state);
			this.radixsort.setEnabled(radixsort_state);
			this.shellsort.setEnabled(shellsort_state);
			this.reset.setEnabled(reset_state);

		}
	}

	// The main method
	public static void main(String[] args) {
		// initialize the class
		SortGUI sort_GUI = new SortGUI();

	}

}

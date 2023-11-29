/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplegui;

//Import Swing library
import javax.swing.*;

//Create Class with JFrame for GUI
public class SimpleGUI extends JFrame {
    // Constructor for GUI class
    public SimpleGUI() {
        // Create JButton component with "text"
        JButton button = new JButton("Click Me");
        // Add button to JFrame
        add(button);
        // Set title of JFrame
        setTitle("Simple GUI Example");
        // Set dimensions of JFrame (width: 300, height: 200)
        setSize(300, 200);
        // Set default close operation to exit app when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make JFrame visible
        setVisible(true);
    }
    // Main method to start the GUI
    public static void main(String[] args) {
        // Create an instance of the SimpleGUI class to display the GUI
        new SimpleGUI();
    }
}

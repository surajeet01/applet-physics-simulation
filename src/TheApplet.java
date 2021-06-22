// STANDING WAVE (EXPLANATION BY SUPERPOSITION WITH THE REFLECTED WAVE)
// SURAJEET BHARATI , JUNE-2013

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TheApplet extends JApplet implements ActionListener, Runnable{

	private int repeat =1;
	private boolean isStart = false;
	private StartingCanvas canvas; 
	private JButton btn1, btn2;	
	private JTextField txt;
	
	public void init() {
		canvas = new StartingCanvas();
		setSize(700,400);
		JPanel buttonBar = new JPanel();  //NEW PANEL WHICH CONTAINS CONTROL BUTTONS
		
		buttonBar.setBackground(Color.GREEN);  
		buttonBar.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0,15,10,15);
		
		
		
		btn1 = new JButton("Start");
		c.gridy = 1;
		buttonBar.add(btn1,c);
				
		btn2 = new JButton("Reset");
		c.gridy = 2;
		buttonBar.add(btn2,c);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		Container Pane = getContentPane();
		Pane.setLayout(new BorderLayout(0, 0));
		Pane.add("Center",canvas);
		Pane.add("East",buttonBar);
	}
	
	
	
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	
	public void run() {
			int i=0;
			if(isStart){
				try{
					Thread.sleep(4000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				while(i<repeat){
					i++;
					canvas.change(1);
					try{
						Thread.sleep(4000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(2);	
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(3);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(4);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(3);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(5);
					try{
						Thread.sleep(4000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(6);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(7);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(8);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(7);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
			
					canvas.change(9);
					try{
						Thread.sleep(4000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(10);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(11);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(12);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(11);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
				
					canvas.change(13);
					try{
						Thread.sleep(4000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(14);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(15);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(16);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
					canvas.change(15);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
				canvas.change(0);
			}
	}

	
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();		    //FINDING SOURCE BUTTON OF EVENT
		if(src instanceof JButton){
			JButton JBtn = (JButton)src;    //DOWNCASTING TO BUTTON
			if(JBtn == btn1){			    //FOR PAUSE/RESUME BUTTON
				if(!isStart){
					this.isStart = true;
					btn1.setText("Pause");
					start();
				}
			}
			else{								// FOR RESET BUTTON
				canvas.reset();
			}
		}
	}
}

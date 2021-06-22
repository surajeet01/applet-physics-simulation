import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class StartingCanvas extends Canvas{
	
	
	private Graphics doubleG;
	private Image i;
	
	int radius=15;

	private LightSet upper, lower, right, left;
	public StartingCanvas() {
		upper = new LightSet();
		upper.setId(1);
		upper.setLocationX(250);
		upper.setLocationY(20);
		upper.setRed(false);
		upper.setYellow(false);
		upper.setGreenL(false);
		upper.setGreenR(false);
		upper.setGreenS(false);
		upper.setPedes(false);
		
		lower = new LightSet();
		lower.setId(2);
		lower.setLocationX(250);
		lower.setLocationY(200);
		lower.setRed(false);
		lower.setYellow(false);
		lower.setGreenL(false);
		lower.setGreenR(false);
		lower.setGreenS(false);
		lower.setPedes(false);
		
		left = new LightSet();
		left.setId(3);
		left.setLocationX(10);
		left.setLocationY(160);
		left.setRed(false);
		left.setYellow(false);
		left.setGreenL(false);
		left.setGreenR(false);
		left.setGreenS(false);
		left.setPedes(false);
		
		right = new LightSet();
		right.setId(4);
		right.setLocationX(470);
		right.setLocationY(160);
		right.setRed(false);
		right.setYellow(false);
		right.setGreenL(false);
		right.setGreenR(false);
		right.setGreenS(false);
		right.setPedes(false);
	}
	

	public void change(int i){
		if(i==1){
			lower.setGreenS(true);
			lower.setGreenR(true);
			right.setRed(true);
			upper.setGreenL(true);
			left.setRed(true);
			left.setPedes(true);
		}
		
		else if(i==2){
			lower.setGreenS(false);
			lower.setGreenR(false);
			right.setRed(false);
			upper.setGreenL(false);
			left.setRed(false);
			left.setPedes(false);
			lower.setYellow(true);
			upper.setYellow(true);	
		}
		
		else if(i==3){
			left.setRed(true);
			right.setRed(true);
			left.setPedes(true);
		}
		
		else if(i==4){
			left.setRed(false);
			right.setRed(false);
			left.setPedes(false);
		}
		
		else if(i==5){
			left.setRed(false);
			right.setRed(false);
			left.setPedes(false);
			lower.setYellow(false);
			upper.setYellow(false);
			
			lower.setRed(true);
			lower.setPedes(true);
			right.setGreenR(true);
			right.setGreenS(true);
			upper.setRed(true);
			left.setGreenL(true);
		}
		
		else if(i==6){
			lower.setRed(false);
			lower.setPedes(false);
			right.setGreenR(false);
			right.setGreenS(false);
			upper.setRed(false);
			left.setGreenL(false);
			
			left.setYellow(true);
			right.setYellow(true);
		}
		
		else if(i==7){
			lower.setPedes(true);
			lower.setRed(true);
			upper.setRed(true);	
		}
		
		else if(i==8){
			lower.setPedes(false);
			lower.setRed(false);
			upper.setRed(false);
			
		}
		
		else if(i==9){
			lower.setPedes(false);
			lower.setRed(false);
			upper.setRed(false);
			left.setYellow(false);
			right.setYellow(false);
			
			lower.setGreenL(true);
			right.setRed(true);
			right.setPedes(true);
			upper.setGreenS(true);
			upper.setGreenR(true);
			left.setRed(true);
		}
		
		else if(i==10){
			lower.setGreenL(false);
			right.setRed(false);
			right.setPedes(false);
			upper.setGreenS(false);
			upper.setGreenR(false);
			left.setRed(false);
			
			lower.setYellow(true);
			upper.setYellow(true);
		}
		
		else if(i==11){
			right.setRed(true);
			right.setPedes(true);
			left.setRed(true);
		}
		
		else if(i==12){
			right.setRed(false);
			right.setPedes(false);
			left.setRed(false);	
		}
		
		else if(i==13){
			lower.setYellow(false);
			upper.setYellow(false);
			right.setRed(false);
			right.setPedes(false);
			left.setRed(false);
			
			upper.setRed(true);
			upper.setPedes(true);
			left.setGreenS(true);
			left.setGreenR(true);
			right.setGreenL(true);
			lower.setRed(true);
		}
		
		else if(i==14){
			upper.setRed(false);
			upper.setPedes(false);
			left.setGreenS(false);
			left.setGreenR(false);
			right.setGreenL(false);
			lower.setRed(false);
			
			left.setYellow(true);
			right.setYellow(true);
		}
		
		else if(i==15){
			upper.setRed(true);
			upper.setPedes(true);
			lower.setRed(true);
		}
		
		else if(i==16){
			upper.setRed(false);
			upper.setPedes(false);
			lower.setRed(false);
			
		}
		
		else if(i==0){
			upper.setRed(false);
			upper.setPedes(false);
			lower.setRed(false);
			left.setYellow(false);
			right.setYellow(false);
		}
		repaint();
	}

	public void paint(Graphics g){
		paintLight(upper,g);
		paintLight(lower,g);
		paintLight(left,g);
		paintLight(right,g);
	}
		
	
	//--------------------SETTING DOUBLE BUFFER---------------------
	public void update(Graphics g) {
		if(i == null){
			i=createImage(this.getWidth(),this.getHeight());
			doubleG = i.getGraphics();
		}
		
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i,0,0,this);
	}
	
	
	//TO RESET THE CANVAS
	public void reset(){
		repaint();
	}
	
	public void paintLight(LightSet L,Graphics g){
		if(L.getId()==1){
			if(L.isRed())
				g.setColor(Color.red);
			else
				g.setColor(Color.red.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY(),2*L.getRadius(),2*L.getRadius());
			
			if(L.isYellow())
				g.setColor(Color.yellow);
			else
				g.setColor(Color.yellow.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY()+30,2*L.getRadius(),2*L.getRadius());
			
			if(L.isGreenR())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x1[] = {L.getLocationX()-45,L.getLocationX()-35,L.getLocationX()-35,L.getLocationX()-15,L.getLocationX()-15,L.getLocationX()-35,L.getLocationX()-35};
			int y1[] = {L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+70,L.getLocationY()+70,L.getLocationY()+80,L.getLocationY()+80,L.getLocationY()+85};
			g.fillPolygon (x1, y1, 7);
			
			
			if(L.isGreenL())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x2[] = {L.getLocationX()+80,L.getLocationX()+70,L.getLocationX()+70,L.getLocationX()+50,L.getLocationX()+50,L.getLocationX()+70,L.getLocationX()+70};
			int y2[] = {L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+70,L.getLocationY()+70,L.getLocationY()+80,L.getLocationY()+80,L.getLocationY()+85};
			g.fillPolygon (x2, y2, 7);
			
			
			if(L.isGreenS())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			
			int x3[] = {L.getLocationX()+15,L.getLocationX()+25,L.getLocationX()+25,L.getLocationX()+30,L.getLocationX()+20,L.getLocationX()+10,L.getLocationX()+15};
			int y3[] = {L.getLocationY()+65,L.getLocationY()+65,L.getLocationY()+85,L.getLocationY()+85,L.getLocationY()+95,L.getLocationY()+85,L.getLocationY()+85};
			g.fillPolygon (x3, y3, 7);
			
			//Pedestrian
			g.fillRect(320,130, 5, 5);
			g.drawLine(321, 135, 315, 143);
			g.drawLine(321, 136, 315, 144);
			g.drawLine(324, 135, 329, 143);
			g.drawLine(324, 136, 329, 144);
			g.fillRect(321,135, 4, 6);
			g.fillRect(322,141,2,1);
			g.fillRect(320,142,2,8);
			g.fillRect(324,142,2,8);
			
		}
		
		else if(L.getId()==2){
			if(L.isRed())
				g.setColor(Color.red);
			else
				g.setColor(Color.red.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY()+130,2*L.getRadius(),2*L.getRadius());
			
			if(L.isYellow())
				g.setColor(Color.yellow);
			else
				g.setColor(Color.yellow.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY()+100,2*L.getRadius(),2*L.getRadius());
			
			if(L.isGreenL())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x1[] = {L.getLocationX()-45,L.getLocationX()-35,L.getLocationX()-35,L.getLocationX()-15,L.getLocationX()-15,L.getLocationX()-35,L.getLocationX()-35};
			int y1[] = {L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+70,L.getLocationY()+70,L.getLocationY()+80,L.getLocationY()+80,L.getLocationY()+85};
			g.fillPolygon (x1, y1, 7);
			
			
			if(L.isGreenR())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x2[] = {L.getLocationX()+80,L.getLocationX()+70,L.getLocationX()+70,L.getLocationX()+50,L.getLocationX()+50,L.getLocationX()+70,L.getLocationX()+70};
			int y2[] = {L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+70,L.getLocationY()+70,L.getLocationY()+80,L.getLocationY()+80,L.getLocationY()+85};
			g.fillPolygon (x2, y2, 7);
			
			
			if(L.isGreenS())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			
			int x3[] = {L.getLocationX()+15,L.getLocationX()+25,L.getLocationX()+25,L.getLocationX()+30,L.getLocationX()+20,L.getLocationX()+10,L.getLocationX()+15};
			int y3[] = {L.getLocationY()+95,L.getLocationY()+95,L.getLocationY()+75,L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+75,L.getLocationY()+75};
			
			g.fillPolygon (x3, y3, 7);
		}
		
		else if(L.getId()==3){
			if(L.isRed())
				g.setColor(Color.red);
			else
				g.setColor(Color.red.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY(),2*L.getRadius(),2*L.getRadius());
			
			if(L.isYellow())
				g.setColor(Color.yellow);
			else
				g.setColor(Color.yellow.darker().darker());
			g.fillOval(L.getLocationX()+35,L.getLocationY(),2*L.getRadius(),2*L.getRadius());
			
			if(L.isGreenR())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x1[] = {L.getLocationX()+75,L.getLocationX()+85,L.getLocationX()+85,L.getLocationX()+90,L.getLocationX()+80,L.getLocationX()+70,L.getLocationX()+75};
			int y1[] = {L.getLocationY()+45,L.getLocationY()+45,L.getLocationY()+65,L.getLocationY()+65,L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+65};
			g.fillPolygon (x1, y1, 7);
			
			
			if(L.isGreenL())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x2[] = {L.getLocationX()+75,L.getLocationX()+85,L.getLocationX()+85,L.getLocationX()+90,L.getLocationX()+80,L.getLocationX()+70,L.getLocationX()+75};
			int y2[] = {L.getLocationY()-15,L.getLocationY()-15,L.getLocationY()-35,L.getLocationY()-35,L.getLocationY()-45,L.getLocationY()-35,L.getLocationY()-35};
			g.fillPolygon (x2, y2, 7);
			
			
			if(L.isGreenS())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x3[] = {L.getLocationX()+100,L.getLocationX()+90,L.getLocationX()+90,L.getLocationX()+70,L.getLocationX()+70,L.getLocationX()+90,L.getLocationX()+90};
			int y3[] = {L.getLocationY()+15,L.getLocationY()+5,L.getLocationY()+10,L.getLocationY()+10,L.getLocationY()+20,L.getLocationY()+20,L.getLocationY()+25};
			g.fillPolygon (x3, y3, 7);
		}
		
		else if(L.getId()==4){
			if(L.isRed())
				g.setColor(Color.red);
			else
				g.setColor(Color.red.darker().darker());
			g.fillOval(L.getLocationX()+5,L.getLocationY(),2*L.getRadius(),2*L.getRadius());
			
			if(L.isYellow())
				g.setColor(Color.yellow);
			else
				g.setColor(Color.yellow.darker().darker());
			g.fillOval(L.getLocationX()-25,L.getLocationY(),2*L.getRadius(),2*L.getRadius());
			
			if(L.isGreenR())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x1[] = {L.getLocationX()-45,L.getLocationX()-35,L.getLocationX()-35,L.getLocationX()-30,L.getLocationX()-40,L.getLocationX()-50,L.getLocationX()-45};
			int y1[] = {L.getLocationY()-15,L.getLocationY()-15,L.getLocationY()-35,L.getLocationY()-35,L.getLocationY()-45,L.getLocationY()-35,L.getLocationY()-35};
			g.fillPolygon (x1, y1, 7);
			
			
			if(L.isGreenS())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x2[] = {L.getLocationX()-70,L.getLocationX()-60,L.getLocationX()-60,L.getLocationX()-40,L.getLocationX()-40,L.getLocationX()-60,L.getLocationX()-60};
			int y2[] = {L.getLocationY()+15,L.getLocationY()+5,L.getLocationY()+10,L.getLocationY()+10,L.getLocationY()+20,L.getLocationY()+20,L.getLocationY()+25};
			g.fillPolygon (x2, y2, 7);
			
			
			if(L.isGreenL())
				g.setColor(Color.green);
			else
				g.setColor(Color.green.darker().darker());
			int x3[] = {L.getLocationX()-45,L.getLocationX()-35,L.getLocationX()-35,L.getLocationX()-30,L.getLocationX()-40,L.getLocationX()-50,L.getLocationX()-45};
			int y3[] = {L.getLocationY()+45,L.getLocationY()+45,L.getLocationY()+65,L.getLocationY()+65,L.getLocationY()+75,L.getLocationY()+65,L.getLocationY()+65};
			g.fillPolygon (x3, y3, 7);
		}
	}
}

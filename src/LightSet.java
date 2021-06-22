import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;



public class LightSet {
	private int radius=15;
	private int locationX;
	private int locationY;
	private boolean red;
	private boolean yellow;
	private boolean greenL;
	private boolean greenR;
	private boolean greenS;
	private boolean pedes;
	
	private int id;
	
	
	
	public boolean isRed() {
		return red;
	}
	public void setRed(boolean red) {
		this.red = red;
	}
	public boolean isYellow() {
		return yellow;
	}
	public void setYellow(boolean yellow) {
		this.yellow = yellow;
	}
	public boolean isGreenL() {
		return greenL;
	}
	public void setGreenL(boolean greanL) {
		this.greenL = greanL;
	}
	public boolean isGreenR() {
		return greenR;
	}
	public void setGreenR(boolean greenR) {
		this.greenR = greenR;
	}
	public boolean isGreenS() {
		return greenS;
	}
	public void setGreenS(boolean greenS) {
		this.greenS = greenS;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPedes() {
		return pedes;
	}
	public void setPedes(boolean pedes) {
		this.pedes = pedes;
	}
	
}

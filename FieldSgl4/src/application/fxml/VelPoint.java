package application.fxml;

public class VelPoint {

    public VelPoint(double pointX, double pointY, double velocityX, double velocityY) {
		X = pointX;
		Y = pointY;
		velX = velocityX;
		velY = velocityY;
	}
	
	public double getX(){
		return X;
	}
	
	public double getY(){
		return Y;
	}
	
	public double getvelX(){
		return velX;
	}
	
	public double getvelY(){
		return velY;
	}
	
	
	private double X;
	
	private double Y;
	
	private double velX;
	
	private double velY;

}

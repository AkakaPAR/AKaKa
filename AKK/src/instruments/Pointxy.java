package instruments;

public class Pointxy {
	private double x;
	private double y;
	public Pointxy(double a, double b){
		x = a;
		y = b;
	}
	public Pointxy(Pointxy asample){
		x = asample.getX();
		y = asample.getY();
	}
	public double getX (){
		return x;
	}
	public double getY (){
		return y;
	}
	public void setX (double newx){
		x = newx;
	}
	public void setY (double newy){
		y = newy;
	}
	
}

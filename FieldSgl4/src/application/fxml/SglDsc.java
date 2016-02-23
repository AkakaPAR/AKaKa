package application.fxml;

public class SglDsc {

	public SglDsc(double X, double Y, double aPower, SglType aType) {
		x = X;
		y = Y;
		power = aPower / (2 * Math.PI);
		type = aType;
	}
	
	enum SglType{VORTEX, SOURCE}; 

	double x;
	
    double y;
	
	double power;
	
	SglType type;
	
	public double getdX(double x0){
		return x0 - x;
	}
	
	public double getdY(double y0){
		return y0 - y;
	}
	
	public double getPower(){
		return power;
	}
	
	public SglType getType(){
		return type;
	}
	
	public double getR2(double x0, double y0){
		return ((x - x0) * (x - x0) + (y - y0) * (y - y0));
	}
}

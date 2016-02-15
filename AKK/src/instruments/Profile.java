package instruments;

import java.util.ArrayList;
import java.util.List;



public class Profile {
	
	/*
	 *Точка носика
	 */
		private Pointxy nose = new Pointxy(0,0);
	/*
	 *Точка кромки
	 */
		private Pointxy trail = null;
	/*
	 *Синус альфа + фи
	 */
		private double sin = 0;
	/*
	 * Косинус альфа + фи
	 * 
	 */
		private double cos = 1;
		/*
		 *Внутренний повёрнутый список
		 */
		private List<Pointxy> list = null;
		
	
	public Profile(List<Pointxy> info, double alpha) {
		trail = new Pointxy(info.get(0));
		nose = findhord(info);
		setSinCos(alpha, nose, trail);
		turn(info);
	}
	
	public List<Pointxy> getlist(){
		return list;
	}
	
	public Pointxy getnose(){
		return nose;
	}
	
/**
 * Установка членов {@link sin} и {@link cos}
 * @param anAlpha - угол альфа
 * @param aNose - точка носика
 * @param aTrail - точка кромки
 */
	void setSinCos(double anAlpha, Pointxy aNose, Pointxy aTrail){
		double beta = Math.toRadians(anAlpha);
		double a = aTrail.getX() - aNose.getX();
		double b = aTrail.getY() - aNose.getY();
		double length = Math.sqrt((a * a) + (b * b));
		if(length != 0){
			//Установка синуса и косинуса фи 
		    double sinfi = a/length;
		    double cosfi = b/length;
		    sin = Math.sin(beta) * cosfi + Math.cos(beta) * sinfi;
		    cos = Math.cos(beta) * cosfi - Math.sin(beta) * sinfi;
		}
	}
	
	
	public void turn(List<Pointxy> points){
		if(list == null){
		  list = new ArrayList<>();
		}
		list.clear();
		list.addAll(points);
		for(Pointxy p: list){
			double x = (p.getX() - nose.getX())*cos + (p.getY() - nose.getY())*sin;
			double y = -(p.getX() - nose.getX())*sin + (p.getY() - nose.getY())*cos;
			p.setX(x);
			p.setY(y);
		}
	}	
	
	
	public static Pointxy findhord(List<Pointxy> info){
		Pointxy po = info.get(0), now = info.get(0);
		for(Pointxy p: info){
			if( Math.sqrt(Math.pow((po.getX() - p.getX()), 2) + Math.pow((po.getY() - p.getY()), 2)) > Math.sqrt(Math.pow((po.getX() - now.getX()), 2) + Math.pow((po.getY() - now.getY()), 2))){
				now = p;
			}
		}
		return now;
	}

}




// ============================================================================================

//@formatter:off
/*	
	
	public static void change(List<Pointxy> info, double x, double y){
		for(Pointxy p: info){
			double x1, y1;
			x1 = p.getX();
			y1 = p.getY();
			p.setX(x1-x);
			p.setY(y1-y);
		}
	}
	

	}
	
	public static void changeend(List<Pointxy> info, Pointxy end){
		double sinf = end.getY()/Math.sqrt(Math.pow(end.getX(), 2) + Math.pow(end.getY(), 2));
		double cosf = end.getX()/Math.sqrt(Math.pow(end.getX(), 2) + Math.pow(end.getY(), 2));
		double cosb, sinb, costrue, sintrue;
		for(Pointxy p: info){
			double x = p.getX();
			double y = p.getY();
			if((x == 0)&&(y == 0)){
				continue;
			}
			sinb = y/Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
			cosb = x/Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
			sintrue = sinf*cosb - cosf*sinb;
			costrue = cosf*cosb + sinf*sinb;
			p.setX(Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) * costrue);
			p.setY(Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) * sintrue);
		}
	}
	
	public static void changeattack(List<Pointxy> info, double alpha){
		double beta = Math.toRadians(alpha);
		double sinf = Math.sin(beta);
		double cosf = Math.cos(beta);
		double cosb, sinb, costrue, sintrue;
		for(Pointxy p: info){
			double x = p.getX();
			double y = p.getY();
			if((x == 0)&&(y == 0)){
				continue;
			}
			sinb = y/Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
			cosb = x/Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
			sintrue = sinb*cosf - cosb*sinf;
			costrue = cosb*cosf + sinb*sinf;
			p.setX(Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) * costrue);
			p.setY(Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) * sintrue);
		}
	}
	
*/
//@formatter:off	
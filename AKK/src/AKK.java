import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import instruments.Profile;
import instruments.Pointxy;

public class AKK {

	
	public static List<Pointxy> take(String str, String[] args){
		List<Pointxy> info = new ArrayList<>();
		BufferedReader in = null;
		 try {
		        in = new BufferedReader( new FileReader("D:/Works/Akaka/AKK/src/Norm.txt"));
		        info.clear();
		        while((str = in.readLine()) != null ){
		        	if(str.equals("")){
		        		continue;
		        	}
		        	String[] coord = str.split(",");
		        	double x = Double.parseDouble(coord[0]);
		        	double y = Double.parseDouble(coord[1]);
		        	info.add(new Pointxy(x, y));
		        	
		        }
		        Pointxy po = info.get(0);
		        info.add(new Pointxy(po.getX(), po.getY()));
		 }
		 catch (Exception e){
		  	 e.printStackTrace();
		   	 info.clear();
		 }
		 finally{
			 if(in != null){
			    try {
					in.close();
				} catch (IOException e) {
				}
			 }
		 }
		 return info;
	}

	public static void main(String[] args) {
		List<Pointxy> info, turn;
		System.out.println("¬ведите угол атаки в градусах");
	    Scanner sc = new Scanner(System.in);
        double  alpha = sc.nextDouble();
		String str = null;
		info = take(str, args);
		if(info.isEmpty()){
			System.out.println("ѕроизошла ошибка при считывании координат");
			sc.close();
			return;
		}
		Profile p = new Profile(info, alpha);
		turn = p.getlist();
		System.out.println(p.getnose().getX());
		System.out.println("x = " + p.getnose().getX() + "   y = " + p.getnose().getY());;
        System.out.println("¬ведите координату по хорде (от 0 до 2) где находить перпендикул€р");
        double  i = sc.nextDouble();
        sc.close();
	}

}

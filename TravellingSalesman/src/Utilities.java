
public class Utilities {
	
	
	public static double distance(double pointOneX, double pointOneY, double pointTwoX, double pointTwoY) {
		double base = pointOneX - pointTwoX;
		double height = pointOneY - pointTwoY;
		return pythagoras(base, height);
	}
	
	public static double pythagoras(double base, double height) {
		return Math.hypot(base, height);
//		return Math.sqrt((height*height)+(base*base));
	}
}

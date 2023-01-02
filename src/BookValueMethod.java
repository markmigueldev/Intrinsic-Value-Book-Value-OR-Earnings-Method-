/**
 * 
 * @author Mark
 *
 */
public class BookValueMethod {
	
	public double AverageBookValueChange(double cbv, double obv, int years) {
		double exp = 1.0/years;
		double base = cbv/obv;
		double a = Math.pow(base, exp);
		double c = 100*(a-1);
		return c;
	}
	
	public double IntrinsicValue(double coupon, double par, int year, double r, double bvc) {
		double percentage = (1+bvc/100);
		double base = Math.pow(percentage, year);
		double parr = par*base;
		r=r/100;
		double extra=Math.pow(1+r, year);
		double c = coupon*(1-(1/extra))/r+parr/extra;
		return c;
	}
	
	public static void main(String[] s) {
		BookValueMethod test = new BookValueMethod();
		double t1 = test.AverageBookValueChange(12, 1, 12);
		System.out.println(t1);
		double t2 = test.IntrinsicValue(1, 12, 10, 1, t1);
		System.out.println(t2);
	}
	
}

package Assignment;

public class MathUtils {
	
	
	
	 int add(int a , int b) {
		int addsum = a+b;
		return addsum;
	}
	 int substract(int a , int b) {
		int subvalue = a-b;
		return subvalue;
		
	}
	 int multiply(int a , int b) {
		int multvalue = a*b;
		return multvalue;
		
	}
	 double divide(int d, int e) {
		double divvalue = 0;
		if(e == 0) {
			divvalue = -1.0;
		}
		else {
		 divvalue = d/e;
		}
		return divvalue;
	}

	
}

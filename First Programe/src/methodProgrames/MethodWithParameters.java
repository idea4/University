package methodProgrames;

public class MethodWithParameters {
	
	public static void weekOfTheYear() {
		System.out.println("Year");

	}
	
	public void areaOfCircle (double radius) {
		System.out.println("Area of circle: " +Math.PI*radius*radius);
	
	}
	
	public void areaOfTriangle(double breadth, double height) {
		double area = (breadth/2)*height;
		System.out.printf("Area: %.2f /n", area);
	}

	public static void main(String[] args) {
		weekOfTheYear();
		
		
		

	}
	
	

}

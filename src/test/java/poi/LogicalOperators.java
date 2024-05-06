package poi;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a=200;
		int b=300;
		int c=400;
		int d=500;
		
        System.out.println(b>a || d>c);//true
		
		System.out.println(a>b || d>c);//true
		
		System.out.println(a>b || c>d);//false
		
		System.out.println(d>c || a>b);//true
		
		
		
		System.out.println(b>a && d>c);//true
		
		System.out.println(a>b && d>c);//false
		
		System.out.println(a>b && c>d);//false
		
		System.out.println(d>c && a>b);//false
		
		int f=10;
		System.out.println(f++);
        
	}
}

package testPackage;

public class Array2 {
	int a[] = {1,2,3,4,5,6};
	
	public static void main(String[] args) {
		Array2 a2= new Array2();
		
		String s[]= {"Apple","Chickoo","Banana","Pineapple","Orange"};
		Object b[] = {"Grapes","Selenium","Python",5.2,78,92};
		
		System.out.println(a2.a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		b[1]="Automation";
		System.out.println(b[1]);
	}

}

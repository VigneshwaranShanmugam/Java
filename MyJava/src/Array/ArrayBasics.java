package Array;

public class ArrayBasics {
 public static void main(String arg[]) {
	 int [] a;
	 a=new int[2];
	 a[0]=1;
	 a[1]=2;
	int[] b= {5,4,3,2,1};
	 int size=a.length;
	 System.out.println(size);
	 for(int i=0;i<size;i++) {
		 System.out.println("The value of a"+"["+i+"]"+" is "+a[i]);
	 }
	 for(int j=0;j<b.length;j++) {
		 System.out.println("The value of b"+"["+j+"]"+" is "+b[j]);
	 }
 }
}

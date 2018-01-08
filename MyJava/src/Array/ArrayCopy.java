package Array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a= {1,2};
		int[] b= {3};
		b=a;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		int [][] c=new int[3][];
		c[0]=new int[1];
		c[1]=new int[2];
		c[2]=new int[3];
		int[] d= {'a','b'};
		for(int j=0;j<d.length;j++)
		{
			System.out.println("The values in array d is :"+d[j]);
		}
		
		
		

	}

}

package array2Dimensi;

public class Array 
{
	public static void main(String[]args)
	{
		int a[][]= {{1,3,4},{3,4,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println("");
		}
	}
}

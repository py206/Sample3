package sample3_17;
import java.io.*; 
import java.io.BufferedReader;

public class sample3_17 {
	public static void main (String[]args)throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		System.out.println("�z��J���Ʀr�O"+num);
	}
}

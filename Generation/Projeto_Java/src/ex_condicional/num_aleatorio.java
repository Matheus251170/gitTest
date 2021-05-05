package ex_condicional;

import java.util.*;

public class num_aleatorio {

	public static void main(String[] args) {


		int[] array = new int [10];
		Random random = new Random();
		
		for(int x = 0; x <= 9; x++)
		{

			array[x] = random.nextInt(100);
			
		}
		
		
		for(int x = 0; x <= 9; x++)
		{
			System.out.println(array[x]);
		}
		
		
		
	}

}

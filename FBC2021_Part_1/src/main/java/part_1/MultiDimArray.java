package part_1;

public class MultiDimArray {

	public static void main(String[] args) {
		//In two dimensional array of
		int[][] twoDim_arr = new int[10][20];
		
		twoDim_arr[0][1] = 1;
		twoDim_arr[0][2] = 2;
		twoDim_arr[0][3] = 3;
		twoDim_arr[0][4] = 4;
		twoDim_arr[0][5] = 5;
		
		twoDim_arr[1][1] = 11;
		twoDim_arr[1][2] = 12;
		twoDim_arr[1][3] = 13;
		twoDim_arr[1][4] = 14;
		twoDim_arr[1][5] = 15;
		
		System.out.println(twoDim_arr[1][1]+twoDim_arr[1][2]);
		

	}

}

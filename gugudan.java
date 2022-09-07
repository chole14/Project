package Project;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] gugudanArr = new int [10][9];
		
		for(int i=2; i<gugudanArr.length; i++) {
			System.out.println(i + "단" + "");
			for(int j=1; j<gugudanArr[i].length+1; j++) {
				System.out.println(i + "x" + j + "=" + i*j );
			}
		}
	}
}
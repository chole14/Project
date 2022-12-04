package test_no1;


public class studentScoreMain {

	public static void main(String[] args) {
		
	int sum = 0;
	int temp = 0;
	String[] obj = {"이름", "국어", "영어", "수학", "총점", "평균"};
	String[] name = {"곽도도", "아이유", "손흥민"};
	
	int[][] score = {{99,95,92}, {94, 58, 91}, {85, 79, 68}};
	int arr[] = new int[3];
	
	System.out.println("결과/n");
	for(String t:obj) {
		System.out.print(t+"\t");
	}
	
	System.out.println();
	for(int i=0; i<44; i++) {
		System.out.print("=");
	}
	
	System.out.println();
	for(int i=0; i<score.length; i++) {
		System.out.print(name[i]+"\t");
		for(int j=0; j<score[i].length; j++) {
			System.out.print(score[i][j]+"\t");
			
			arr[j] += score[i][j];
		}
		
		int summ=0;
		for(int j=0; j<score[i].length; j++) {
			summ+=score[i][j];
		}
		
		System.out.print(summ+"\t");
	
		int avg=0;
		for(int j=0; j<score[i].length; j++) {
			avg+=score[i][j];
		}
		System.out.print(avg/3+"\t");
		
		System.out.println();
	}
	for(int m=0; m<44; m++) {
		System.out.print("=");
	}
	System.out.println();
	
	System.out.print("\t");
	
	for(int r=0; r<3; r++)
		System.out.print(arr[r] + "\t");
	}
}
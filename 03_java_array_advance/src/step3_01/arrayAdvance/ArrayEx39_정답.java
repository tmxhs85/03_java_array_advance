package step3_01.arrayAdvance;


/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx39_정답 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				garo[i] += arr[i][j];
			}
		}
		for (int k = 0; k < 3; k++) {
				System.out.print(garo[k] + " ");							
		}
		System.out.println();
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				sero[i] += arr[j][i];
			}
		}
		for (int k = 0; k < 4; k++) {
			System.out.print(sero[k] + " ");							
		}

	}

}

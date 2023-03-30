package Ch05;
public class ArrEx4 {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},		// 1학년 1, 2학기 평점
				            {3.5, 3.6},		// 2학년 1, 2학기 평점
				            {3.7, 4.0},		// 3학년 1, 2학기 평점
				            {4.1, 4.2} };	// 4학년 1, 2학기 평점
		int count = 0;
        double sum=0;
        for(int year=0; year<score.length; year++) // 각 학년별로 반복. 4번 돌음
            for(int term=0; term<score[year].length; term++)  {// 각 학년의 학기별로 반복, 2번 돌음
                sum += score[year][term]; // 전체 평점 합
                count++;    // 누적할 때마다 카운트 늘어남           
            }
        
        int n=score.length; // 배열의 행 개수, 4
        int m=score[0].length; // 배열의 열 개수, 2
        System.out.println("4년 전체 평점 평균은 " + sum/count);   //정방형 배열이라 가능 .  count 변수 없이 sum/(n*m);으로도 가능

	}

}

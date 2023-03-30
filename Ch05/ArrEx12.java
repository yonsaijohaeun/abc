package Ch05;

public class ArrEx12 {

	public static void main(String[] args) {
		//자동차 창고 넣기
		/*char[] stack = new char [5];
		int top = 0;  //스택 비어있음
		stack[top] = 'A';
	    System.out.println((stack[top])+"자동차가 창고에 들어감.");
	    top++; 
		stack[top] = 'B';
	    System.out.println((stack[top])+"자동차가 창고에 들어감.");
	    top++; 
		stack[top] = 'C';
	    System.out.println((stack[top])+"자동차가 창고에 들어감.");
	    top++; 
	    */
		
		//문자열로 출력
  		/*String[] garage = new String[5];
		int top = 0;
		garage[top] = "SONATA";
		System.out.println((garage)[top]+"자동차가 창고에 들어감.");
		top++;
		garage[top] = "GENESYS";
		System.out.println((garage)[top]+"자동차가 창고에 들어감.");
		top++;
		garage[top] = "VOLVO";
		System.out.println((garage)[top]+"자동차가 창고에 들어감.");
		top++;
		*/
		
		
		//반복문 활용하여 출력 
		/*String[] carList = {"SONATA", "GENESYS", "VOLVO"};
		String[] garage = new String[5];
		int top = 0;
		for(int i=0; i<carList.length; i++) {
			garage[top] = carList[i];
			System.out.println((garage)[top]+"가 창고에 들어감.");
			top++;
		}
		*/
		
		
		//배열을 활용한 큐
		String[] carList = {"SONATA", "GENESYS", "VOLVO", "BMW", "SM7"};             //입고 
		String[] garage = new String[5];
		int rear = 0;
		for(int i=0; i<carList.length; i++) {
			if(rear<5) {
				garage[rear] = carList[i];
				System.out.println((garage)[rear]+"가 창고에 들어감.");
				rear++;
			}else
				System.out.println("더이상 대여할 공간이 없습니다.");
		
		}
		for(int i=0; i<garage.length; i++) {
			if(rear>0) {
				System.out.println((garage)[i]+"가 창고에서 나감.");
				for(int j=0; j<rear; j++)
				    garage[j] = garage[j+1];
				rear--;
			}else
				System.out.println("더이상 반납할 차량이 없습니다.");
		
		}		
		
	}

}

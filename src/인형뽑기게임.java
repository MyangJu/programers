
import java.util.ArrayList;

public class 인형뽑기게임 {

   
   public static void main(String[] args) {
      
      
//      int[][] board = 
//         {
//             {0,0,0,0,0} //[0][0~4]
//            ,{0,0,1,0,3} //[1][0~4]
//            ,{0,2,5,0,1} //[2][0~4]
//            ,{4,2,4,4,2} //[3][0~4]
//            ,{3,5,1,3,1} //[4][0~4]
//         };
//      
//      //1일 경우 >> y=> 0~4 x=> 0
//      //5일 경우 >> y=> 0~4 x=> 4
//      //3일 경우 >> y=> 0~4 x=> 2
//      //4일 경우 >> y=> 0~4 x=> 3
//      //단, y축으로 가다가 값이 있으면 return;
//      
//      
//      int answer = 0;
//      int[] moves = {1,5,3,5,1,2,1,4};
	   
	   int[][] board = 
         {
             {0,0,4} //[0][0~4]
            ,{3,3,1} //[1][0~4]
            ,{1,2,5} //[2][0~4]
         };
      
      //1일 경우 >> y=> 0~4 x=> 0
      //5일 경우 >> y=> 0~4 x=> 4
      //3일 경우 >> y=> 0~4 x=> 2
      //4일 경우 >> y=> 0~4 x=> 3
      //단, y축으로 가다가 값이 있으면 return;
      
      
      int answer = 0;
      int[] moves = {1,3,1,3};
      
      int MAX_MOVE_COUNT = board.length;
      System.out.println(MAX_MOVE_COUNT);
      ArrayList<Integer> basket = new ArrayList<>();
      //moves count
      for(int x = 0; x < moves.length; x++) {
         int searchPoint = moves[x]-1;
         
         System.out.println("searchPoint >> "+searchPoint);
         //moves의 배열중 한 숫자의 y축만 탐색
         for(int y = 0; y < MAX_MOVE_COUNT; y++) {
            
            int insertNumber = board[y][searchPoint];
            
            if(insertNumber != 0) {//내려가다가 0이 아니고
            	System.out.println("findNumber >> "+insertNumber);
            	if(basket.size() != 0) {//배열이 비어있지 않고
            		if(insertNumber == basket.get(basket.size()-1)) {//바구니안에 맨 마지막 숫자랑 들어오는 숫자랑 같을경우 배열에서 해당 값 삭제
            			System.out.println("remove -> "+(basket.size()-1));
            			basket.remove(basket.size()-1);
            			answer += 2;
            			board[y][searchPoint] = 0;
            			break;
            		}else {//다르면 그냥 넣음
            			System.out.println("Add insertNumber >> " + insertNumber);
            			basket.add(insertNumber);
            			board[y][searchPoint] = 0;
            			break;
            		}
            	}else {//비어있는경우는 그냥 넣음
            		System.out.println("FirstAdd insertNumber >> " + insertNumber);
            		basket.add(insertNumber);
            		board[y][searchPoint] = 0;
            		break;
            	}
               
            }
            

            
            
         }
      }
      
      
      
      System.out.println("answer >> "+answer);
      
   }
}
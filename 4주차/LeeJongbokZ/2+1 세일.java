// 왜 맞았는가?
// 1. Greedy 알고리즘으로 접근하는 문제이다.
// -> 이 점을 잘 이해한다면, 내림차순으로 정렬한 후에, 
//    Greedy 하게 앞에서부터 2개씩 선택을 해주면 된다. 


import java.util.*; 

public class Main {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); 
      ArrayList<Integer> arr = new ArrayList<>();
      
      for(int i=0; i<N; i++){
          
          int num = sc.nextInt();
          arr.add(num);
      }
      
      Collections.sort(arr, Collections.reverseOrder());
      
      int cost = 0; 
      int tmp = 0; 
      
      for(int i=0; i<arr.size(); i++){
       
          if(i % 3 == 0 || i % 3 == 1){
              tmp += arr.get(i);
          }else if(i % 3 == 2){
              cost += tmp;
              tmp = 0; 
          }
      }
      
      cost += tmp;
      
      System.out.println(cost); 
      
      
    }
}

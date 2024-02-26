public class MyClass {
    public static void main(String args[]) {
      int sum=0;
      int max=4000000;
      int part1 = 1;
      int part2 = 1;
      int hold = 0;
      
      while(part2<max){
      
      hold = part1 + part2;
      part1 = part2;
      part2 = hold;
      
      if(hold%2==0){
          sum=sum+hold;
      }//end of if
      
      }//end of while
      
      System.out.println("total is " + sum);
    }
}

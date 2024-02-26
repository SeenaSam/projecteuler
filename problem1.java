public class MyClass {
    public static void main(String args[]) {
      int sum=0;
      int count=0;
      int max=1000;
      
      while(count<max){
      if (count%3==0){
          sum = sum + count;

      }//end of if div 3
      if (count%5==0){
          sum = sum + count;

      }//end of if div 5
       if (count%5==0 && count%3==0){
          sum = sum - count;

      }//end of if div 5&3
      
      count++;
      }//end of while
      
      System.out.println("total is " + sum);
    }
}//end of class

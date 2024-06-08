
public class fact_12 {
  public static void main(String[] args) {
    long fact = factorial(12);  
    System.out.println("Factorial of 12 is :: " + fact);   
  }
  public static long factorial (int n){
    if (n==0||n==1) {
      return 1;
    }else{
      long result = 1;
      for(int i = 2; i<=n; i++){
        result =  result*i;
      }
      return result;
    }
  }
}

public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 1;
    int sum = count;

    while(count <= 20) {
      count ++;
      sum = sum + count;
      if(count == 20) {
        System.out.print(sum);
      }
    }

  }
}

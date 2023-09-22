class CTest{
  int num;
  void test(){
    if(num == 0)
      System.out.println("此數為0");
    else if(num % 2 == 0)
      System.out.println("此數為偶數");
    else if(num % 2 != 0)
      System.out.println("此數為積數");
  }
}
public class Ex07{
  public static void main(String[] args){
    CTest ss=new CTest();
  System.out.println("test(0)");
  ss.test(0);
  System.out.println("test(3)");
  ss.test(3);
  System.out.println("test(8)");
  ss.test(8);
 }
 }

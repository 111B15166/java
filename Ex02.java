class Cbbb{
  double x;
  double y;
}
  public class Ex02{
    public static void main(String[] args{
      Cbbb obj1 = new Cbbb();
      Cbbb obj2 = new Cbbb();
      Cbbb avg = new Cbbb();

    obj1.x = 5.2;
    obj1.y = 3.9;
    obj2.x = 6.5;
    obj2.y = 4.6;
    avg.x = (obj1.x + obj2.x)/2;
    avg.y = (obj2.x + obj2.y)/2;
    System.out.println("obj1.x = %s\n",obj1.x);
    System.out.println("obj1.y = %s\n",obj1.y);
    System.out.println("obj2.x = %s\n",obj2.x);
    System.out.println("obj2.y = %s\n",obj2.y);
    System.out.println("avg.x = %s\n",avg.x);
    System.out.println("avg.y = %s\n",avg.y);
  }
}

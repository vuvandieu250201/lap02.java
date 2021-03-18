package lap01;

public class cd10 {
  public static void main(String[]args){
    int i =55/22;
    //hien thi so nguyen
    System.out.printf("55/22 = %d %n",i);
    double q =1.0/2.0;
    //hien thi so 0
    System.out.printf("1.0/2.0 = %09.3f %n",q);
    q = 5000.0/3.0;
    //hien thi ki hieu hoa hoc
    System.out.printf("5000/3.0 = %7.2e %n",q);
    q = -10.0/0.0;
    // hien thi am vo cuc
    System.out.printf("-10.0/0.0=%7.2e %n",q);
    //hien thi co so PI va E
    System.out.printf("pi = %5.3f, e = %5.4f %n”, Math.PI, Math.E");
  }
}

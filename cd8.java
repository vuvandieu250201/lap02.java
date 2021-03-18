package lap01;

public class cd8 {
  /**
   * khai bao bang
   */
  enum Direction{
    East,West,North,South
  }
  /**
   * thuc hien lenh
   */
  public static void main(String[]args){
    Direction direction;
    direction = Direction.East;
    System.out.println("Value :" + direction);
  }
}

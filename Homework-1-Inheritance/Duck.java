public class Duck extends Bird {
  @Override
  public void walk() {
    System.out.println("Waddle waddle");
  }

  @Override
  public void talk() {
    System.out.println("Quack quack");
  }
}

public class Door {
  private Prize prize;
  private boolean bOpen;
  private boolean bselected;

  public Door(Prize prize) {
    this.prize = prize;
  }

  public void setPrize(Prize prize) {
    this.prize = prize;
  }

  public Prize look() {
    if (isOpen())
      return prize;
    else
      return Prize.UNKNOWN;
  }

  public Prize peek() {
    return prize;
  }

  public boolean isOpen() {
    return this.bOpen;
  }

  public boolean isSelected() {return this.bselected;}

  public void open() {
    this.bOpen = true;
  }

  public void close() {
    this.bOpen = false;
  }

  public void select(){ this.bselected = true;}

  public void unselect(){ this.bselected = false;}


}

package vaje02;

public class preoblozitev {
  public static void main(String[] args) {
    Enemy baraba1 = new Enemy();
    //Enemy baraba2 = new Enemy(5, 3);
    baraba1.move(1, 2);
    Alien vesoljec = new Alien();
    vesoljec.move(5, 5);
  }
}

class Enemy {
  int x;
  int y;

  Enemy() {
    this.x = 0;
    this.y = 0;
  }

  Enemy(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void move(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void move(double x, double y) {
    this.x = (int) x;
    this.y = (int) y;
  }
}

class Alien extends Enemy {
  public void move(int x, int y) {
    this.x = 1 + x;
    this.y = 1 + y;
  }
}

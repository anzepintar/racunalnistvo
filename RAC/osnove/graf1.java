package osnove;

class graf1 {
  public static void main(String[] args) {
    double y = 0;
    for (double x = -2; x <= 2; x = x + 0.2) {
      if (x <= -1)
        y = -1;
      else if (x <= 1)
        y = x;
      else
        y = 1;

      System.out.format("%.2f ", x);
      System.out.format("%.2f\n", y);

    }
  }
}

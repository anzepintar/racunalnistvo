package naloge;
class graf2 {
  public static void main(String[] args) {
     double y = 0;
    for (double x = -3; x <= 3; x = x + 0.25) {
      if (x <= -1)
        y = x+3;
      else if (x <= 0)
        y = x*2+4;
      else if (x <= 1)
        y = x*(-2)+4;
      else
        y = -x+3;

      System.out.format("%.2f ", x);
      System.out.format("%.2f\n", y);

  }}
}

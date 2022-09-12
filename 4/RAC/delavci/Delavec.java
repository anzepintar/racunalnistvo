package delavci;

class Delavec {
  private int matSt;
  private String priimek, ime;
  private int[] od = new int[12];
  private String zaposlitev; // dolocen, nedolocen

  int getMatSt() {
    return matSt;
  }

  void getMatSt(int matSt) {
    this.matSt = matSt;
  }

  String getPriimek() {
    return priimek;
  }

  void setPriimek(String priimek) {
    this.priimek = priimek;
  }

  String getIme() {
    return ime;
  }

  void setIme(String ime) {
    this.ime = ime;
  }

  String getZaposlitev() {
    return zaposlitev;
  }

  void setZaposlitev(String zaposlitev) {
    this.zaposlitev = zaposlitev;
  }

  int[] getOd() {
    return od;
  }

  void setOd(int[] od) {
    this.od = od;
  }
}

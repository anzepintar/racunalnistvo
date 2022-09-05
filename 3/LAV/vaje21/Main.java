package vaje21;

public class Main {
  public static void main(String[] args) {
    Oseba o1 = new Oseba("Janez", "Novak", 122322112);
    o1.izpis();
    Imenik mojImenik = new Imenik(10);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
    mojImenik.dodajOseboVImenik(o1);
  }

}

class Oseba {
  String ime;
  String priimek;
  int id; // emso

  public Oseba(String ime, String priimek, int id) {
    this.ime = ime;
    this.priimek = priimek;
    this.id = id;
  }

  public void izpis() {
    System.out.println(this.ime);
    System.out.println(this.priimek);
    System.out.println(this.id);
  }
}

class Imenik {
  Oseba osebe[];
  int index = 0;

  public Imenik(int velikost) {
    osebe = new Oseba[velikost];

  }

  public void dodajOseboVImenik(Oseba o) {
    osebe[index++] = o;

  }

  public void odstraniOsebo(int index) {
    for (int i = index; i < osebe.length - 1; i++) {
      osebe[i] = osebe[i + 1];

    }
    --index;

  }

  public int isci(String ime, String priimek) {
    for (int i = 0; i < osebe.length; i++)
      if (osebe[i].ime.equals(ime) && osebe[i].priimek.equals(priimek)) {
        return i;
      }
    return -1;
  }
}
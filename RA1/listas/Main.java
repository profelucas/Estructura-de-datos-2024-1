public class Main {
    public static void main(String[] args) {
      Listacircular lc = new Listacircular("lista circular");
      lc.mostrar();
      lc.insertar_primero(1);
      lc.insertar_primero(2);
      lc.insertar_primero(3);
      lc.insertar_ultimo(0);
      lc.mostrar();

    }
  }
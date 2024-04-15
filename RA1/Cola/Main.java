import java.util.*;

public class Main {
  public static void main(String[] args) {
    ColaEstatica c = new ColaEstatica("Cola", 4);

    c.mostrar();

    c.ingresar(55);
    c.ingresar(99);
    c.ingresar(44);
    c.ingresar(33);
    c.ingresar(1);
    
    c.mostrar();

    c.eliminar();
    c.mostrar();
    c.ingresar(1);
    c.mostrar();
  }

}
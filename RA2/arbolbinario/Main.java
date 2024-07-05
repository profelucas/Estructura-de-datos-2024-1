// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    avl arbol3 = new avl(1);
    arbol3=arbol3.insertar(2);
    arbol3=arbol3.insertar(3);
    arbol3.imprimir_avl();

    avl arbol4 = new avl(1);
    arbol4=arbol4.insertar(2);
    arbol4=arbol4.insertar(4);
    arbol4=arbol4.insertar(5);
    arbol4.imprimir_avl();
    if(arbol3.soniguales(arbol4)){
      System.out.println("son iguales");
    }else{
      System.out.println("no son iguales");
    }
  }

}
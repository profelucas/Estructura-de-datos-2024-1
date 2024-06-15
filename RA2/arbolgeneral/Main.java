public class Main {
  public static void main(String[] args) {
    arbolgeneral raiz = new arbolgeneral(1);
    arbolgeneral hijo1 = new arbolgeneral(2);
    arbolgeneral hijo2 = new arbolgeneral(3);
    arbolgeneral hijo3 = new arbolgeneral(4);
    arbolgeneral hijo4 = new arbolgeneral(5);
    arbolgeneral hijo5 = new arbolgeneral(9);
    arbolgeneral hijo6 = new arbolgeneral(10);
    raiz.agregar_hijos(hijo1);
    raiz.agregar_hijos(hijo2);
    hijo1.agregar_hijos(hijo3);
    hijo1.agregar_hijos(hijo4);
    hijo1.agregar_hijos(hijo5);
    hijo4.agregar_hijos(hijo6);
    //recorrido
    System.out.println("Preorden");
    raiz.imprimir_preorden();
    System.out.println(" ");
    System.out.println("Postorden");
    raiz.imprimir_postorden();
    System.out.println(" ");
    System.out.println("Inorden");
    raiz.imprimir_inorden();
    System.out.println(" ");
    System.out.println("Anchura");
    raiz.imprimir_anchura();
  }
  
  //raiz (1) -> hijos(2,3)
  
  //hijo(2)->hijos(4,5,9)

}
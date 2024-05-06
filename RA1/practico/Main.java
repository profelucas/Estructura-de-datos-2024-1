public class Main {
  public static void main(String[] args) {
    nodo p1 = new nodo( "pedido 1", 100);
    nodo p2 = new nodo( "pedido 2", 200);

    cola_orden co = new cola_orden("cola de pedidos");
    pila_orden po = new pila_orden("pila de pedidos");

    co.ingresar(p1);
    co.ingresar(p2);
    System.out.println("el ultimo pedido en la cola es: "+co.pendiente().getdetalle());
    co.procesar();
    po.agregar_pedido(p1);
    System.out.println("lo ganado es "+po.ganado_pedidos());
     po.procesar_pedido();
  }
 
}
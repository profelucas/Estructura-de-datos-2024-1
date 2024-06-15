import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class arbolgeneral{
  //Atributos
  int dato;
  List<arbolgeneral> hijos;

  //constructor
  public arbolgeneral(int dato){
    this.dato=dato;
    this.hijos= new ArrayList<arbolgeneral>();
  }
  //funcion que agrega un hijo al arbol
  void agregar_hijos(arbolgeneral hijo){
    hijos.add(hijo);
  }

  //funcion que imprime los elementos del arbol
  //recorrido -> profundidad, anchura
  //profundidad ->preorden,inorden,postorden

  //preorden->padre,izquierda->derecha (1,2,4,5,9,3)
  //inorden->izquierda,padre,derecha (4,2,5,9,1,3)
  //postorden->izquierda->derecha,padre (4,5,9,2,3,1)
  //anchura-> niveles (1,2,3,4,5,9)
  
  void imprimir_preorden(){
    System.out.print(this.dato+" ");
    //muestra los hijos
    for(arbolgeneral hijo : hijos){
      hijo.imprimir_preorden();
    }
  }
  
  void imprimir_postorden(){
    //muestra los hijos
    for(arbolgeneral hijo : hijos){
      hijo.imprimir_postorden();
    }
    System.out.print(this.dato+" ");
  }

  void imprimir_inorden(){
    int tamano= hijos.size(),i;
    
    for(i=0;i<tamano;i++){
      if(i==tamano/2){
        System.out.print(this.dato+" ");
      }
      hijos.get(i).imprimir_inorden();
    }
    if(tamano==0){
      System.out.print(this.dato+" ");
    }
  }

  void imprimir_anchura(){
    
    Queue<arbolgeneral> cola = new LinkedList<arbolgeneral>();
    cola.add(this);
    while (!cola.isEmpty()){
      arbolgeneral actual = cola.poll();
      System.out.print(actual.dato+" ");

      for(arbolgeneral hijo : actual.hijos){
        cola.add(hijo);
      }
    }
  }
  
  //funcion que elimine un elemento (desafio)
  //elimina->hoja (no tiene hijos)
  //elimina->hijos
  //elimina->raiz
}
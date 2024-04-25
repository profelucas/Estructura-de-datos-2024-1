class NodoDoble{
  //atributos
  private int dato;
  private NodoDoble siguiente;
  private NodoDoble anterior;

  //constructor
  public NodoDoble(int dato){
    this.dato=dato;
    this.siguiente=null;
    this.anterior=null;
  }

  //gets
  public int getDato(){
    return this.dato;
  }

  public NodoDoble getSiguiente(){
    return this.siguiente;
  }

  public NodoDoble getanterior(){
    return this.anterior;
  }

  //funciones de enlace
  public void enlazar_siguiente(NodoDoble nodo){
    this.siguiente=nodo;
  }
  public void enlazar_anterior(NodoDoble nodo){
    this.anterior=nodo;
  }
}
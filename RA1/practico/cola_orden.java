class cola_orden{
  //atributos
  private nodo primero;
  private nodo ultimo;
  private String nombre;

  //funcion constructora
  public cola_orden(String nombre){
    this.nombre=nombre;
    this.primero=null;
    this.ultimo=null;
  }

  public boolean esvacia(){
    return this.primero==null;
  }
  //funcion que ingresa a la cola el pedido a procesar
  public void ingresar(nodo nuevo){
    if(esvacia()){
      this.primero=nuevo;
      this.ultimo=nuevo;
    } else{
      nuevo.enlazar(this.ultimo);
      this.ultimo=nuevo;
    } 
  }
  //funcion para proesar o eliminar un pedido dentro de la cola
  public void procesar(){
    if(esvacia()){
      System.out.println("La cola esta vacia");
    }else{
      if(this.primero==this.ultimo){
        this.primero=null;
        this.ultimo=null;
      }else{
        this.primero=this.primero.getsig();
      }
    }
  }
  //funcion que retorna el proximo pedido a procesar
  public nodo pendiente(){
    return this.primero;
  }
  //funcion que determina la cantidad de pedidos a procesar
  public int cantidad_pedidos(){
    int cantidad=0;
    nodo aux=this.primero;
    while(aux!=null){
      cantidad++;
      aux=aux.getsig();
    }
      return cantidad;
  }
  
}
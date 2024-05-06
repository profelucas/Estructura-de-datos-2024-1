class pila_orden{
  private nodo cima;
  private String nombre;
  
//funcion contructora
  public pila_orden(String nombre){
    this.nombre=nombre;
    this.cima=null;
  }
  //funcion que determina si la pila esta vacia
  public boolean esvacia(){
    return this.cima==null;
  }

  //funcion que ingresa un pedido a la pila
  public void agregar_pedido(nodo nuevo){
    if(esvacia()){
      this.cima=nuevo;
    }else{
      nuevo.enlazar(this.cima);
      this.cima=nuevo;
    }
    
  }
  //funcion que procesa /elimina un pedido
  public void procesar_pedido(){
    if(esvacia()){
      System.out.println("La pila esta vacia");
    }else{
      if(this.cima.getsig()==null){
        this.cima=null;
      }else{
        this.cima=this.cima.getsig();
      }
    }
  }
  //funcion que devuelve el ultimo pedido procesado
  public nodo ultimo_procesado(){
    return this.cima;
  }
  public int ganado_pedidos(){
    int ganado=0;
    nodo aux=this.cima;
    while(aux!=null){
      ganado+=aux.getvalor();
      aux=aux.getsig();
    }
    return ganado;
  }
}
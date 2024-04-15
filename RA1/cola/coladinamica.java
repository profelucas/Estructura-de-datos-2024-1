class ColaDinamica{
  private Nodo primero;
  private Nodo ultimo;
  private String nombre;

  public ColaDinamica(String nombre){
    this.nombre = nombre;
  }
  public boolean esvacio(){
    return this.primero==null;
  }
  public void ingresar(Object elemento){
    Nodo nuevo = new Nodo(elemento);
    if(esvacio()){
      this.primero=nuevo;
      this.ultimo=nuevo;
    }else{
      this.ultimo.enlazar(nuevo);
      this.ultimo=nuevo;
    }
  }
  public void quitar(){
    if(esvacio()){
      System.out.println("La cola esta vacia");
    }else{
      this.primero=this.primero.siguiente();
    }
  }
  public void mostrar(){
    if(esvacio()){
      System.out.println("La cola esta vacia");
    }else{
      Nodo aux = this.primero;
      while(aux!=null){
        System.out.println(aux.elemento());
        aux=aux.siguiente();
      }
    }
  }
}
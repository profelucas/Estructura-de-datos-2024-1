class nodo{
  // Atributos
  private String detalle;
  private int valor;
  private nodo sig;
  //funcion constructora
  public nodo(String detalle, int valor){
    this.detalle=detalle;
    this.valor=valor;
    this.sig=null;
  }
  //funcion para obtener el detalle
  public String getdetalle(){
    return this.detalle;
  }
  //funcion para obtener el valor
  public int getvalor(){
    return this.valor;
  }
  //funcion para obtener el siguiente nodo
  public nodo getsig(){
    return this.sig;
  }
  //funcion para enlazar dos nodos
  public void enlazar(nodo n){
    this.sig=n;
  }
  
}
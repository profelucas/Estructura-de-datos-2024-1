class Nodo{
  private Object el;
  private Nodo sig;

  public Nodo(Object el){
    this.el=el;
    this.sig=null;
  }
  
  public Object elemento(){
    return this.el;
  }
  public Nodo siguiente(){
    return this.sig;
  }
  public void enlazar(Nodo n){
    this.sig=n;
  }
}
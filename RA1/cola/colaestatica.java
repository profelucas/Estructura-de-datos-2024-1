class ColaEstatica{
  private Object[] cola;
  private String nombre;
  private int tam;
  private int primero;
  private int ultimo;

  public ColaEstatica(String nombre, int tam){
    this.nombre= nombre;
    this.tam= tam;
    this.cola= new Object[tam];
    this.primero=-1;
    this.ultimo=-1;
  }
  public boolean esvacio(){
    return this.primero ==-1;
  }
  public void ingresar(Object elemento){
    if(esvacio()){
      this.primero=0;
      this.ultimo=0;
      this.cola[this.ultimo]=elemento;
    }else{
      if(this.ultimo<this.tam-1){
        this.ultimo++;
        this.cola[this.ultimo]=elemento;
      }else{
        System.out.println("La cola esta llena");
      }
    }
  }
  public Object eliminar(){
   if(esvacio()){
     System.out.println("La cola esta vacia");
     return null;
   }else{
     Object elemento= this.cola[this.primero];
     if(this.primero==this.ultimo){
       this.primero=-1;
       this.ultimo=-1;
     }else{
       this.primero++;
     }
     return elemento;
   }
  }
  public void mostrar(){
    if(esvacio()){
      System.out.println("La cola esta vacia");
    }else{
      for(int i=this.primero;i<=this.ultimo;i++){
        System.out.println(this.cola[i]);
      }
    }
  }
  
}
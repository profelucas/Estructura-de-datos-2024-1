class arbolbinario{
  //atributos
  private int dato;
  private arbolbinario izq;
  private arbolbinario der;
  //constructor
  public arbolbinario(int dato){
    this.dato = dato;
    this.izq = null;
    this.der = null;
  }

  //gets y sets
  public int getdato(){
    return this.dato;
  }
  public arbolbinario getizq(){
    return this.izq;
  }
  public arbolbinario getder(){
    return this.der;
  }

  public void setdato(int dato){
    this.dato=dato;
  }
  public void setizq(arbolbinario izq){
    this.izq=izq;
  }
  public void setder(arbolbinario der){
    this.der=der;
  }
  //mejorar el insertar
  public void insertar_izq(int dato){
    if(this.izq==null){
      arbolbinario hijo = new arbolbinario(dato);
      this.izq= hijo;
      // this.izq=new arbolbinario(int dato);
    }else{
      if(this.der==null){
        arbolbinario hijo = new arbolbinario( dato);
        this.der= hijo;
        //setizq(new arbolbinario(int dato));
      }else{
        this.izq.insertar_izq(dato);
      }
    }
  }
  public void insertar_der(int dato){
    if(this.der==null){
      arbolbinario hijo = new arbolbinario( dato);
      this.der= hijo;
      // this.izq=new arbolbinario(int dato);
    }else{
      if(this.izq==null){
        arbolbinario hijo = new arbolbinario (dato);
        this.izq= hijo;
        //setizq(new arbolbinario(int dato));
      }else{
        this.der.insertar_der(dato);
      }
    }
  }

  // buscar la manera de insertar libremente
  public void imprimir(){
    System.out.println(this.dato);
    if(this.izq!=null){
      this.izq.imprimir();
    }
    if(this.der!=null){
      this.der.imprimir();
    }
  }

  //otros recorridos inorden, postorden, anchura
  //altura
  public int altura() {
    int alturaIzq = (this.izq == null) ? -1 : this.izq.altura();
    int alturaDer = (this.der == null) ? -1 : this.der.altura();
    return Math.max(alturaIzq, alturaDer) + 1;
  }
  //profundidad
  public int profundidad(int valor) {
    if (this.dato == valor) {
      return 0;
    }
    int profundidadIzq = (this.izq == null) ? -1 : this.izq.profundidad(valor);
    int profundidadDer = (this.der == null) ? -1 : this.der.profundidad(valor);

    if (profundidadIzq != -1) {
      return profundidadIzq + 1;
    } else if (profundidadDer != -1) {
      return profundidadDer + 1;
    } else {
      return -1;
    }
  }
}
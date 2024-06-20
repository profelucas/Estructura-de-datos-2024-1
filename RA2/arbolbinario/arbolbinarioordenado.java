class abo extends arbolbinario{
  public abo(int dato){
    super(dato);
  }
  
  void ingresardato(int dato) {
    if (dato < this.getdato()) {
      if (this.getizq() != null) {
        ((abo) this.getizq()).ingresardato(dato);
      } else {
        System.out.println("entre en la izquierda");
        arbolbinario hijo = new abo(dato); // Crear una instancia de 'abo'
        this.setizq(hijo);
      }
    } else {
      if (this.getder() != null) {
        ((abo) this.getder()).ingresardato(dato);
      } else {
        System.out.println("entre aca");
        arbolbinario hijo = new abo(dato); // Crear una instancia de 'abo'
        this.setder(hijo);
      }
    }
  }
}
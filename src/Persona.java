 class Persona {
    

        private String nombre;
        private String apellido;
        private int dni;
      
        public Persona (String nombre, String apellido, int dni) {
          this.nombre = nombre;
          this.apellido = apellido;
          this.dni = dni;
        }
      
        public String toString() {
          return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
     }
      
}

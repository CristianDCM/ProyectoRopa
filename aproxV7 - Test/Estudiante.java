public abstract class Estudiante{
        protected final String identificacion;
        private String nombre;
        private String curso;
        
        public Estudiante(String identificacion, String nombre, String curso)throws Exception{
            if(identificacion.trim().equals(""))
                throw new Exception("valor invalido en la identificacion");
            
            if(identificacion.matches(".*[a-zA-Z].*"))
                throw new Exception("La identificacion no puede tener caracteres");
            
            this.identificacion = identificacion;
            setNombre(nombre);
            setCurso(curso);
            
        }
        
        public abstract double calcularPromedio();
        
        public String getIdentificacion(){
            return identificacion;
        }
        
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            if(nombre != null) this.nombre = nombre;
            else this.nombre = "";
        }
        
        public String getCurso(){
            return curso;
        }
        public void setCurso(String curso){
            if(curso != null) this.curso = curso;
            else this.curso = "";
        }
        
    }
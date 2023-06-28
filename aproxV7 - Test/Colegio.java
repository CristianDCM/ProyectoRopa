import java.util.ArrayList;
public class Colegio
{
    private final String nit;
    private String nombreColegio;
    private String direccion;
    private ArrayList estudiante;
    
    public Colegio(String nit,String nombreColegio,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreColegio(nombreColegio);
        setDireccion(direccion);        
        estudiante = estudiante = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreColegio(){
        return nombreColegio;
    }
    public void setNombreColegio(String nombreColegio){
        if(nombreColegio != null){
            this.nombreColegio = nombreColegio;
        }else{
            this.nombreColegio = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < estudiante.size(); i++){
            promedio += ((Estudiante)estudiante.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarEstudiante(String identificacion, String nombre, String curso, double notauno, double notados)throws Exception{
        estudiante.add(new EstudianteJardin(identificacion, nombre, curso, notauno, notados));
    }
    
    public void adicionarEstudiante(String identificacion, String nombre, String curso, double notauno, double notados, double notatres)throws Exception{
        estudiante.add(new EstudianteColegio(identificacion, nombre, curso, notauno, notados, notatres));
    }
    
    public void adicionarEstudiante(String identificacion, String nombre, String curso, double notauno, double notados, double notatres, double notacuatro)throws Exception{
        estudiante.add(new EstudianteTecnico(identificacion, nombre, curso, notauno, notados, notatres, notacuatro));
    }
}    
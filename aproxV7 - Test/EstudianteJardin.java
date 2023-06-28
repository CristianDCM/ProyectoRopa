public class EstudianteJardin extends Estudiante{
    private double notauno;
    private double notados;
    
    EstudianteJardin(String identificacion, String nombre, String curso, double notauno, double notados)throws Exception{
        super(identificacion, nombre, curso);
        setNotauno(notauno);
        setNotados(notados);
    }

    public double calcularPromedio(){
        return (notauno + notados) / 2;
    }
    
    public double getNotauno(){
        return notauno;
    }
    public void setNotauno(double notauno){
        if(notauno >= 0) this.notauno = notauno;
        else this.notauno = 0;
    }
    
    public double getNotados(){
        return notados;
    }
    public void setNotados(double notados){
        if(notados >= 0) this.notados = notados;
        else this.notados = 0;
    }
}
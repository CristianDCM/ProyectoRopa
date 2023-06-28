public class EstudianteColegio extends Estudiante{
    private double notauno;
    private double notados;
    private double notatres;
    
    EstudianteColegio(String identificacion, String nombre, String curso, double notauno, double notados, double notatres)throws Exception{
        super(identificacion, nombre, curso);
        setNotauno(notauno);
        setNotados(notados);
        setNotatres(notatres);
    }
    
    public double calcularPromedio(){
        return (notauno + notados + notatres) / 3;
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
    
    public double getNotatres(){
        return notatres;
    }
    public void setNotatres(double notatres){
        if(notatres >= 0) this.notatres = notatres;
        else this.notatres = 0;
    }
    
}
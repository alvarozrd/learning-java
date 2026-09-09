public class Classmate {
    
    public String prontuario;
    public String aluno;
    public double nota;
   
   
    Classmate (String prontuario, String aluno, double nota){
        setProntuario(prontuario);
        setAluno(aluno);
        setNota(nota);
    }

    public String getProntuario() {
        return prontuario;
    }
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    
}

public class Task {
    // atributos da tarefa
    private int code;
    private String title;

    // construtor para criar a tarefa com código e título
    public Task(int code, String title) {
        setCode(code);
        setTitle(title);
    }

    // pega o código da tarefa
    public int getCode() {
        return code;
    }

    // altera o código da tarefa
    public void setCode(int code) {
        this.code = code;
    }

    // pega o título da tarefa
    public String getTitle() {
        return title;
    }

    // altera o título da tarefa
    public void setTitle(String title) {
        this.title = title;
    }
}

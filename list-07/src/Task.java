public class Task {
    private int code;
    private String title;

    public Task(int code, String title) {
        setCode(code);
        setTitle(title);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

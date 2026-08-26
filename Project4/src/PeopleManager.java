import java.util.ArrayList;
import java.util.List;

public class PeopleManager {

    private List<Person> peopleList;

    // construtor 
    public PeopleManager(){
        this.peopleList = new ArrayList<>();
    }

    public List<Person> getPeopleList(){
        return peopleList;
    }
}

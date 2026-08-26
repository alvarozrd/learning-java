public class App {
    public static void main(String[] args) throws Exception {
        PeopleManager manager = new PeopleManager();

        manager.save(new Person("Ana Maria", "34828593940"));

        System.out.println(manager.getPeopleList());
    }
}

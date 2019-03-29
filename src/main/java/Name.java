public class Name {
    private String firstName;
    private String secondName;
    private String patronymic;

    public Name(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = "patronymic is not";
    }

    public  Name(String firstName, String secondName, String fatherName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = fatherName;
    }
}

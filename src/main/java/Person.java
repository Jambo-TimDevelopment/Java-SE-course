public abstract class Person implements Comparable<Person>{
    private String firstName;
    private String secondName;
    private String technologies;
    private int age;
    private int experince;
    private String gender;
    private String summary;

    //Конструкторы
    public Person(){
        this.setFirstName(null);
        this.setTechnologies(null);
        this.setExperince(0);
        this.setAge(0);
        this.setSecondName(null);
        this.setGender(null);
        this.setSummary(null);
    }

    public Person(String f, String s, String t, String g, int a, int e, String sum){ //Конструктор
        this.firstName = f;
        this.secondName = s;
        this.technologies = t;
        this.age = a;
        this.experince = e;
        Gender gender = new Gender(g);
        this.gender = gender.getGender();
        this.summary = sum;
    }

    //Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public double getExperince() {
        return experince;
    }

    public String getTechnologies(){
        return technologies;
    }

    public String getSummary(){return summary;}

    //Сеттеры
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperince(int experince) {
        this.experince = experince;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSummary(String summary){this.summary = summary;}

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;
        if ((this.getTechnologies() != null) && (otherPerson.getTechnologies() != null)) {
            return this.getTechnologies().equals(otherPerson.getTechnologies());
        } else {
            return this.getTechnologies() == null && otherPerson.getTechnologies() == null;
        }
    }

    @Override
    public int hashCode(){
        return this.getTechnologies().hashCode();
    }

    @Override
    public int compareTo(Person other){
       if(other == null){
           return 1;
       }

       if(other.equals(this)){
           return 0;
       }

       if(this.getTechnologies() != null){
           if(this.getTechnologies().equals(other.getTechnologies())){
               if(this.getExperince() < other.getExperince()){
                   return 1;
               }else if(this.getExperince() == other.getExperince()){
                   return 0;
               }else {
                   return -1;
               }
           }else {
               return this.getTechnologies().compareTo(other.getTechnologies());
           }
       }else {
           return other.getTechnologies() != null ? -1 : 0;
       }
    }
}

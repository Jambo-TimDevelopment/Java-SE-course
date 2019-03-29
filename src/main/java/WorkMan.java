public class  WorkMan extends Person{
    //Конструктор 1.0
    public WorkMan(String f, String s, String t, String g, int a, int e){
        super(f, s, t, g, a, e);
    }

    //Конструктор 2.0 (Само Своершенство)
    public WorkMan(){
        super();
    }

    //Методы поска (Пока не спользуются)
    public boolean boolSearchName(String firstName, String secondName){
        boolean a = getFirstName().equals(firstName);
        boolean b = getSecondName().equals(secondName);
        return a && b;
    }

    public String searchName(boolean boolSearchName){
        boolean a = boolSearchName(getFirstName(), getSecondName());
        return a ?  "найден " + getFirstName() + " " + getSecondName() + " Навыки в " + getTechnologies() + " Стаж: "
                + getExperince() + " Возратс: " + getAge() : getFirstName() + " " + getSecondName() + " не был найден";
    }

    @Override
    public String toString() {
        return "Имя: " + getFirstName() + "  Фамилия: " + getSecondName() +
                "  Технологии: " + getTechnologies() + "  Возраст: " + getAge() + "  Стаж: " + getExperince();
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPersonService {
    private List<WorkMan> listPerson = new ArrayList<WorkMan>();

    //Конструкторы
    public ListPersonService(List<WorkMan> list){
        this.listPerson = list;
    }

    public ListPersonService(String[] arPersons){
        String technologies = new String();
        String secondName = new String();
        String firstName = new String();
        String gender = new String();
        String summary = new String();
        int age = 0;
        int experince = 0;
        int flag = 0;
        for(int i = 0; i < arPersons.length; i++){
            if(arPersons[i].equals("FirstName")){
                firstName = arPersons[i + 1];
                flag++;
            }else if(arPersons[i].equals("SecondName")){
                secondName = arPersons[i + 1];
                flag++;
            }else if(arPersons[i].equals("Technologies")){
                technologies = arPersons[i + 1];
                flag++;
            }else if(arPersons[i].equals("Gender")){
                gender = arPersons[i + 1];
                flag++;
            }else if(arPersons[i].equals("Age")){
                age = Integer.parseInt(arPersons[i + 1]);
                flag++;
            }else if(arPersons[i].equals("experince")){
                experince = Integer.parseInt(arPersons[i + 1]);
                flag++;
            }else if(arPersons[i].equals("summary")){
                summary = arPersons[i+1];
            }
            if(flag == 6) {
                WorkMan workMan = new WorkMan(firstName, secondName, technologies, gender, age, experince, summary);
                listPerson.add(workMan);
                flag = 0;
            }
        }
    }

    public List<WorkMan> getListPerson(){
        return listPerson;
    }

    public String toString(){
        String list = "";
        for(Person item: listPerson){
            list += item.toString() + "\n";
        }
        return list;
    }

    //Список команд
    public void searchName(String firstName, String secondName){
        boolean flag = false;
        for(WorkMan person: listPerson){
            if(person.boolSearchName(firstName, secondName)){
                System.out.println(person.toString() + "\n" + person.getSummary());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Такой человек отсутствеут :(");
        }
    }

    public void searchExperince(int Experince){
        Iterator iter = listPerson.iterator();
        boolean flag = true;
        while (iter.hasNext()){
            WorkMan name = (WorkMan)iter.next();
            if(name.getExperince() >= Experince){
                System.out.println(name.toString());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Такой человек отсутствует");
        }
    }

    public void searchTenologies(String Technologies){
        Iterator iter = listPerson.iterator();
        boolean flag = true;
        while (iter.hasNext()){
            WorkMan name = (WorkMan) iter.next();
            if(name.getTechnologies().equals(Technologies)){
                System.out.println(name);
                flag = false;
            }
        }
        if (flag){
            System.out.println("Такой человек отсутствует");
        }
    }
}

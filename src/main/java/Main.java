import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Читаем файл
        String fileContent = ReadFile.readFile("C:\\Users\\senya\\IdeaProjects\\CRMfromHR\\src\\ContentPerson");
        String[] arPersons =  fileContent.split("[:,\\n]");

        //Создание списка
        ListPersonService listPersonService = new ListPersonService(arPersons);

        //Реализация сервиса
        Scanner in = new Scanner(System.in);
        boolean flag1 = true;
        while (flag1){
            System.out.print("<<<<");
            String command = in.nextLine();

            String[] f = command.split("[ ]");
            if(f[0].equals("Experince")){                           //(1)
                listPersonService.searchExperince( Integer.parseInt(f[1]));
            }else if(f[0].equals("Technologies")){                  //(2)
                listPersonService.searchTenologies(f[1]);
            }else if(f[0].equals("SearchName")){                    //(3)
                listPersonService.searchName(f[1], f[2]);
            } else if(command.equals("exit")){                       //(4)
                System.out.println("Программа завершена");
                flag1 = false;
            }else if(command.equals("PrintList")){
                System.out.println(listPersonService.getListPerson());
            }else {
                System.out.println("Wrong command");
            }
        }
    }
}

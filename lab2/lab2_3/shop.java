package ru.mirea.lab23;
import java.util.ArrayList;
import java.util.Scanner;

public class shop {
    private ArrayList<String> komputers = new ArrayList<>(0);
    public shop(){};

    public String findKomp(){
        System.out.println("введите названия компьтера" );
        Scanner scan=new Scanner(System.in);
        String kompname= scan.nextLine();
        if (komputers.indexOf(kompname)==-1){
            return "компьютера нет в наличии";
        }
        else {
            return "компьютер найден";
        }
    }
    public boolean setKomp(String kompname){
        if ("end".equals(kompname)){
            return false;
        }
        else{
            komputers.add(kompname);
            return true;
        }
    }
    public boolean setList(){
        Scanner scan=new Scanner(System.in);
        System.out.println("вводите имена компьютеров в конце введите 'end'");
        String setkomp;
        boolean check=true;
        do {
            setkomp=scan.nextLine();
        } while (setKomp(setkomp)==true);
        return true;
    }

    public void delKomp(){
        System.out.println("введите названия компьтера" );
        Scanner scan=new Scanner(System.in);
        String kompname= scan.nextLine();
        komputers.remove(kompname);
        getKomp();
    }

    public boolean kommand(){
        System.out.println("если вы хотите сделать новый списов введите 1\n" +
                "если вы хотите добавить компьютер в список введите 2\n" +
                "если вы хотите удалить компютер из списка введите 3\n" +
                "если вы хотите найти нужный компьютер введите 4\n" +
                "для заврешения работы программы введите 0\n");
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        switch (i){
            case (1):
                komputers.removeAll(komputers);
                setList();
                getKomp();
                return true;
            case (2):
                plusKomp();
                return true;
            case (3):
                delKomp();
                return true;
            case (4):
                System.out.println(findKomp());
                return true;
            case (0):
                return false;
            default:
                System.out.println("неизвестная команда");
                return true;
        }
    }
    public void getKomp(){
        for (int i=0;i< komputers.size();i++){
            String value = komputers.get(i);
            System.out.println(value);
        }
    }

    public boolean plusKomp(){
        System.out.println("введите название нового компьютера");
        Scanner scan=new Scanner(System.in);
        String newKomp= scan.nextLine();
        komputers.add(newKomp);
        getKomp();
        return true;
    }
}

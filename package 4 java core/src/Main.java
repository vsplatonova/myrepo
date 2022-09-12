import java.util.HashMap;
import java.util.Map;

public class Main {
    public  static void main (String[] args) {
        /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.*/

        String[] names={"Lyba","Vera","Vera","Kata","Lena","Lena","Olga","Olga","Tana","Nasta","Nasta"};
        HashMap<String, Integer> words= new HashMap<>();
        for (String name:names) {
            Integer count=words.get(name);
            if(count==null) {
                words.put(name,1);
            } else {words.put(name,count+1);
            }

        }
        for (Map.Entry<String, Integer> o : words.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }


        /*2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
         В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
         Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/
        TelephoneBook tb=new TelephoneBook();
        tb.addRecord("Ivanov","644964651");
        tb.addRecord("Ivanov","541654165");
        tb.addRecord("Ivanova","5564654561");
        tb.addRecord("Ivanova","554564564564");
        tb.addRecord("Petrov","55111111564");
        tb.addRecord("Petrova","57777777711564");
        tb.addRecord("Petrov","5511111333333");




        System.out.println( tb.searchBySurname("Ivanovvv"));
        System.out.println( tb.searchBySurname("Ivanov"));


    }
}

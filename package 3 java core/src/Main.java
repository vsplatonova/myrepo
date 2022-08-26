import java.util.ArrayList;

public class Main {
    /*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.*/

    public static <T> void arrayElement(T[] a, int i, int j){
        T arr = a[i];
        a[i] = a[j];
        a[j] = arr;

    }
    public static void  main(String[] args){
        ArrayList <Orange> oranges=new ArrayList();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        Box<Orange> boxOrange=new Box<>(oranges);


        ArrayList<Apple> apples=new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        Box<Apple> boxApple=new Box<>(apples);

        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());

        System.out.println(boxOrange.compare(boxApple));


        boxOrange.sprinkleFromBox(boxOrange);

        boxOrange.addFruit(new Orange());
        boxApple.addFruit(new Apple());
    }
}

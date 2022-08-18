public class Participant {
    private String name;
    private int age;


    public Participant(String name, int age){
        this.name=name;

        this.age=age;
    }
    public void print(){
        System.out.println(this.name+" "+this.age+" ");
    }
}

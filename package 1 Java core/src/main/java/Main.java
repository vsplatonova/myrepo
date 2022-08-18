public class Main {

    /*Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.
Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;метод, который будет просить команду пройти всю полосу.*/


    public static void main (String[] args) {

        Participant[] participant=new Participant[4];

        participant[0]=new Participant("vas", 12);
        participant[1]=new Participant("vas", 12);
        participant[2]=new Participant("vas", 12);
        participant[3]=new Participant("vas", 12);

        Course course=new Course();
        Team team=new Team("red",participant);

        course.doIt(team);
        team.info();




    }
}

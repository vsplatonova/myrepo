public class Team {

   private String teamName;
    private Participant[] participant;


    public Team (String teamName,Participant[] participant){

        this.participant=participant;
        this.teamName=teamName;
    }

    public void info (){
        System.out.println(teamName+" "+ participant+" "+"finish");
        for (int i=0; i<participant.length;i++){
            participant[i].print();
        }

    }

}

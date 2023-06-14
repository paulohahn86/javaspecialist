public class Participant {

    private String name;
    private int pointsBalance;

   public Participant(String name){
        this.name = name;
    }

    private Participant(String name, int pointsBalance){
        this.name = name;
        this.pointsBalance = pointsBalance;
    }

    public void creditPoints(int points){
       this.pointsBalance = pointsBalance + points;
    }

}


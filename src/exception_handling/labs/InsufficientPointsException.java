package exception_handling.labs;

public class InsufficientPointsException extends Exception{

    int points, userPoints;
    InsufficientPointsException(int points, int userPoints){
        this.points = points;
        this.userPoints = userPoints;
    }
    public String toString(){
        return "Insufficient Points";
    }
}

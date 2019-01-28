public class Assignment {
    protected String assignmentName;
    protected double scoreRecieved;
    protected double totalPoints;

    /*
        Constructor for Assignment
    */
    //TODO - replace this with a default constructor that will 
    //take a string, and two floats and initialize the properties appropiatly.
    Assignment(String name, double points, double totalPoints){
        assignmentName = name;
        scoreRecieved = points;
        this.totalPoints = totalPoints;
    }


    /*
        Return the name of the assignment.
    */
    String getName(){ 
        return assignmentName; 
    }

    /*
        Return the score received for the assignment
    */
    double getScore()
    {
        return scoreRecieved; 
    }

    /* 
    Return the points possible for the assignment
    */
    double getTotalPoints(){ 
        return totalPoints; 
    }
}
 
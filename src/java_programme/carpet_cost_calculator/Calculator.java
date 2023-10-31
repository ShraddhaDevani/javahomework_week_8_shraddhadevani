package java_programme.carpet_cost_calculator;

/**
 * Write a class with the name Floor.
 * The class needs two fields (instance variables) with name width and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * PRIME TESTING
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

}




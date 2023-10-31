package java_programme.carpet_cost_calculator;

/**
 * Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
 */
public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }
}

//Class: CMSC203 CRN 31480
//Program: Assignment 4
//Instructor: Professor Ashique Tanveer
//Summary of Description:A property management company manages individual properties they will build to rent, and charges them a management fee as the percentages of the monthly rental amount.
//Due Date: 04/05/24
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student’s Name: Robel Baraki
public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;
    
    public Plot() {
        this(0, 0, 1, 1);
    }
    
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    
    public boolean overlaps(Plot plot) {
        return !(x + width <= plot.x || plot.x + plot.width <= x ||
                 y + depth <= plot.y || plot.y + plot.depth <= y);
    }
    
    public boolean encompasses(Plot plot) {
        return x <= plot.x && y <= plot.y &&
               x + width >= plot.x + plot.width && y + depth >= plot.y + plot.depth;
    }
    
    // Getters and setters
    
    public String toString() {
        return "[" + x + "," + y + "," + width + "," + depth + "]";
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}

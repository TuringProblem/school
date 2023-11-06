/**
 * @author Override
 * @see 11/6/2023 12:13
 * <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */
public class Rectangle {

    public int length;
    public int width;

    public void about() {
        System.out.println("This rectangle has a length of " + length + " and a width of " + width);
    }//end method

    public int area() {
        return length * width;
    }

}

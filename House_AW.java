public class House_AW {

    public static void main(String[] args){
        System.out.println("Create first instance of House class");
        HouseConstructor h1 = new HouseConstructor ("", -1, -1, -1, -1, -1);
        System.out.println("The first house information:");
        System.out.println(h1.toString());
        System.out.println("House 1 cost per square foot: " + h1.calculateCostPerSquareFoot());
        System.out.println("Create second instance of House class");
        HouseConstructor h2 = new HouseConstructor ("1 Main St", 1200, 360000,  44000, 3, 2);
        System.out.println("The second house information:");
        System.out.println(h2.toString());
        System.out.println("House 2 cost per square foot: " + h2.calculateCostPerSquareFoot());

    }

}

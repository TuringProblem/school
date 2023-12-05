import java.util.Scanner;

/**
 * @author Override
 * @see <a href="HTTPS://github.com/TuringProblem">GitHub Profile</a>
 * @since 12/4/2023 15:18
 */

public class HouseConstructor {
    Scanner keyboard = new Scanner(System.in);
    private String address;
    private int houseSize, cost, lotSize, bedrooms, bathrooms;

    //default constructor
    public HouseConstructor() {
        this.address = "Null";
        this.houseSize = 0;
        this.cost = 0;
        this.lotSize = 0;
        this.bedrooms = 0;
        this.bathrooms = 0;
    }

    //Non-Default constructor
    public HouseConstructor(String addressPassed, int houseSizePassed, int costPassed, int lotSizePassed, int bedroomsPassed, int bathroomsPassed) {
        this.setAddress(addressPassed);
        this.setHouseSize(houseSizePassed);
        this.setCost(costPassed);
        this.setLotSize(lotSizePassed);
        this.setBedrooms(bedroomsPassed);
        this.setBathrooms(bathroomsPassed);
    }

    public String getAddress() {
        return this.address;
    }

    public int getHouseSize() {
        return this.houseSize;
    }

    public int getCost() {
        return this.cost;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public int getBedrooms() {
        return this.bedrooms;
    }

    public int getBathrooms() {
        return this.bathrooms;
    }


    public void setAddress(String addressPassed) {
        while(addressPassed.isEmpty() || (addressPassed.length() == 1 && ((int)addressPassed.charAt(0) < 33 || (int)addressPassed.charAt(0) > 126))){
            System.out.println("Name is an invalid format, must be at lease one printable character: ");
            addressPassed = keyboard.nextLine().trim();
        }
        this.address = addressPassed;
    }

    public void setHouseSize(int houseSizePassed) {
        if (houseSizePassed <= 0) {
            System.out.println("Incorrect size, please enter a new number: ");
            houseSizePassed = keyboard.nextInt();
        }
        this.houseSize = houseSizePassed;
    }

    public void setCost(int costPassed) {
        while (costPassed < 0) {
            System.out.println("Incorrect number of cost...\n please enter a new number: ");
            costPassed = keyboard.nextInt();
        }
        this.cost = costPassed;
    }

    public void setLotSize(int lotSizePassed) {
        while (lotSizePassed <= 0) {
            System.out.println("Please enter another amount greater than 0: ");
            lotSizePassed = keyboard.nextInt();
        }
        this.lotSize = lotSizePassed;

    }

    public void setBedrooms(int bedroomsPassed) {
        while (bedroomsPassed <= 0) {
            System.out.println("Please enter another amount of rooms...\n Greater than 0: ");
            bedroomsPassed = keyboard.nextInt();
        }
        this.bedrooms = bedroomsPassed;

    }

    public void setBathrooms(int bathroomsPassed) {
        while (bathroomsPassed <= 0) {
            System.out.println("Please enter another amount of bathrooms...\n Greater than 0: ");
            bathroomsPassed = keyboard.nextInt();
        }
        this.bathrooms = bathroomsPassed;

    }

    @Override
    public String toString() {
        return "\n Address: " + this.getAddress() +
                "\n House Size: " + this.getHouseSize() +
                "\n Cost: " + this.getCost() +
                "\n Lot Size: " + this.getLotSize() +
                "\n Bathrooms: " + this.getBathrooms() +
                "\n Bedrooms: " + this.getBedrooms();
    }
    //String addressPassed, int houseSizePassed, int costPassed, int lotSizePassed, int bedroomsPassed, int bathroomsPassed

    public boolean equals(HouseConstructor housePassed) {
        return this.getAddress().equals(housePassed.getAddress()) &&
                this.getHouseSize() == housePassed.getHouseSize() &&
                this.getCost() == housePassed.getCost() &&
                this.getLotSize() == housePassed.getLotSize() &&
                this.getBedrooms() == housePassed.getBedrooms() &&
                this.getBathrooms() == housePassed.getBathrooms();
    }

    public double calculateCostPerSquareFoot() {
        if (houseSize == 0) {
            return 0.0;
        }
        return  (double) cost / houseSize;
    }
}

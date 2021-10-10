package homework3.exercises;

public class Computer {
    public int year;
    public double price;
    public boolean isNotebook;
    public double hardDiscMemory;
    public double freeMemory;
    public String operationSystem;

    public Computer() {
    }

    public Computer(boolean isNotebook, String operationSystem) {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    public Computer(int year, double price,
                    double hardDiskMemory, double freeMemory) {
        this(false, "Win XP");
        this.year = year;
        this.price = price;
        this.freeMemory = freeMemory;
        this.hardDiscMemory = hardDiskMemory;
    }

    public Computer(int year, double price, boolean isNotebook,
                    double hardDiscMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiscMemory = hardDiscMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer otherComp) {
        return Double.compare(otherComp.price, price);
//        if (price > otherComp.price) {
//            return -1;
//        } else if (price < otherComp.price) {
//            return 1;
//        } else {
//            return 0;
//        }
    }

    public void changeOperationSystem(String newOS) {
        this.operationSystem = newOS;
        System.out.println("New OS is: " + newOS);
    }

    public void useMemory(double memory) {
        if (memory >= freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("Free memory left is: " + freeMemory);
        }
    }

    public void displayComputerInformation() {
        System.out.println("Year manufactured is: " + year);
        System.out.println("Price is: " + price);
        System.out.println("Is it notebook?: " + isNotebook);
        System.out.println("SDD size: " + hardDiscMemory);
        System.out.println("Free memory is: " + freeMemory);
        System.out.println("OS is: " + operationSystem);
    }

}


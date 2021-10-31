package homework3and4.exercises;

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
        this.isNotebook = isNotebook;
        this.operationSystem = "Win XP";
    }

    public Computer(int year, double price,
                    double hardDiskMemory, double freeMemory) {
        this(false, "Win XP");
        this.setYear(year);
        this.price = price;
        this.freeMemory = freeMemory;
        this.hardDiscMemory = hardDiskMemory;
    }

    public Computer(int year, double price, boolean isNotebook,
                    double hardDiscMemory, double freeMemory, String operationSystem) {
        this.setYear(year);
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiscMemory = hardDiscMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }
Computer computer = new Computer(6, 0.5, 6.7, 55.6);

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
        System.out.println("Year manufactured is: " + getYear());
        System.out.println("Price is: " + price);
        System.out.println("Is it notebook?: " + isNotebook);
        System.out.println("SDD size: " + hardDiscMemory);
        System.out.println("Free memory is: " + freeMemory);
        System.out.println("OS is: " + operationSystem);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


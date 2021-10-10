package homework3;

import homework3.exercises.Computer;

public class ComputerDemo {



    public static void main(String[] args) {

        //init the objects
        Computer macBookPro = new Computer();
        Computer lenovoThinkCentre = new Computer();

        Computer dellVostro = new Computer(2020, 1920.99, 1024, 450);
        Computer asusVivoBook = new Computer(220, 1850, true, 1024, 920, "Windows 10");

        //give values to the object's fields
        macBookPro.year = 2020;
        macBookPro.hardDiscMemory = 1024;
        macBookPro.freeMemory = macBookPro.hardDiscMemory;
        macBookPro.isNotebook = true;
        macBookPro.operationSystem = "macOS";
        macBookPro.price = 3500.99;

        lenovoThinkCentre.year = 2021;
        lenovoThinkCentre.hardDiscMemory = 512;
        lenovoThinkCentre.freeMemory = lenovoThinkCentre.hardDiscMemory;
        lenovoThinkCentre.isNotebook = false;
        lenovoThinkCentre.operationSystem = "Windows 10";
        lenovoThinkCentre.price = 1899.99;


        // do the 3rd HW exercise requirements - change fields values and print fields info
        System.out.println("Information for MacBook Pro:");
        macBookPro.useMemory(100);
        System.out.println("-----END-----");
        macBookPro.displayComputerInformation();
        System.out.println("-----END-----");

        System.out.println("Information for computer Lenovo ThinkCentre:");
        lenovoThinkCentre.changeOperationSystem("Linux");
        System.out.println("-----END-----");
        lenovoThinkCentre.displayComputerInformation();
        System.out.println("-----END-----");

        // do the 4th HW exercise requirements
        int compare = asusVivoBook.comparePrice(dellVostro);
        switch (compare) {
            case -1:
                System.out.println("Asus Vivo Book is more expensive than Dell Vostro");
                break;
            case 1:
                System.out.println("Dell Vostro is more expensive than Asus Vivo Book");
                break;
            case 0:
                System.out.println("The computers are with equal prices");
                break;
            default:
                System.out.println("Error !");
                break;
        }
        System.out.println("-----END-----");

    }
}

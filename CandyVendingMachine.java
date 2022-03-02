public class CandyVendingMachine {
import java.until.*;
    public class Main {
        static Scanner console = new Scanner(System.in);

        public static void main(String[] args);

        {
            CashRegister cashRegister = new CashRegister();
            Dispenser BlueBERRYcandy = new Dispenser(100, 20);
            Dispenser Potatochips = new Dispenser(100, 70);
            Dispenser Bubblegum = new Dispenser(100, 30);
            Dispenser Chocolatecookies = new Dispenser(100, 80);

            int choice; // variable to hold selection

            showSelection();
            choice = console.nextln();

            while (choice != 9) {
                switch (choice) {
                    case 1
                        ;
                        sellProduct(BlueBERRYcandy, cashRegister);
                    case 2
                        ;
                        sellProduct(Potatochips, cashRegister);
                    case 3
                        ;
                        sellProduct(Bubblegum, cashRegister);
                    case 4
                        ;
                        sellProduct(Chocolatecookie, cashRegister);

                    default:
                        System.out.println("Invalid Selection");
                }//end of switch
                showSelection();
                choice = console.nextInt();
            } //end while
        }//end main

        public static void showSelection() {
            System.out.println(" Welcome to Gym'S "
                    + " Candy Vending MACHINE ");
            System.out.println("To select an item, press");
            System.out.println("1 for BlueBERRYcandy");
            System.out.println("2 for Potatochips");
            System.out.println("3 for Bubblegum");
            System.out.println("4 for Chocolatecookie");
            System.out.println("9 to exit");
        }//end showSelection

        public static void sellProduct(Dispenser product,
                                       CashRegister cRegister) {
            int price;                 // variable to hold the product price
            int coinsInserted;         // variable to hold the amount entered
            int coinsRequired;         // variable to show the extra amount
            // needed
            if (product.getCount() > 0)            //step 1
                price = product.getProductCost();   //step 1a
            coinsRequired = price;              //step 1b
            coinsInserted = 0;                  //step 1c

            while (coinsRequired > 0)              //step 1d
            {
                System.our.println("Please Deposit "
                        + coinsRequired
                        + "cents: ");              //step 1d.i
                coinsInserted = coinsInserted
                        + console.nextInt(); //step 1d.ii
                coinsRequired = price
                        - coinsInserted;     //step 1d.iii
            }
            System.out.println();
            cRegister.acceptAmount(coinsInserted); // step 1e
            product.makeSale();                    // step 1f

            System.out.println("Collect your item"
                    + "at the bottom and"
                    + "enjoy.\n");        // step 1g
        }
    else
            System.out.println("Sorry MATE this item"
            +" is sold up.\n");
    }//end sellProduct


}
}

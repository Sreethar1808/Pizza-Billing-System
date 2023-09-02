import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the AccioJob Pizza hub \n");
        System.out.println("Do you want to enjoy your Pizza \n If yes then press one\n or press 0");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n==0)
        {
            System.out.println("Thank you for vsiting us. please come again");
        }
        else {
            System.out.println("How many pizza do want to order");
            int NumberofPizza=sc.nextInt();
            ArrayList<pizza> pizzalist = new ArrayList<>();
            for(int i=0;i<NumberofPizza;i++)
            {
                System.out.println("Are you looking for a Non-veg pizza \n if yes press 0 for veg or press 1 for non veg");
                int isVeg=sc.nextInt();
                Boolean veg=false;
                if(isVeg==0)
                {
                    veg=true;
                }
                System.out.println("What size you prepared press 0:for small, \n press 1: medium \n press 2: large");
                int size=sc.nextInt();
                pizza pizzahut=new pizza(veg,size);

                System.out.println("Do you want a toppings if yes:1 or No :0 ");
                int topping=sc.nextInt();
                if(topping==1) {
                    pizzahut.addExtraTopings();
                }

                System.out.println("Do you want a cheese if yes:1 or No :0 ");
                int cheese=sc.nextInt();
                if(cheese==1) {
                    pizzahut.addExtraCheese();
                }

                System.out.println("Do you want a takeaway if yes:1 or No :0 ");
                int takeaway=sc.nextInt();
                if(takeaway==1) {
                    pizzahut.addTakeAwayBags();
                }
                pizzalist.add(pizzahut);
            }
            String Total="";
            int total=0;
            for(int i=0;i<NumberofPizza;i++)
            {
                pizza localpizza=pizzalist.get(i);
                Total+=localpizza.getBill();
                total+=localpizza.gettotal();
            }

            Total+="Your grand total of your order is "+total+"/-"+"\n";
            System.out.println(Total);
        }


//        pizza Delicious = new pizza(false,2);
//        Delicious.addExtraCheese();
//        Delicious.addExtraTopings();
//        Delicious.addTakeAwayBags();
//
//        pizza Delicious2=new pizza(true,1);
//        String totalBill= Delicious.getBill();
//        totalBill+= Delicious2.getBill();
//        totalBill+="Grand total of your order is "+(Delicious2.gettotal()+ Delicious.gettotal())+"/-"+"\n";
//        //System.out.println(Delicious.getBill());
//        //System.out.println(Delicious2.getBill());
//        System.out.println(totalBill);
    }
}
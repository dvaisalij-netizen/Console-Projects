package IceCreamSystem;


    /*
     **** Basic Program ****
     * create 3 Entities: Customer,coneIcecream,cupIcecream
     * customer knows ; flavor,Icecreamtype  \\ unknown ; orderId,price
     * coneicecream & cupicecream knows ;orderId,price \\ unknown ; flavor,Icecreamtype
     * and create constructor with params and one empty constructor(default) for both cone and cup.
     * then the method are orderIcecream( string flaovor) inside method sets price cone :80,cup:40 then print "icecream served".
     *
     **** Main Logic ****
     *create two customer then create constructor with flavor and icecreamtype. and one empty constructor also use setters
     * if(customer is cone)
     * then create known cone and perform ordreIcecream with cone
     * convey the order id and price to customer
     *if(customer is cup)
     *  create empty cup and set falvor and price.perform ordreIcecream with cup
     * convey the order id and price to customer
     *  print customer1 price and orderid with getter
     * print customer2 price and orderid with getter

     **** Version 2 ****
     *problem :
     * every time customer to main to cone /cup to get details and vice versa
     *solution
     * make customer aware of cone /cup and vice versa
     *Passenger changes remove orderId ,price \\\ add cone and cup (getter/setter)
     * cone &cup changes remove falvour \\ add customer (getter/setter)

     **** mainlogic ****
     *if (customer is cone)
     * create known cone and perform ordreIcecream with cone
     * share the address with cone to customer and vise versa
     *if(customer is cup)
     *  create empty cup and set falvor and price.perform ordreIcecream with cup
     *  share the address with cup to customer and vise versa
     *after this we should create abstract class for cone and cup .Name it as icecream.

     */

    public class Main {
        public static void main(String args[]){
            Customer customer1 = new Customer("Chocolate","Cone");
            Customer customer2 = new Customer();

            customer2.setFlavor("Mango");
            customer2.setIceCreamType("cup");
            if (customer1.getIceCreamType() == "Cone") {
                ConeIceCream cone = new ConeIceCream("ci23",80);
                cone.orderIcecream(customer1.getFlavor());
                cone.setCustomer(customer1);
                customer1.setCone(cone);
                System.out.println(cone.getOrderId());
                System.out.println(cone.getPrice());
            }
            if (customer2.getIceCreamType() == "cup") {
                CupIceCream cup = new CupIceCream();
                cup.setCustomer(customer2);
                customer2.setCup(cup);
                cup.setOrderId("cp34");
                cup.setPrice(60);
                cup.orderIcecream(customer2.getFlavor());
                System.out.println(customer2.getCup().getOrderId());
                System.out.println(customer2.getCup().getPrice());
            }
        }
    }


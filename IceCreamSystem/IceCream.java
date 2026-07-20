package IceCreamSystem;

public  abstract class IceCream {
        private String orderId;
        private int price;
        private Customer Customer;
        public String getOrderId() {
            return orderId;
        }
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void orderIcecream(String flavor){
            System.out.println("IceCream served");
            System.out.println("Flavor");
            System.out.println(flavor);
        }
        public Customer getCustomer() {
            return Customer;
        }
        public void setCustomer(Customer Customer) {
            this.Customer = Customer;
        }
    }


package IceCreamSystem;

public class Customer {
        private String flavor;
        private String iceCreamType;
        private ConeIceCream cone;
        private CupIceCream cup;
        Customer(String flavor,String iceCreamType){
            this.flavor=flavor;
            this.iceCreamType=iceCreamType;
        }
        Customer(){
        }
        public String getFlavor() {
            return flavor;
        }
        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }
        public String getIceCreamType() {
            return iceCreamType;
        }
        public void setIceCreamType(String iceCreamType) {
            this.iceCreamType = iceCreamType;
        }
        public ConeIceCream getCone() {
            return cone;
        }
        public void setCone(ConeIceCream cone) {
            this.cone = cone;
        }
        public CupIceCream getCup() {
            return cup;
        }
        public void setCup(CupIceCream cup) {
            this.cup = cup;
        }
    }


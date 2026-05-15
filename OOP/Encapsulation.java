class Encapsulation{


//     Encapsulation focuses on wrapping data and methods together into a single unit (class) and protecting data using access modifiers.
// 

    static class Customer{
        String name;
        private String pin;
        private int balance;
        
        //constructor
        public Customer(String name, String pin, int balance){
            this.name = name;
            this.pin = pin;
            this.balance = balance;
        }
        //getter
        public int getBalance(){
            return balance;
        }

        //setter
        public void deposite(int price){
            balance = balance + price;
        }

        public void widraw(int price){
            balance = balance - price;
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("xyz", "123", 100000);
    
        System.out.println("Balance" + c1.getBalance());

        c1.deposite(2000);
        System.out.println("After deposite" + c1.getBalance());


    }
}
package bank;

public class Bank {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        Branch branch1 = new Branch("123", "Tehran", 1);
        Branch branch2 = new Branch("456", "Isfahan", 2);
        Branch branch3 = new Branch("789", "Mashhad", 3);

        customers[0] = new Customer("Mojtaba",
                new Account("123456", 111.222, branch1),
                new CreditCard("6362 1410 8436 8092", 222.333));

        customers[1] = new Customer("Mohammad",
                new Account("456789", 222.333, branch2),
                new CreditCard("6037 9973 4668 4823", 333.444));

        customers[2] = new Customer("Reza",
                new Account("789123", 444.555, branch3),
                new CreditCard("6362 1410 8564 2314", 333.444));
        customers[3] = new Customer("Ali",
                new Account("123789", 111.111, branch1),
                new CreditCard("6037 9973 8564 2314", 222.111));

        for (int i = 0; i < customers.length; i++) {
            System.out.print("Total balance of customer " + i + " : " + customers[i].calCustomerBalance());
            System.out.println();
        }
        double sum = 0;
        for (Customer customer : customers) {
            if (customer.getAccount().getBranch().equals(branch1))
                sum += customer.calCustomerBalance();
        }
        System.out.print("Total balance of branch 1: ");
        System.out.println(sum);
    }
}

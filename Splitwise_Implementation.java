import java.util.*;
public class Splitwise_Implementation {

    static class User {
        String name;
        User(String name) {
            this.name = name;
        }
    }

    static class Transaction {
        User from;
        User to;
        double amount;
        Transaction(User from, User to, double amount) {
            this.from = from;
            this.to = to;
            this.amount = amount;
        }

        public String toString() {
            return from.name + " pays " + to.name + " : " + amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();
        User[] users = new User[n];
        double[] spent = new double[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            users[i] = new User(name);
            System.out.print("Amount spent by " + name + ": ");
            spent[i] = sc.nextDouble();
            sc.nextLine();
            total += spent[i];
        }
        double share = total / n;
        List<Integer> debtors = new ArrayList<>();
        List<Integer> creditors = new ArrayList<>();
        double[] balance = new double[n];
        for (int i = 0; i < n; i++) {
            balance[i] = spent[i] - share;
            if (balance[i] < 0) {
                debtors.add(i);
            } 
            else if (balance[i] > 0) {
                creditors.add(i);
            }
        }
        int i = 0;
        int j = 0;
        System.out.println("\nSettlement:");
        while (i < debtors.size() && j < creditors.size()) {
            int d = debtors.get(i);
            int c = creditors.get(j);
            double debt = -balance[d];
            double credit = balance[c];
            double pay = Math.min(debt,credit);
            System.out.println(users[d].name + " pays " + users[c].name + " : " + pay + " units");
            balance[d] += pay;
            balance[c] -= pay;
            if (Math.abs(balance[d]) < 0.0001) {
                i++;
            }
            if (Math.abs(balance[c]) < 0.0001) {
                j++;
            }
        }
    }
}
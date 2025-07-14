class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
 
    class Account 
    {
        private double balance;
        public Account(double balance) 
        {
            this.balance = balance;
        }
        public void withdraw(double amount) 
        {
            try 
            {
                if (amount > balance) 
                {
                    throw new InsufficientBalanceException("Insufficient balance in account");
                }
                balance -= amount;
                System.out.println("Amount withdrawn: " + amount);
                System.out.println("Remaining balance: " + balance);
            }
            catch (InsufficientBalanceException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }    
        public class Throw 
        {
            public static void main(String[] args) 
            {
                Account account = new Account(1000);
                account.withdraw(1500);
            }
        }
}



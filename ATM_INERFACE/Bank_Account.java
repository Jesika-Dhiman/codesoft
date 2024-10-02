package ATM_INERFACE;
 class Bank_Account {
     private  String account_number;
     private  double amount;

     public String getAccount_number() {
         return account_number;
     }

     public double getAmount() {
         return amount;
     }
     Bank_Account(String account_number, double amount){
         this.account_number=account_number;
         this.amount=amount;
     }

     //Deposit
     void  deposit( double amount){
        this.amount+=amount;
         System.out.println("***** Deposition Complete ******");
         System.out.println("Total amount : "+getAmount());

     }

     //withdrawal
     void withdraw(double amount){
         if(getAmount()==100)
         {
             System.out.println("Insufficient Balance!");
         }
         else if (getAmount()==amount)
         {
             System.out.println("Total amount in Your Account "+getAccount_number()+" is : "
             +getAmount());
             System.out.println("******Withdrawal process is fail*****");
         }
         else
         {
             this.amount-=amount;
             System.out.println("Total amount : "+getAmount());
             System.out.println("******Withdrawal is complete****");
         }



     }
}

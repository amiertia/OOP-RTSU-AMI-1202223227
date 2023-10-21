import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat Objek Bank
        Bank bank = new Bank();

        // Membuat Objek Account
        Account acc1 = new Account("AMI_SI4606", "1202223227",500000.0);
        Account acc2 = new Account("Budi Dalton", "12",400000.0);
        Account acc3 = new Account("Edi Cotok", "41",400000.0);

        // Memasukan Account kedalam
        bank.AddAccount(acc1);
        bank.AddAccount(acc2);
        bank.AddAccount(acc3);

        System.out.println("Saldo Akun " +acc1.getName() + " : " +acc1.GetAccountBalance());
        System.out.println("Saldo Akun " +acc2.getName() + " : " +acc2.GetAccountBalance());
        System.out.println("Saldo Akun " +acc3.getName() + " : " +acc3.GetAccountBalance());
        System.out.println();
        acc1.Deposit(100000);
        acc2.Withdraw(50000);
       
        System.out.println("Saldo Akun " +acc1.getName() + " Setelah Menyetor:" +acc1.GetAccountBalance());
        System.out.println("Saldo Akun " +acc2.getName() + " Setelah Menarik Uang:" +acc2.GetAccountBalance());
        System.out.println();
        bank.RemoveAccount("41");
        System.out.println();
        // print semua akun
        ArrayList<Account> AllAccount = bank.getAllAcounts();
        for (Account acc: AllAccount) {
            System.out.println("Nama: " + acc.getName() + " Nomor Akun: " + acc.GetAccountNumber() + " Saldo Akun: " + acc.GetAccountBalance());
        }
        
    }    
}

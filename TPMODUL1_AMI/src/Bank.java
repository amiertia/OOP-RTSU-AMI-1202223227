import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> Accounts;

    public Bank() {
        Accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAllAcounts() {
        return Accounts;
    }

    public void AddAccount(Account account) {
        Accounts.add(account);
    }

    public void RemoveAccount(String AccountNumber) {
        Account AccountToRemove = null;
        for (Account acc: Accounts) {
            if (acc.GetAccountNumber().equals(AccountNumber)) {
                AccountToRemove = acc;
                break;
            }
        }
    
        if (AccountToRemove != null) {
            Accounts.remove(AccountToRemove);
            System.out.println("Akun " + AccountToRemove.getName() + " Berhasil Dihapus");
        } else {
            System.out.println("Akun dengan nomor " + AccountNumber + " Tidak Ditemukan!");
        }
    }
    

    
}

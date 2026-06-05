package Design_Patterns;

class AccountService {
    void create() {
        System.out.println("Account Created");
    }
}

class BankFacade {

    AccountService as = new AccountService();

    void openAccount() {
        as.create();   // simplified access
    }
}

class FacadeDemo {
    public static void main(String[] args) {
        BankFacade b = new BankFacade();
        b.openAccount();
    }
}
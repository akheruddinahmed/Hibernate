package driver;

import entity.Accounts;
import entity.Bank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("akher");
        System.out.println(emf);

        EntityManager manager = emf.createEntityManager(); //for crud method
        System.out.println("em created");

        EntityTransaction transaction = manager.getTransaction(); //transaction management
        System.out.println("Transection created");

        Bank bank=new Bank();
        bank.setId(1);
        bank.setName("SBI");

        Accounts ac1 =new Accounts();
        ac1.setId(101);
        ac1.setName("Akher");
        ac1.setBalance(10000);

        Accounts ac2 =new Accounts();
        ac2.setId(102);
        ac2.setName("Anis");
        ac2.setBalance(100000);

        List<Accounts> acc=new ArrayList<Accounts>();
        acc.add(ac1);
        acc.add(ac2);

        transaction.begin();
        bank.setAccounts(acc);
        manager.persist(bank);
        manager.persist(ac1);
        manager.persist(ac2);
        transaction.commit();

    }

}

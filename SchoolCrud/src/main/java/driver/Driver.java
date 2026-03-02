package driver;

import entity.Teacher;
import jakarta.persistence.*;

import java.util.List;

public class Driver {

    public static void main(String[] args) {

        // -------------------------------
        // STEP 1: Create EntityManagerFactory
        // -------------------------------
        // Reads configuration from persistence.xml
        // Uses persistence unit name "akher"
        // Heavy object → should be created only once per application
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("akher");
        System.out.println("EMF created");


        // -------------------------------
        // STEP 2: Create EntityManager
        // -------------------------------
        // Used to perform CRUD operations
        // Lightweight object → can create multiple
        EntityManager manager = emf.createEntityManager();
        System.out.println("EM created");


        // -------------------------------
        // STEP 3: Get Transaction Object
        // -------------------------------
        // Required for INSERT, UPDATE, DELETE
        // Not mandatory for SELECT queries
        EntityTransaction transaction = manager.getTransaction();


        // -------------------------------
        // Creating Teacher Objects
        // -------------------------------
        Teacher teacher1 = new Teacher();
        teacher1.setId(101);
        teacher1.setName("Akher");
        teacher1.setAge(21);

        Teacher teacher2 = new Teacher();
        teacher2.setId(102);
        teacher2.setName("Anis");
        teacher2.setAge(21);


        // ==================================================
        // INSERT OPERATION
        // ==================================================
        // transaction.begin();        // Start transaction
        // manager.persist(teacher1);  // Save object to DB
        // manager.persist(teacher2);
        // transaction.commit();       // Commit changes


        // ==================================================
        // FETCH OPERATION (Find by Primary Key)
        // ==================================================
        // Teacher teacher = manager.find(Teacher.class, 101);
        //
        // if (teacher != null) {
        //     System.out.println(
        //         teacher.getName() + " is a teacher, whose id is "
        //         + teacher.getId() + " and age is: "
        //         + teacher.getAge()
        //     );
        // } else {
        //     System.out.println("Invalid ID");
        // }


        // ==================================================
        // UPDATE OPERATION
        // ==================================================
        // transaction.begin();
        //
        // Teacher teacher = manager.find(Teacher.class, 102);
        // if (teacher != null) {
        //     teacher.setAge(22);
        //     teacher.setName("Anis Ur Rahman");
        //
        //     manager.merge(teacher);  // Update entity
        //     transaction.commit();
        // }


        // ==================================================
        // DELETE OPERATION
        // ==================================================
        // transaction.begin();
        //
        // Teacher teacher = manager.find(Teacher.class, 102);
        // if (teacher != null) {
        //     manager.remove(teacher);  // Remove entity
        //     transaction.commit();
        // }


        // ==================================================
        // JPQL SELECT QUERY
        // ==================================================
        // Query query = manager.createQuery(
        //         "select t from Teacher t where t.age >= 20");
        //
        // List<Teacher> resuList = query.getResultList();
        //
        // for (Teacher teacher : resuList) {
        //     System.out.println(teacher.getName());
        // }


        // ==================================================
        // POSITIONAL PARAMETER QUERY
        // ==================================================
        // ?1, ?2 represent parameter positions
        //
        // Query query = manager.createQuery(
        //     "select t from Teacher t where t.age = ?1 and t.name = ?2");
        //
        // query.setParameter(1, 22);
        // query.setParameter(2, "Anis");
        //
        // List<Teacher> resuList = query.getResultList();
        //
        // for (Teacher teacher : resuList) {
        //     System.out.println(teacher.getName());
        // }


        // ==================================================
        // NAMED PARAMETER QUERY (Recommended)
        // ==================================================
        // More readable and safer than positional parameters
        //
        // Query query = manager.createQuery(
        //     "select t from Teacher t where t.age = :age and t.name = :name");
        //
        // query.setParameter("age", 22);
        // query.setParameter("name", "Anis");
        //
        // List<Teacher> resuList = query.getResultList();
        //
        // for (Teacher teacher : resuList) {
        //     System.out.println(teacher.getName());
        // }


        // -------------------------------
        // Best Practice (Optional but Recommended)
        // -------------------------------
        // Close resources after use
        // manager.close();
        // emf.close();
    }
}
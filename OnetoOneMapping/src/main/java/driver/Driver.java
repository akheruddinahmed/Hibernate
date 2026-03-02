package driver;
import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("akher");
        System.out.println(emf);

        EntityManager manager = emf.createEntityManager(); //for crud method
        System.out.println("em created");

        EntityTransaction transaction = manager.getTransaction(); //transaction management
        System.out.println("Transection created");

        //ONE TO ONE  MAPPING
//				Car car=new Car();
//				car.setId(102);
//				car.setName("wagnor");
//				car.setPrice(10000000);
//
//
//				Engine engine=new Engine();
//				engine.setEid(2);
//				engine.setType("Diesel");
//				engine.setCc(1500);
//
//				transaction.begin();
//				car.setEngine(engine);
//				manager.persist(engine);
//				manager.persist(car);
//				transaction.commit();


//				Car car=manager.find(Car.class, 101);
//				if(car!=null && car.getEngine()!=null) {
//					System.out.println(car.getName()+ " has "+
//				car.getEngine().getType()+" Engine");
//				}


        //individual car details
//				Car car=manager.find(Car.class, 101);
//				if(car!=null) {
//					System.out.println(car.getId() +" "+ car.getName()+" "+ car.getPrice());
//				}
//
//
//				//individual engine details
//				Engine engine=manager.find(Engine.class, 1);
//				if(engine!=null) {
//					System.out.println(engine.getEid()+" "+engine.getType()+" "+ engine.getCc());
//				}

        //update car and engine

//				transaction.begin();
//				Car car=manager.find(Car.class, 101);
//				if(car!=null && car.getEngine()!=null) {
//					car.setName("SWIFT RS");
//					car.getEngine().setType("PETROL+CNG");
//					manager.merge(car);
//					manager.merge(car.getEngine());
//					transaction.commit();
//				}else {
//					System.out.println("INVALID ID !");
//				}

        //UPDATE ONLY CAR
//				transaction.begin();
//				Car car=manager.find(Car.class, 101);
//				if(car!=null) {
//					car.setName("SWIFT RS1");
//					manager.merge(car);
//					transaction.commit();
//				}

        //UPDATE ONLY ENGINE
//				transaction.begin();
//				Engine engine=manager.find(Engine.class, 1);
//				if(engine!=null) {
//					engine.setCc(2000);
//					manager.merge(engine);
//					transaction.commit();
//				}

        //Delete Car

//				transaction.begin();
//				Car car=manager.find(Car.class, 102);
//				if(car!=null) {
//					manager.remove(car);
//					transaction.commit();
//				}

        //delete engine without
        //this will not delete engine

//				transaction.begin();
//				Engine engine=manager.find(Engine.class, 1);
//				if(engine!=null) {
//					System.out.println("engine is present");
//					manager.remove(engine);
//					transaction.commit();
//				}

        //delete engine without deleting parent
        //this will work

//				transaction.begin();
//				Car car=manager.find(Car.class, 101);
//				Engine engine=manager.find(Engine.class, 1);
//				if(car!=null) {
//					car.setEngine(null);
//				}
//				System.out.println("engine set to null");
//				manager.remove(engine);
//				transaction.commit();
        





    }






}


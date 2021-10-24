package intheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class componentBaseW9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FulltimeEmployee emp1 = new FulltimeEmployee(); //emp1 is Fulltime
        ParttimeEmployee emp2 = new ParttimeEmployee(); //emp2 is Parttime
        
        //EmployeeTable.insertEmployee(emp1); //don't Comment Code when you want insert 
        //emp1.setName("Theerakan");
        //emp1.setSalary(30000);
        //emp2.setName("Natethavorn");
        //emp2.setHoursWork(8);
        
        //EmployeeTable.updateFullTimeEmployee(emp1); //don't Comment Code when you want update FullTime
        //emp1.setName("Kondo");
        //emp1.setSalary(25000);
        
        //EmployeeTable.updatePartTimeEmployee(emp2); //don't Comment Code when you want update PastTime
        //emp2.setName("Takamura");
        //emp2.setHoursWork(8);
        
        //EmployeeTable.removeFullTimeEmployee(emp1); //don't Comment Code when you want remove FullTime
        //EmployeeTable.removePartTimeEmployee(emp2); //don't Comment Code when you want remove PastTime
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("intheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}

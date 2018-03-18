package pain.humiliation.java.internetGetto.PetroKozak.task14.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pain.humiliation.java.internetGetto.PetroKozak.task14.modelOfTable.Model;

public class HibernateUtils {  //todo this is not an UTIL, this is CONFIG

    private static Configuration configuration;
    private static Session session;

    protected static Session getSession(){
        configuration = new Configuration();
        configuration.addAnnotatedClass(Model.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        session = sessionFactory.openSession();
        //todo add extra line
        return session;
    }
    public static void shutdown() {
        getSession().close();
    }
}

package pain.humiliation.java.internetGetto.PetroKozak.task14.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static Configuration configuration;
    private static Session session;
    protected static Session getSession(){
        configuration = new Configuration();
        configuration.configure("hibernate_sp.cfg.xml");
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
        session = sessionFactory.openSession();
        return session;
    }
    public static void shutdown() {
        getSession().close();
    }
}

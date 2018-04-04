package pain.humiliation.java.internetGetto.Calllka.task16.configuration;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.Calllka.task16.model.*;

import java.util.HashMap;
import java.util.Map;

public class HibernateConfiguration {
    private static StandardServiceRegistry registry;
    private static Session sessionFactory;

    static {
        try {
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
            Map<String, String> settings = new HashMap<>();

            settings.put(Environment.DRIVER, "org.postgresql.Driver");
            settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/CalllkaDB");
            settings.put(Environment.USER, "calllka");
            settings.put(Environment.PASS, "test");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            settings.put(Environment.HBM2DDL_AUTO, "create-drop");

            registry = registryBuilder.applySettings(settings).build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Interests.class)
                    .addAnnotatedClass(SocialNetwork.class)
                    .addAnnotatedClass(UserCredentials.class)
                    .addAnnotatedClass(UserPassword.class)
                    .addAnnotatedClass(Work.class)
                    .getMetadataBuilder().build()
                    .getSessionFactoryBuilder().build()
                    .openSession();  //todo move properties to separate line DONE
        } catch (Exception e) {
            e.printStackTrace();

            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }
    }

    protected static Session getSessionFactory() {
        return sessionFactory;
    }
}

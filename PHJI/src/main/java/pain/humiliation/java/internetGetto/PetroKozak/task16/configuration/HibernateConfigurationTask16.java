package pain.humiliation.java.internetGetto.PetroKozak.task16.configuration;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.*;

import java.util.HashMap;
import java.util.Map;

public class HibernateConfigurationTask16 {

    private static StandardServiceRegistry registry;
    private static Session sessionFactory;

    static {
        try {
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
            Map<String, String> settings = new HashMap<>();

            settings.put(Environment.DRIVER, "org.postgresql.Driver");
            settings.put(Environment.URL, "jdbc:postgresql://127.0.0.1:5433/PedroPostgresDB");
            settings.put(Environment.USER, "postgres");
            settings.put(Environment.PASS, "postgres");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            settings.put(Environment.HBM2DDL_AUTO,"update");

            registry = registryBuilder.applySettings(settings).build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Work.class)
                    .addAnnotatedClass(Interests.class)
                    .addAnnotatedClass(SocialNetwork.class)
                    .addAnnotatedClass(UserCredentials.class)
                    .addAnnotatedClass(UserPassword.class)
                    .getMetadataBuilder().build()
                    .getSessionFactoryBuilder().build()
                    .openSession();
        } catch (Exception e) {
            e.printStackTrace();

            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }
    }

    protected static Session getSession() {
        return sessionFactory;
    }
}

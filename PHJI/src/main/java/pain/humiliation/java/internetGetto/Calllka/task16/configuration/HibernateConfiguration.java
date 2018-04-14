package pain.humiliation.java.internetGetto.Calllka.task16.configuration;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.Calllka.task16.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration class is used to describe the database connection settings.
 * The class had the static method to configure the Hibernates work.
 * <p>
 * The method uses the Map to put all the settings together using
 * the Environment provides access to configuration info passed in properties objects.
 * The MetadataSource create a metadata sources using the specified service registry.
 * (the MetadataSource tell Hibernate about sources)
 * <p>
 * If the field "registry" is not empty, the StandardServiceRegistryBuilder will be destroyed.
 *
 * @author calllka
 * @version 1.0
 * @see StandardServiceRegistryBuilder
 * @see Environment
 * @see MetadataSources
 * @see Session
 * @since 4.4.2018
 */
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
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Interests.class)
                    .addAnnotatedClass(SocialNetwork.class)
                    .addAnnotatedClass(UserCredentials.class)
                    .addAnnotatedClass(UserPassword.class)
                    .addAnnotatedClass(Work.class)
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

    /**
     * This is the method to get the opened Session
     *
     * @return Session if the Session was opened successfully.
     */
    protected static Session getSessionFactory() {
        return sessionFactory;
    }
}

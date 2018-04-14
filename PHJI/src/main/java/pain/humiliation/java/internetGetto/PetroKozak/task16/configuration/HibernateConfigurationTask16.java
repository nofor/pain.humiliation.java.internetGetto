package pain.humiliation.java.internetGetto.PetroKozak.task16.configuration;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.*;

import java.util.HashMap;
import java.util.Map;

/**
 * The following class contains the Hibernate Configuration which will be used only in the
 * pain.humiliation.java.internetGetto.PetroKozak.task16 package.
 *
 * @author Petro Kozak
 */
public class HibernateConfigurationTask16 {

    private static StandardServiceRegistry registry;
    private static Session sessionFactory;

    /**
     * This is the static method to configure the Hibernates work.
     *
     * The method uses the Map to put all the settings together using
     * the Environment class for adding the needed properties.
     * The method builds the SessionFactory while creating the MetadataSources
     * instance with field registry (which is created while applying the settings
     * while calling applySettings() method in the StandardServiceRegistryBuilder instance) as parameter.
     *
     * The annotated classes are added for the table mapping and the Session gets opened.
     *
     * If the field "registry" is not empty, the StandardServiceRegistryBuilder will be destroyed.
     *
     * @see StandardServiceRegistryBuilder
     * @see Environment
     * @see MetadataSources
     * @see Session
     */
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

    /**
     * This is the method to get the opened Session
     *
     * @return <code>Session</code> if the Session was opened successfully.
     */
    protected static Session getSession() {
        return sessionFactory;
    }
}

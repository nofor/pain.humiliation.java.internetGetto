package pain.humiliation.java.internetGetto.PetroKozak.task14.configuration;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;

import java.util.HashMap;
import java.util.Map;

public class HibernateConfiguration {

    private static StandardServiceRegistry registry;
    private static Session sessionFactory;

    static {
        try {
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
            Map<String, String> settings = new HashMap<>();

            settings.put(Environment.DRIVER, "org.sqlite.JDBC");
            settings.put(Environment.URL, "jdbc:sqlite:src/main/resources/pedroDB");
            settings.put(Environment.USER, "");
            settings.put(Environment.PASS, "");
            settings.put(Environment.DIALECT, "com.enigmabridge.hibernate.dialect.SQLiteDialect");

            registry = registryBuilder.applySettings(settings).build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Model.class)
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

    protected static Session getSession() {
        return sessionFactory;
    }
}

package pain.humiliation.java.internetGetto.Calllka.task14.utils;  //todo rename utils

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;

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
            settings.put(Environment.URL, "jdbc:sqlite:src/main/resources/CalllkaDB");
            settings.put(Environment.USER, "");
            settings.put(Environment.PASS, "");
            settings.put(Environment.DIALECT, "com.enigmabridge.hibernate.dialect.SQLiteDialect");

            registry = registryBuilder.applySettings(settings).build();

            sessionFactory = new MetadataSources(registry).addAnnotatedClass(UserModel.class).getMetadataBuilder().build().getSessionFactoryBuilder().build().openSession();  //todo move properties to separate line
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
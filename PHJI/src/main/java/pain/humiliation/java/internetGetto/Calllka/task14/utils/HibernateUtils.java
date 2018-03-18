package pain.humiliation.java.internetGetto.Calllka.task14.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;

public class HibernateUtils {  //todo this is not an UTIL, this is CONFIG
    private static Session sessionFactory;
    private static Configuration configuration;

    static {
        configuration = new Configuration()
        //todo no need add extra line here because of this is one peace of code
                .setProperty("hibernate.dialect", "com.enigmabridge.hibernate.dialect.SQLiteDialect")
                .setProperty("hibernate.connection.driver_class", "org.sqlite.JDBC")
                .setProperty("hibernate.connection.url", "jdbc:sqlite:src/main/resources/CalllkaDB")
                .setProperty("hibernate.connection.username", "")
                .setProperty("hibernate.connection.password", "")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.format_sql", "true")
                .setProperty("hibernate.hbm2ddl.auto", "update")
                .setProperty("hibernate.connection.autocommit", "true")
                .setProperty("hibernate.current_session_context_class", "thread")
                //todo remove extra line
                .addAnnotatedClass(UserModel.class);
    }

    protected static Session getSessionFactory() {  //todo why this is protected ??? rename this method as getSession
        SessionFactory factory = configuration.buildSessionFactory();
        sessionFactory = factory.openSession();  //todo remove it.
        //todo add extra line
        return factory.openSession();
    }

    public static void shutdown() {  //todo this method not used
        getSessionFactory().close();
    }
}
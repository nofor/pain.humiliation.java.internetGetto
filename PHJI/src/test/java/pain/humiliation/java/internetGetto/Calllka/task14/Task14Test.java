package pain.humiliation.java.internetGetto.Calllka.task14;

import org.junit.Test;
import pain.humiliation.java.internetGetto.Calllka.task14.dao.imp.Task14;
import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;

public class Task14Test {
    Task14 useHibernate = new Task14();

    @Test
    public void testInsertInToTheTable() {
        useHibernate.insertInToTheTable(new UserModel("1", "1", 1, "1"));
        useHibernate.insertInToTheTable(new UserModel("2", "2", 2, "2"));
        useHibernate.insertInToTheTable(new UserModel("3", "3", 3, "3"));
        useHibernate.insertInToTheTable(new UserModel("4", "4", 4, "4"));
        useHibernate.insertInToTheTable(new UserModel("5", "5", 5, "5"));
    }

    @Test
    public void testDeleteUser() {
        useHibernate.deleteUser(1);
    }

    @Test
    public void testSelectAllFromTable() {
        useHibernate.selectAllFromTable();
    }
}

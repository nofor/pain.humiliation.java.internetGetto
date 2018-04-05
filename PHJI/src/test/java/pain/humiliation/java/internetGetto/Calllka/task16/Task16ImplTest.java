package pain.humiliation.java.internetGetto.Calllka.task16;

import org.junit.Before;
import org.junit.Test;
import pain.humiliation.java.internetGetto.Calllka.task16.dao.impl.Task16Impl;
import pain.humiliation.java.internetGetto.Calllka.task16.model.*;

import java.util.HashSet;
import java.util.Set;

public class Task16ImplTest {

    Set<Work> workID = new HashSet<>();
    Set<Work> workID2 = new HashSet<>();
    Set<Work> workID3 = new HashSet<>();
    Set<Interests> interestsId = new HashSet<>();
    Set<Interests> interestsId2 = new HashSet<>();
    Set<Interests> interestsId3 = new HashSet<>();
    Set<SocialNetwork> socialNetworkId = new HashSet<>();
    Set<SocialNetwork> socialNetworkId2 = new HashSet<>();
    Set<SocialNetwork> socialNetworkId3 = new HashSet<>();
    Task16Impl useHibernate = new Task16Impl();

    @Before
    public void insertData() {
        workID.add(new Work("ProductEngine", "Analyst", "600"));
        workID2.add(new Work("Translator", "TheBestOfTheBest", "10000000"));
        workID3.add(new Work("ProductEngine", "Teamlead", "1000"));
        workID3.add(new Work("OutSensei", "TheBestSensei", "All the money in the world"));
        interestsId.add(new Interests("football", "10"));
        interestsId.add(new Interests("basketball", "10"));
        interestsId2.add(new Interests("chess", "5"));
        interestsId3.add(new Interests("football", "10"));
        socialNetworkId.add(new SocialNetwork("Calllka", "5"));
        socialNetworkId2.add(new SocialNetwork("Padro", "10"));
        socialNetworkId3.add(new SocialNetwork("house.m.d", "15"));

        useHibernate.insertInToTheTable(new Users("Alexandr", "Novikov", 25, workID, interestsId, socialNetworkId, new UserCredentials("Calllka", "1", new UserPassword("2", "3"))));
        useHibernate.insertInToTheTable(new Users("Petro", "Kozak", 23, workID2, interestsId2, socialNetworkId2, new UserCredentials("Pedro", "2", new UserPassword("3", "4"))));
        useHibernate.insertInToTheTable(new Users("Artem", "Zaicev", 29, workID3, interestsId3, socialNetworkId3, new UserCredentials("house.m.d", "3", new UserPassword("4", "5"))));

        useHibernate.selectAllFromTable();
    }

    @Test
    public void deleteElement() {
        useHibernate.deleteUser(1);
        useHibernate.selectAllFromTable();
    }

    @Test
    public void deleteAllFieldsTest() {
        useHibernate.deleteAllFields();
        useHibernate.selectAllFromTable();
    }

    @Test
    public void selectAllFromTableTest(){
        useHibernate.selectAllFromTable();
    }

    @Test
    public void selectInsterestTest(){
        useHibernate.selectInsterest(0, false);
        useHibernate.selectInsterest(0, true);
    }

    @Test
    public void selectWorkTest(){
        useHibernate.selectWork(1, false);
        useHibernate.selectWork(1, true);
    }

    @Test
    public void selectSocialNetworkTest(){
        useHibernate.selectSocialNetwork(2, false);
        useHibernate.selectSocialNetwork(2, true);
    }

    @Test
    public void selectUserCredentialsTest(){
        useHibernate.selectUserCredentials(0, false);
        useHibernate.selectUserCredentials(0, true);
    }
}

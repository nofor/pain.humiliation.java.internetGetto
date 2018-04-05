package pain.humiliation.java.internetGetto.PetroKozak.task16;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl.IUserImpl;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.*;

import java.util.ArrayList;
import java.util.HashSet;

public class Task16Test {

    ArrayList<Work> work =new ArrayList<>();
    HashSet<Interests>interests = new HashSet<>();
    HashSet<SocialNetwork>socialNetworks= new HashSet<>();
    UserCredentials userCredentials = new UserCredentials("Pedro",new UserPassword("ecrypted","decrypted"));
    IUserImpl implementation = new IUserImpl();

    @Test
    public void testInsert(){
        work.add(new Work("SoftServe","Director",25000));
        interests.add(new Interests("Football", "Two years"));
        socialNetworks.add(new SocialNetwork("Facebook",2));
        implementation.insert(new User("Petro","Kozak",23,work,interests,socialNetworks,userCredentials));
    }
    @Test
    public void testSelect(){
        implementation.select();
    }

    @Test
    public void testSelectWorks(){
        implementation.selectWorks();
    }
    @Test
    public void testSelectInterests(){
        implementation.selectInterests();
    }
    @Test
    public void testSocialNetworks(){
        implementation.selectSocialNetworks();
    }
    @Test
    public void testUsersCredentials(){
        implementation.selectUsersCredentials();
    }
    @Test
    public void testUsersPasswords(){
        implementation.selectUsersPassword();
    }
    @Test
    public void delete(){
        implementation.delete(1);
    }
}

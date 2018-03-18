package pain.humiliation.java.internetGetto.PetroKozak.task14.serviceImpl;

import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;
import pain.humiliation.java.internetGetto.PetroKozak.task14.modelOfTable.Model;
import pain.humiliation.java.internetGetto.PetroKozak.task14.service.ModelService;
import pain.humiliation.java.internetGetto.PetroKozak.task14.utils.HibernateUtils;

import java.util.List;

public class ModelServiceImpl extends HibernateUtils implements ModelService {

    @Override
    public void insert(Model model) {
        getSession().save(model);
        getSession().getTransaction().commit();
    }

    @Override
    public void delete(int id) {
        getSession().delete(getSession().find(Model.class,id));
        getSession().getTransaction().commit();
    }

    @Override
    public void select() {
        getSession().beginTransaction();
        List<UserModel> userList = getSession().createQuery("FROM Model").list();

        for (UserModel user : userList) {
            System.out.println(user);
        }
    }
}

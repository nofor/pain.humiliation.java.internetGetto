package pain.humiliation.java.internetGetto.PetroKozak.task14.serviceImpl;

import pain.humiliation.java.internetGetto.PetroKozak.task14.modelOfTable.Model;
import pain.humiliation.java.internetGetto.PetroKozak.task14.service.ModelService;
import pain.humiliation.java.internetGetto.PetroKozak.task14.utils.HibernateUtils;

import java.util.List;

public class ModelServiceImpl extends HibernateUtils implements ModelService {

    @Override
    public void insert(Model model) {
        getSession().save(model);
        getSession().beginTransaction().commit();
    }

    @Override
    public void delete(long id) {
        getSession().delete(getSession().find(Model.class,id));
        getSession().getTransaction().commit();
    }

    @Override
    public void select() {
        getSession().beginTransaction();  //todo remove transaction
        List<Model> modelList = getSession().createQuery("FROM Model").list();

        for (Model model : modelList) {
            System.out.println(model);
        }
    }
}

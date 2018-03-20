package pain.humiliation.java.internetGetto.PetroKozak.task14.dao.imp;

import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;
import pain.humiliation.java.internetGetto.PetroKozak.task14.dao.ModelService;
import pain.humiliation.java.internetGetto.PetroKozak.task14.configuration.HibernateConfiguration;

import java.util.List;

public class ModelServiceImpl extends HibernateConfiguration implements ModelService {

    @Override
    public void insert(Model model) {
        getSession().save(model);
        getSession().beginTransaction().commit();
    }

    @Override
    public void delete(long id) {
        getSession().delete(getSession().find(Model.class,id));
        getSession().beginTransaction().commit();
    }

    @Override
    public void select() {
        List<Model> modelList = getSession().createQuery("FROM Model").list();

        for (Model model : modelList) {
            System.out.println(model);
        }
    }
}

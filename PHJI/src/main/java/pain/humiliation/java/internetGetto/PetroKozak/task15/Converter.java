package pain.humiliation.java.internetGetto.PetroKozak.task15;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import pain.humiliation.java.internetGetto.PetroKozak.task14.dao.imp.ModelServiceImpl;
import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Converter extends ModelServiceImpl{
    private ObjectMapper mapper = new ObjectMapper();
    private ArrayList<Model> modelList;
    private Map<String, Object> map;

    public ArrayList<Model> convertToObjeect()  {

        String json = "{  \n" +
                "   \"users\":[  \n" +
                "      {  \n" +
                "         \"name\":\"Calllka\",\n" +
                "         \"surname\":\"Novicov\",\n" +
                "         \"age\":25\n" +
                "      },\n" +
                "      {  \n" +
                "         \"name\":\"Petya\",\n" +
                "         \"surname\":\"Kozak\",\n" +
                "         \"age\":22\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        try {
            map = mapper.readValue(json, new TypeReference<Map<String, ArrayList<Model>>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelList = (ArrayList<Model>) map.get("users");
        return modelList;
    }
}

package pain.humiliation.java.internetGetto.PetroKozak.task15;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;
import org.json.XML;
import pain.humiliation.java.internetGetto.PetroKozak.task14.dao.imp.ModelServiceImpl;
import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task15 extends ModelServiceImpl {
    private ObjectMapper mapper = new ObjectMapper();
    private ArrayList<Model> modelList;
    private String json;

    public Task15(String json) {
        this.json = json;
    }

    public ArrayList<Model> convertJsonToObject() {
        try {
            Map<String, ArrayList<Model>> map = mapper.readValue(json, new TypeReference<Map<String, ArrayList<Model>>>() {
            });
            modelList = map.get("users");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return modelList;
    }

    public void convertMapToJson() {
        Map<String, ArrayList<Model>> tempMap = new HashMap<>();

        tempMap.put("users", (ArrayList<Model>) getSession().createQuery("FROM Model").list());

        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tempMap));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertToDB() {
        for (Model model : convertJsonToObject()) {
            insert(model);
        }
    }

    public String convertJsonToXml() {
        JSONObject jsonObject = new JSONObject(json);
        String xml = XML.toString(jsonObject);

        return xml;
    }

    public String convertXMLToJson(String xml) {
        String resultJson = XML.toJSONObject(xml).toString();

        return resultJson;
    }
}

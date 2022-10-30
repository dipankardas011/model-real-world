package realWorldAPI.objects.living.mammals.humans;

import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class Human extends realWorldAPI.objects.living.mammals.Mammal {

    public String name;
    private Brain mind;
    private Heart heart;

    public Human(int age, String name) {
        System.out.println("[INIT] HUMAN");
        mind = new Brain();
        heart = new Heart();
        this.objectID = UUID.randomUUID();
        this.age = age;
        this.lifespan = 60;
        this.name = name;
    }

    public JSONObject getInfo() {
        // creating JSONObject
        JSONObject jo = new JSONObject();

        // putting data to JSONObject
        jo.put("uuid", this.objectID.toString());
        jo.put("name", this.name);
        jo.put("age", this.age);
        jo.put("lifespan", this.lifespan);


        JSONObject minJo = new JSONObject();
        minJo.put("state", this.mind.getState());
        minJo.put("message", "Hello");
        jo.put("Mind", minJo);

        JSONObject hearJo = new JSONObject();
        hearJo.put("state", this.heart.getState());
        hearJo.put("message", "Hello!");
        jo.put("Heart", hearJo);


        // for phone numbers, first create JSONArray
        // JSONArray ja = new JSONArray();
        // LinkedHashMap m = new LinkedHashMap(2);
        // m.put("type", "home");
        // m.put("number", "212 555-1234");
        // adding map to list
        // ja.add(m);
        // putting phoneNumbers to JSONObject
        // jo.put("phoneNumbers", ja);
        return jo;
    }
}

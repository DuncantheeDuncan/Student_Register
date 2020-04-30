package temp.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {

    //TODO make sure all data will be added to the map and to the list
    public static Map<String, String> studentRecord = new HashMap<>();

    private List<Map<String, String>> recordsList = new ArrayList<>();


    public List<Map<String, String>> getRecordsList() {
        recordsList.add(studentRecord);
        return recordsList;
    }
}

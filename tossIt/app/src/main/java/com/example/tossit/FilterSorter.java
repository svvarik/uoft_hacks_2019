import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.cloud.language.v1.Document;
import java.util.ArrayList;

public class FilterSorter {


    ArrayList<String> jsonparser(String response) {
        ArrayList<String> res = new ArrayList<>();
        try {
            JSONArray mArray = new JSONArray(response);
            for (int i = 0; i < mArray.length(); i++) {
                JSONObject mJsonObject = mArray.getJSONObject(i);
                res.add(mJsonObject.getString("name"));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }

    ArrayList<String> nounFilter(ArrayList<String> contentList){

        return contentList;
    }

    ArrayList<String> garbageSorter(ArrayList<String> filteredGarbage){

        return filteredGarbage;
    }
}
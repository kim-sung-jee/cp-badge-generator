package cp.badge.service.boj;

import cp.badge.client.BojClient;
import cp.badge.flatform.Boj;
import cp.badge.flatform.FlatForm;
import cp.badge.service.FlatFormGenerator;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BojGenerator implements FlatFormGenerator {
    private final BojClient bojClient;
    @Override
    public FlatForm getFlatFormFromHandle(String handle) {
        String rating = parsing(bojClient.getRating(handle));
        return Boj.of(handle,rating);
    }
    private String parsing(String ret){
        JSONObject jsonObject = new JSONObject(ret);
        return Integer.toString(jsonObject.getInt("rating"));
    }
}

package cp.badge.service.codeforces;

import cp.badge.client.CodeForcesClient;
import cp.badge.flatform.CodeForces;
import cp.badge.service.FlatFormGenerator;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeForcesGenerator implements FlatFormGenerator {
    private final CodeForcesClient codeForcesClient;
    public CodeForces getFlatFormFromHandle(String handle){
        String rating  = parsing(codeForcesClient.getRating(handle));
        return CodeForces.of(handle,rating);
    }
    private String parsing(String html){
        Document doc = Jsoup.parse(html);
        Elements span = doc.getElementsByTag("span");
        String rating = span.get(span.size()-8).text();
        return rating;
    }
}

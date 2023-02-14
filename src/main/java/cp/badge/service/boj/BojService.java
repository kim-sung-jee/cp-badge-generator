package cp.badge.service.boj;

import cp.badge.client.ShieldsClient;
import cp.badge.flatform.FlatForm;
import cp.badge.service.CpService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BojService extends CpService {
    private final BojGenerator bojGenerator;
    public BojService(BojGenerator bojGenerator,ShieldsClient shieldsClient){
        super(shieldsClient);
        this.bojGenerator = bojGenerator;
    }
    public Optional<byte[]> getUserInfo(String handle) {
        FlatForm boj = bojGenerator.getFlatFormFromHandle(handle);
        String url = buildUrl(boj);
        return Optional.of(shieldsClient.getBadge(url));
    }
}

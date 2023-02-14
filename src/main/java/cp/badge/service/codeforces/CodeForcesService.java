package cp.badge.service.codeforces;

import cp.badge.flatform.FlatForm;
import cp.badge.client.ShieldsClient;
import cp.badge.service.CpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CodeForcesService extends CpService {
    private final CodeForcesGenerator codeForcesGenerator;

    public CodeForcesService(CodeForcesGenerator codeForcesGenerator,ShieldsClient shieldsClient){
        super(shieldsClient);
        this.codeForcesGenerator = codeForcesGenerator;
    }
    public Optional<byte[]> getUserInfo(String handle) {
        FlatForm codeForces = codeForcesGenerator.getFlatFormFromHandle(handle);
        String url = buildUrl(codeForces);
        return Optional.of(shieldsClient.getBadge(url));
    }
}

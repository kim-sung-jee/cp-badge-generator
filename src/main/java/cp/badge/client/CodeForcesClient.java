package cp.badge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "codeforces",url = "https://codeforces.com")
public interface CodeForcesClient {
    @GetMapping(value = "/profile/{handle}")
    String getRating(@PathVariable String handle);
}

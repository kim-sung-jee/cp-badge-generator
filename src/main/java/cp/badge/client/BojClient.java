package cp.badge.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "solved.ac",url = "https://solved.ac/api/v3")
public interface BojClient {
    @GetMapping(value = "/user/show")
    String getRating(@RequestParam String handle);
}

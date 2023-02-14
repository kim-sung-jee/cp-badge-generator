package cp.badge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "shield",url = "https://img.shields.io/badge")
public interface ShieldsClient {
    @GetMapping(value = "/{url}")
    byte[] getBadge(@PathVariable String url);
}

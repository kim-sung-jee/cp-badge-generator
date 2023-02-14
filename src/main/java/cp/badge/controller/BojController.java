package cp.badge.controller;

import cp.badge.service.boj.BojService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BojController {
    private final BojService bojService;
    public BojController(BojService bojService){ this.bojService = bojService;}
    @GetMapping(value = "/boj/{handle}",produces = "image/svg+xml")
    public byte[] getMaxRating(@PathVariable String handle) {
        return bojService.getUserInfo(handle).get();
    }
}

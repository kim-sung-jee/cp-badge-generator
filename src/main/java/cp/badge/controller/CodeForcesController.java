package cp.badge.controller;

import cp.badge.service.codeforces.CodeForcesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeForcesController implements CpController{
    private final CodeForcesService codeForcesService;
    public CodeForcesController(CodeForcesService codeForcesService){
        this.codeForcesService = codeForcesService;
    }

    @GetMapping(value = "/codeforces/{handle}",produces = "image/svg+xml")
    public byte[] getMaxRating(@PathVariable String handle) {
        return codeForcesService.getUserInfo(handle).get();
    }
}

package com.AD.loveB;

import com.AD.loveB.dto.saver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class loveController {

    @Autowired
    private loveRepo repo;

    @Autowired
    private serviceLove service; // Inject your service

    @PostMapping("/info")
    public String info(@RequestBody saver dto) {
        int loveScore = service.calculateLoveScore(dto.getName1(), dto.getName2());

        Fields data = new Fields();
        data.setName1(dto.getName1());
        data.setName2(dto.getName2());
        data.setScore(loveScore);

        repo.save(data);

        return "The love between " + dto.getName1() + " and " + dto.getName2() + " is " + loveScore + "% 💘";
    }
}

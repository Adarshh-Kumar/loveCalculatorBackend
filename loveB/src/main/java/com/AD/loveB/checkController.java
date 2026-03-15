package com.AD.loveB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkController {

    @GetMapping("/check")
    public String check() {
        return "<h3>Server is running ✅</h3>";
    }

    @GetMapping("/load")
    public String load() {
        return """
                Khan\tPra[knjj\t92\tA perfect match made in code and chaos 💞
                Rahul\tSneha\t68\tThere’s potential — a few more dates and fewer arguments 😅
                Rohan\tPriya\t43\tLove needs some debugging 💔
                Aditi\tKaran\t77\tSparks are flying, but keep communicating 🔥
                Meera\tArjun\t54\tCould go either way — keep testing your chemistry 💫
                Neha\tRohit\t88\tLove almost at full charge ⚡
                Simran\tRaj\t95\tBollywood-level romance detected 🎬💖
                Ananya\tDev\t35\tFriend-zoned but friendly 😬
                """;
    }
}

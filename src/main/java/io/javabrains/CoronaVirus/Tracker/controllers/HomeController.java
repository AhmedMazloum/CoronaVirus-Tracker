package io.javabrains.CoronaVirus.Tracker.controllers;

import io.javabrains.CoronaVirus.Tracker.models.LocationStats;
import io.javabrains.CoronaVirus.Tracker.services.CoronaVirusData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusData coronaVirusData;

    @GetMapping("/")
  public String home(Model model){
        List<LocationStats> stats = coronaVirusData.getStats();
        int totalCases = stats.stream().mapToInt(stat -> stat.getLatestDate()).sum();
        int totalNewCases = stats.stream().mapToInt(stat -> stat.getPrevDay()).sum();
        model.addAttribute("locationStats", stats);
        model.addAttribute("totalCases", totalCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
  }
}

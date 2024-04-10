package com.Spring.controller;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.AOCExerciseMissing;
import com.AdventOfCode.Year_2015.Day_01.Not_Quite_Lisp;
import com.AdventOfCode.Year_2015.Day_02.I_Was_Told_There_Would_Be_No_Math;
import com.AdventOfCode.Year_2015.Day_03.Perfectly_Spherical_Houses_in_a_Vacuum;
import com.AdventOfCode.Year_2015.Day_04.The_Ideal_Stocking_Stuffer;
import com.AdventOfCode.Year_2015.Day_05.Doesnt_He_Have_Intern_Elves_For_This;
import com.AdventOfCode.Year_2015.Day_06.Probably_a_Fire_Hazard;
import com.AdventOfCode.Year_2015.Day_08.Matchsticks;
import com.AdventOfCode.Year_2016.Day_01.No_Time_for_a_Taxicab;
import com.AdventOfCode.Year_2016.Day_02.Bathroom_Security;
import com.AdventOfCode.Year_2016.Day_03.Squares_With_Three_Sides;
import com.AdventOfCode.Year_2016.Day_04.Security_Through_Obscurity;
import com.AdventOfCode.Year_2016.Day_05.How_About_a_Nice_Game_of_Chess;
import com.AdventOfCode.Year_2016.Day_06.Signals_and_Noise;
import com.AdventOfCode.Year_2017.Day_01.Inverse_Captcha;
import com.AdventOfCode.Year_2017.Day_02.Corruption_Checksum;
import com.AdventOfCode.Year_2022.Day_01.Calorie_Counting;
import com.AdventOfCode.Year_2022.Day_02.Rock_Paper_Scissors;
import com.AdventOfCode.Year_2022.Day_03.Rucksack_Reorganization;
import com.AdventOfCode.Year_2022.Day_04.Camp_Cleanup;
import com.Spring.controller.responsePojos.AnswerPojo;
import com.Spring.model.entities.AOCEntity;
import com.Spring.services.AOCService;
import com.Spring.services.FileReadingService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RequestMapping("/api/aoc/")
@org.springframework.web.bind.annotation.RestController
public class AOCController {

    private final AOCService aocService;
    public AOCController(AOCService service) {
        this.aocService = service; //TODO: Research is this autowiring?
    }

    private final HashMap<String, AOCExercise> AOCLogicMap = new HashMap<String, AOCExercise>() {{
        //2015
        put("20151", new Not_Quite_Lisp());
        put("20152", new I_Was_Told_There_Would_Be_No_Math());
        put("20153", new Perfectly_Spherical_Houses_in_a_Vacuum());
        put("20154", new The_Ideal_Stocking_Stuffer());
        put("20155", new Doesnt_He_Have_Intern_Elves_For_This());
        put("20156", new Probably_a_Fire_Hazard());
        put("20157", new AOCExerciseMissing());
        put("20158", new Matchsticks()); //TODO
        put("20159", new AOCExerciseMissing());
        put("201510", new AOCExerciseMissing());
        put("201511", new AOCExerciseMissing());
        put("201512", new AOCExerciseMissing());
        put("201513", new AOCExerciseMissing());
        put("201514", new AOCExerciseMissing());
        put("201515", new AOCExerciseMissing());
        put("201516", new AOCExerciseMissing());
        put("201517", new AOCExerciseMissing());
        put("201518", new AOCExerciseMissing());
        put("201519", new AOCExerciseMissing());
        put("201520", new AOCExerciseMissing());
        put("201521", new AOCExerciseMissing());
        put("201522", new AOCExerciseMissing());
        put("201523", new AOCExerciseMissing());
        put("201524", new AOCExerciseMissing());
        put("201525", new AOCExerciseMissing());
        //2016
        put("20161", new No_Time_for_a_Taxicab());
        put("20162", new Bathroom_Security());
        put("20163", new Squares_With_Three_Sides());
        put("20164", new Security_Through_Obscurity());
        put("20165", new How_About_a_Nice_Game_of_Chess());
        put("20166", new Signals_and_Noise());
        put("20167", new AOCExerciseMissing()); //TODO
        put("20168", new AOCExerciseMissing());
        put("20169", new AOCExerciseMissing());
        put("201610", new AOCExerciseMissing());
        put("201611", new AOCExerciseMissing());
        put("201612", new AOCExerciseMissing());
        put("201613", new AOCExerciseMissing());
        put("201614", new AOCExerciseMissing());
        put("201615", new AOCExerciseMissing());
        put("201616", new AOCExerciseMissing());
        put("201617", new AOCExerciseMissing());
        put("201618", new AOCExerciseMissing());
        put("201619", new AOCExerciseMissing());
        put("201620", new AOCExerciseMissing());
        put("201621", new AOCExerciseMissing());
        put("201622", new AOCExerciseMissing());
        put("201623", new AOCExerciseMissing());
        put("201624", new AOCExerciseMissing());
        put("201625", new AOCExerciseMissing());
        //2017
        put("20171", new Inverse_Captcha());
        put("20172", new Corruption_Checksum());
        put("20173", new AOCExerciseMissing()); //TODO
        put("20174", new AOCExerciseMissing());
        put("20175", new AOCExerciseMissing());
        put("20176", new AOCExerciseMissing());
        put("20177", new AOCExerciseMissing());
        put("20178", new AOCExerciseMissing());
        put("20179", new AOCExerciseMissing());
        put("201710", new AOCExerciseMissing());
        put("201711", new AOCExerciseMissing());
        put("201712", new AOCExerciseMissing());
        put("201713", new AOCExerciseMissing());
        put("201714", new AOCExerciseMissing());
        put("201715", new AOCExerciseMissing());
        put("201716", new AOCExerciseMissing());
        put("201717", new AOCExerciseMissing());
        put("201718", new AOCExerciseMissing());
        put("201719", new AOCExerciseMissing());
        put("201720", new AOCExerciseMissing());
        put("201721", new AOCExerciseMissing());
        put("201722", new AOCExerciseMissing());
        put("201723", new AOCExerciseMissing());
        put("201724", new AOCExerciseMissing());
        put("201725", new AOCExerciseMissing());
        //2018
        put("20181", new AOCExerciseMissing()); //TODO
        put("20182", new AOCExerciseMissing());
        put("20183", new AOCExerciseMissing());
        put("20184", new AOCExerciseMissing());
        put("20185", new AOCExerciseMissing());
        put("20186", new AOCExerciseMissing());
        put("20187", new AOCExerciseMissing());
        put("20188", new AOCExerciseMissing());
        put("20189", new AOCExerciseMissing());
        put("201810", new AOCExerciseMissing());
        put("201811", new AOCExerciseMissing());
        put("201812", new AOCExerciseMissing());
        put("201813", new AOCExerciseMissing());
        put("201814", new AOCExerciseMissing());
        put("201815", new AOCExerciseMissing());
        put("201816", new AOCExerciseMissing());
        put("201817", new AOCExerciseMissing());
        put("201818", new AOCExerciseMissing());
        put("201819", new AOCExerciseMissing());
        put("201820", new AOCExerciseMissing());
        put("201821", new AOCExerciseMissing());
        put("201822", new AOCExerciseMissing());
        put("201823", new AOCExerciseMissing());
        put("201824", new AOCExerciseMissing());
        put("201825", new AOCExerciseMissing());
        //2019
        put("20191", new AOCExerciseMissing()); //TODO
        put("20192", new AOCExerciseMissing());
        put("20193", new AOCExerciseMissing());
        put("20194", new AOCExerciseMissing());
        put("20195", new AOCExerciseMissing());
        put("20196", new AOCExerciseMissing());
        put("20197", new AOCExerciseMissing());
        put("20198", new AOCExerciseMissing());
        put("20199", new AOCExerciseMissing());
        put("201910", new AOCExerciseMissing());
        put("201911", new AOCExerciseMissing());
        put("201912", new AOCExerciseMissing());
        put("201913", new AOCExerciseMissing());
        put("201914", new AOCExerciseMissing());
        put("201915", new AOCExerciseMissing());
        put("201916", new AOCExerciseMissing());
        put("201917", new AOCExerciseMissing());
        put("201918", new AOCExerciseMissing());
        put("201919", new AOCExerciseMissing());
        put("201920", new AOCExerciseMissing());
        put("201921", new AOCExerciseMissing());
        put("201922", new AOCExerciseMissing());
        put("201923", new AOCExerciseMissing());
        put("201924", new AOCExerciseMissing());
        put("201925", new AOCExerciseMissing());
        //2020
        put("20201", new AOCExerciseMissing()); //TODO
        put("20202", new AOCExerciseMissing());
        put("20203", new AOCExerciseMissing());
        put("20204", new AOCExerciseMissing());
        put("20205", new AOCExerciseMissing());
        put("20206", new AOCExerciseMissing());
        put("20207", new AOCExerciseMissing());
        put("20208", new AOCExerciseMissing());
        put("20209", new AOCExerciseMissing());
        put("202010", new AOCExerciseMissing());
        put("202011", new AOCExerciseMissing());
        put("202012", new AOCExerciseMissing());
        put("202013", new AOCExerciseMissing());
        put("202014", new AOCExerciseMissing());
        put("202015", new AOCExerciseMissing());
        put("202016", new AOCExerciseMissing());
        put("202017", new AOCExerciseMissing());
        put("202018", new AOCExerciseMissing());
        put("202019", new AOCExerciseMissing());
        put("202020", new AOCExerciseMissing());
        put("202021", new AOCExerciseMissing());
        put("202022", new AOCExerciseMissing());
        put("202023", new AOCExerciseMissing());
        put("202024", new AOCExerciseMissing());
        put("202025", new AOCExerciseMissing());
        //2021
        put("20211", new AOCExerciseMissing()); //TODO
        put("20212", new AOCExerciseMissing());
        put("20213", new AOCExerciseMissing());
        put("20214", new AOCExerciseMissing());
        put("20215", new AOCExerciseMissing());
        put("20216", new AOCExerciseMissing());
        put("20217", new AOCExerciseMissing());
        put("20218", new AOCExerciseMissing());
        put("20219", new AOCExerciseMissing());
        put("202110", new AOCExerciseMissing());
        put("202111", new AOCExerciseMissing());
        put("202112", new AOCExerciseMissing());
        put("202113", new AOCExerciseMissing());
        put("202114", new AOCExerciseMissing());
        put("202115", new AOCExerciseMissing());
        put("202116", new AOCExerciseMissing());
        put("202117", new AOCExerciseMissing());
        put("202118", new AOCExerciseMissing());
        put("202119", new AOCExerciseMissing());
        put("202120", new AOCExerciseMissing());
        put("202121", new AOCExerciseMissing());
        put("202122", new AOCExerciseMissing());
        put("202123", new AOCExerciseMissing());
        put("202124", new AOCExerciseMissing());
        put("202125", new AOCExerciseMissing());
        //2022
        put("20221", new Calorie_Counting());
        put("20222", new Rock_Paper_Scissors());
        put("20223", new Rucksack_Reorganization());
        put("20224", new Camp_Cleanup());
        put("20225", new AOCExerciseMissing()); //TODO
        put("20226", new AOCExerciseMissing());
        put("20227", new AOCExerciseMissing());
        put("20228", new AOCExerciseMissing());
        put("20229", new AOCExerciseMissing());
        put("202210", new AOCExerciseMissing());
        put("202211", new AOCExerciseMissing());
        put("202212", new AOCExerciseMissing());
        put("202213", new AOCExerciseMissing());
        put("202214", new AOCExerciseMissing());
        put("202215", new AOCExerciseMissing());
        put("202216", new AOCExerciseMissing());
        put("202217", new AOCExerciseMissing());
        put("202218", new AOCExerciseMissing());
        put("202219", new AOCExerciseMissing());
        put("202220", new AOCExerciseMissing());
        put("202221", new AOCExerciseMissing());
        put("202222", new AOCExerciseMissing());
        put("202223", new AOCExerciseMissing());
        put("202224", new AOCExerciseMissing());
        put("202225", new AOCExerciseMissing());
        //2023
        put("20231", new AOCExerciseMissing()); //TODO
        put("20232", new AOCExerciseMissing());
        put("20233", new AOCExerciseMissing());
        put("20234", new AOCExerciseMissing());
        put("20235", new AOCExerciseMissing());
        put("20236", new AOCExerciseMissing());
        put("20237", new AOCExerciseMissing());
        put("20238", new AOCExerciseMissing());
        put("20239", new AOCExerciseMissing());
        put("202310", new AOCExerciseMissing());
        put("202311", new AOCExerciseMissing());
        put("202312", new AOCExerciseMissing());
        put("202313", new AOCExerciseMissing());
        put("202314", new AOCExerciseMissing());
        put("202315", new AOCExerciseMissing());
        put("202316", new AOCExerciseMissing());
        put("202317", new AOCExerciseMissing());
        put("202318", new AOCExerciseMissing());
        put("202319", new AOCExerciseMissing());
        put("202320", new AOCExerciseMissing());
        put("202321", new AOCExerciseMissing());
        put("202322", new AOCExerciseMissing());
        put("202323", new AOCExerciseMissing());
        put("202324", new AOCExerciseMissing());
        put("202325", new AOCExerciseMissing());
    }};

    @GetMapping("/{year}/{day}")
    public AnswerPojo getAOCAnswers
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        String key = "" + year + day;
        RequestServiceObject rso = requestLogicMap(key);
        if (!rso.worked) {
            return new AnswerPojo();
        }
        AOCExercise req = AOCLogicMap.get(key);
        req.setInput(aocService.getExercise(year, day).getInput());
        return new AnswerPojo(req.answer1(), req.answer2());
    }

    @GetMapping("/getCode/{year}/{day}")
    public String getCode
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        String key = "" + year + day;
        RequestServiceObject rso = requestLogicMap(key);
        if (!rso.worked) {
            return rso.message;
        }
        AOCExercise req = AOCLogicMap.get(key);
        String name = req.getClass().getSimpleName() + ".java";

        String dayS = "" + day;
        if (day < 10 ) dayS = "0" + day;
        String path = "AdventOfCode/Year_" + year + "/Day_" + dayS + "/" + name;

        return new FileReadingService().readFileContent(path);
    }

    @GetMapping("/getInput/{year}/{day}")
    public AOCEntity getInput
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day)
    {
        AOCEntity e = aocService.getExercise(year, day);
        if (e == null) {
            e = new AOCEntity(year, day);
            aocService.saveEntity(e);
        }

        return e;
    }

    @PostMapping("/setInput/{year}/{day}")
    public void setInput
            (@PathVariable(name = "year") int year,
             @PathVariable(name = "day") int day,
             @RequestBody String input)
    {
        //TODO: how to get very long strings?
        AOCEntity e = new AOCEntity(year, day);
        e.setInput(input);
        aocService.saveEntity(e);
    }


    private RequestServiceObject requestLogicMap(String key) {
        RequestServiceObject rso = new RequestServiceObject();
        if (!AOCLogicMap.containsKey(key)) {
            rso.message = "this exercise does not exist";
            rso.worked = false;
        }
        else if (AOCLogicMap.get(key) instanceof AOCExerciseMissing) {
            rso.message = "this exercise has not been done yet";
            rso.worked = false;
        }
        return rso;
    }

    private class RequestServiceObject
    {
        public String message = "worked";
        public boolean worked = true;
    }
}

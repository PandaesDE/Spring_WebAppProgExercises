package com.Spring.services;

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
import com.Spring.model.entities.AOCEntity;
import com.Spring.model.entities.AOCKey;
import com.Spring.model.repositories.AOCRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class AOCService {

    private final AOCRepository repository;

    public AOCService(AOCRepository rep) {
        this.repository = rep;
    }

    public List<AOCEntity> getAllExercises() {
        return repository.findAll();
    }

    public AOCEntity getExercise(int year, int day) {
        return repository.findByYearAndDay(year, day);
    }

    public AOCEntity saveEntity(AOCEntity e) {
        return repository.save(e);
    }

    public List<AOCEntity> saveEntities(List<AOCEntity> e) {
        return repository.saveAll(e);
    }


}

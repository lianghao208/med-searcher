package com.med.controller;

import com.med.mapper.MedTableMapper;
import com.med.model.MedTable;
import com.med.service.MedTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Roy on 2017/11/15.
 */
@RestController
@RequestMapping("/search")
public class MedSearchController {

    @Autowired
    private MedTableService medTableService;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/getResult/{cold_hot}/{sweat}/{pain}/{appetite}/{pee}/{defecate}/{appearance}/{lady}/{thirsty}/{energy}/{sleep}/{pulse}/{others}")
    public List<MedTable> getResult(
            @PathVariable("cold_hot") String cold_hot,
            @PathVariable("sweat") String sweat,
            @PathVariable("pain") String pain,
            @PathVariable("appetite") String appetite,
            @PathVariable("pee") String pee,
            @PathVariable("defecate") String defecate,
            @PathVariable("appearance") String appearance,
            @PathVariable("lady") String lady,
            @PathVariable("thirsty") String thirsty,
            @PathVariable("energy") String energy,
            @PathVariable("sleep") String sleep,
            @PathVariable("pulse") String pulse,
            @PathVariable("others") String others){
        //TODO 可优化成语法检查器
        cold_hot = cold_hot.replace(",","，");
        sweat = sweat.replace(",","，");
        pain = pain.replace(",","，");
        appetite = appetite.replace(",","，");
        pee = pee.replace(",","，");
        defecate = defecate.replace(",","，");
        appearance = appearance.replace(",","，");
        lady = lady.replace(",","，");
        thirsty = thirsty.replace(",","，");
        energy = energy.replace(",","，");
        sleep = sleep.replace(",","，");
        pulse = pulse.replace(",","，");
        others = others.replace(",","，");
        List<MedTable> medTables = medTableService.getTable(cold_hot, sweat, pain, appetite, pee, defecate,appearance, lady, thirsty, energy, sleep, pulse, others);
        return medTables;
    }

    @PostMapping("/addMed")
    public void addMed(
            @RequestParam("cold_hot") String cold_hot,
            @RequestParam("sweat") String sweat,
            @RequestParam("pain") String pain,
            @RequestParam("appetite") String appetite,
            @RequestParam("pee") String pee,
            @RequestParam("defecate") String defecate,
            @RequestParam("appearance") String appearance,
            @RequestParam("lady") String lady,
            @RequestParam("thirsty") String thirsty,
            @RequestParam("energy") String energy,
            @RequestParam("sleep") String sleep,
            @RequestParam("pulse") String pulse,
            @RequestParam("others") String others,
            @RequestParam("med_name") String med_name,
            @RequestParam("ingredients") String ingredients,
            @RequestParam("result") String result
            ){

        System.out.println("热寒：" + cold_hot);
        medTableService.addMed(cold_hot,
                sweat,
                pain,
                appetite,
                pee,
                defecate,
                appearance,
                lady,
                thirsty,
                energy,
                sleep,
                pulse,
                others,
                med_name,
                ingredients,
                result);

    }

    @PostMapping("/deleteMed")
    public void deleteMed(
            @RequestParam("id") Integer id){

        medTableService.deleteMed(id);
    }
}

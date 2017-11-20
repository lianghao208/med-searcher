package com.med.controller;

import com.med.mapper.MedTableMapper;
import com.med.model.MedTable;
import com.med.service.MedTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Roy on 2017/11/15.
 */
@RestController
@RequestMapping("/search")
public class MedSearchController {

    @Autowired
    private MedTableService medTableService;

    private Set<String> coldHotSelectSet = new HashSet<>();
    private Set<String> sweatSelectSet = new HashSet<>();
    private Set<String> painSelectSet = new HashSet<>();
    private Set<String> appetiteSelectSet = new HashSet<>();
    private String[] coldHotSets;
    private String[] sweatSets;
    private String[] painSets;
    private String[] appetiteSets;
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/getSelect")
    public Map<String,Set<String>> getSelect(){
        Map<String,Set<String>> result = new HashMap<>();
        List<MedTable> medTables = medTableService.getTable("", "", "", "", "", "","", "", "", "", "", "", "");
        for (MedTable med : medTables){
            coldHotSets = med.getColdHot().split("，");
            sweatSets = med.getSweat().split("，");
            painSets = med.getPain().split("，");
            appetiteSets = med.getAppetite().split("，");
            for (int i=0;i<coldHotSets.length;i++){
                coldHotSelectSet.add(coldHotSets[i]);
            }
            for (int i=0;i<sweatSets.length;i++){
                sweatSelectSet.add(sweatSets[i]);
            }
            for (int i=0;i<painSets.length;i++){
                painSelectSet.add(painSets[i]);
            }
            for (int i=0;i<appetiteSets.length;i++){
                appetiteSelectSet.add(appetiteSets[i]);
            }
        }
        result.put("cold_hot",coldHotSelectSet);
        result.put("sweat",sweatSelectSet);
        result.put("pain",painSelectSet);
        result.put("appetite",appetiteSelectSet);
        return result;

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
        cold_hot = cold_hot.replace(" ","");
        sweat = sweat.replace(" ","");
        pain = pain.replace(" ","");
        appetite = appetite.replace(" ","");
        pee = pee.replace(" ","");
        defecate = defecate.replace(" ","");
        appearance = appearance.replace(" ","");
        lady = lady.replace(" ","");
        thirsty = thirsty.replace(" ","");
        energy = energy.replace(" ","");
        sleep = sleep.replace(" ","");
        pulse = pulse.replace(" ","");
        others = others.replace(" ","");

        String[] cold_hot_strings = cold_hot.split(",");
        String[] sweat_strings = sweat.split(",");
        String[] pain_strings = pain.split(",");
        String[] appetite_strings = appetite.split(",");
        String[] pee_strings = pee.split(",");
        String[] defecate_strings = defecate.split(",");
        String[] appearance_strings = appearance.split(",");
        String[] lady_strings = lady.split(",");
        String[] thirsty_strings = thirsty.split(",");
        String[] energy_strings = energy.split(",");
        String[] sleep_strings = sleep.split(",");
        String[] pulse_strings = pulse.split(",");
        String[] others_strings = others.split(",");
        List<MedTable> medTables = medTableService.getTableLike(cold_hot_strings,
                sweat_strings,
                pain_strings,
                appetite_strings,
                pee_strings,
                defecate_strings,
                appearance_strings,
                lady_strings,
                thirsty_strings,
                energy_strings,
                sleep_strings,
                pulse_strings,
                others_strings);
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

package com.med.service.impl;

import com.med.mapper.MedTableMapper;
import com.med.model.MedTable;
import com.med.service.MedTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/15.
 */
@Service(value = "medTableService")
public class MedTableServiceImpl implements MedTableService {

    @Autowired
    private MedTableMapper medTableMapper;

    @Override
    public List<MedTable> getTableByPain(String pain) {
        return medTableMapper.selectByPain(pain);
    }

    @Override
    public List<MedTable> getTable(String cold_hot,
                                   String sweat,
                                   String pain,
                                   String appetite,
                                   String pee,
                                   String defecate,
                                   String appearance,
                                   String lady,
                                   String thirsty,
                                   String energy,
                                   String sleep,
                                   String pulse,
                                   String others) {
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
        return medTableMapper.selectTable(cold_hot, sweat, pain, appetite, pee, defecate,appearance, lady, thirsty, energy, sleep, pulse, others);
    }

    @Override
    public List<MedTable> getTableLike(String[] cold_hot, String[] sweat, String[] pain, String[] appetite, String[] pee, String[] defecate, String[] appearance, String[] lady, String[] thirsty, String[] energy, String[] sleep, String[] pulse, String[] others) {
        return medTableMapper.selectTableLike(cold_hot, sweat, pain, appetite, pee, defecate,appearance, lady, thirsty, energy, sleep, pulse, others);
    }

    @Override
    public Boolean addMed(String cold_hot,
                          String sweat,
                          String pain,
                          String appetite,
                          String pee,
                          String defecate,
                          String appearance,
                          String lady,
                          String thirsty,
                          String energy,
                          String sleep,
                          String pulse,
                          String others,
                          String med_name,
                          String ingredients,
                          String result ) {
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
        med_name = med_name.replace(" ","");
        ingredients = ingredients.replace(" ","");
        result = result.replace(" ","");
        return medTableMapper.addTable(cold_hot,
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

    @Override
    public Boolean deleteMed(Integer id) {
        return medTableMapper.deleteMed(id);
    }
}

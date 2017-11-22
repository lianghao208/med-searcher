package com.med.service;

import com.med.model.MedTable;

import java.util.List;

/**
 * Created by Administrator on 2017/11/15.
 */
public interface MedTableService {
    List<MedTable> getTableById(Integer id);
    List<MedTable> getTable(String cold_hot,
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
                            String others);

    List<MedTable> getTableLike(String[] cold_hot,
                            String[] sweat,
                            String[] pain,
                            String[] appetite,
                            String[] pee,
                            String[] defecate,
                            String[] appearance,
                            String[] lady,
                            String[] thirsty,
                            String[] energy,
                            String[] sleep,
                            String[] pulse,
                            String[] others);

    Boolean addMed(String cold_hot,
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
                   String result);

    Boolean deleteMed(Integer id);

    Boolean updateMed(Integer id,
                      String cold_hot,
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
                      String result);
}

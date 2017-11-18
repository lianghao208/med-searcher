package com.med.mapper;

import com.med.model.MedTable;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MedTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedTable record);

    int insertSelective(MedTable record);

    MedTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedTable record);

    int updateByPrimaryKey(MedTable record);

    List<MedTable> selectByPain(String pain);

    List<MedTable> selectTable(@Param(value="cold_hot")String cold_hot,
                               @Param(value="sweat")String sweat,
                               @Param(value="pain")String pain,
                               @Param(value="appetite")String appetite,
                               @Param(value="pee")String pee,
                               @Param(value="defecate")String defecate,
                               @Param(value="appearance")String appearance,
                               @Param(value="lady")String lady,
                               @Param(value="thirsty")String thirsty,
                               @Param(value="energy")String energy,
                               @Param(value="sleep")String sleep,
                               @Param(value="pulse")String pulse,
                               @Param(value="others")String others);
    Boolean addTable(@Param(value="cold_hot")String cold_hot,
                     @Param(value="sweat")String sweat,
                     @Param(value="pain")String pain,
                     @Param(value="appetite")String appetite,
                     @Param(value="pee")String pee,
                     @Param(value="defecate")String defecate,
                     @Param(value="appearance")String appearance,
                     @Param(value="lady")String lady,
                     @Param(value="thirsty")String thirsty,
                     @Param(value="energy")String energy,
                     @Param(value="sleep")String sleep,
                     @Param(value="pulse")String pulse,
                     @Param(value="others")String others,
                     @Param(value="med_name")String med_name,
                     @Param(value="ingredients")String ingredients,
                     @Param(value="result")String result);

    Boolean deleteMed(Integer id);
}
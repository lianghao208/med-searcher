package com.med.mapper;

import com.med.MedSearcherApplication;
import com.med.model.MedTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MedSearcherApplication.class)// 指定spring-boot的启动类
public class MedTableMapperTest {
    @Test
    public void selectTableLike() throws Exception {
        String[] strs = {"%恶风%","%发热%"};
        //List<MedTable> medTable = medTableMapper.selectTableLike(strs);
        //System.out.println(medTable);
    }

    @Test
    public void selectTable() throws Exception {
        List<MedTable> medTable = medTableMapper.selectTable("",
                "",
                "头痛",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "");
        System.out.println(medTable);
    }

    @Autowired
    MedTableMapper medTableMapper;
    @Test
    public void selectByPain() throws Exception {
        List<MedTable> medTable = medTableMapper.selectById(1);
        System.out.println(medTable);
    }

}
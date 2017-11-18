package com.med.service;

import com.med.MedSearcherApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MedSearcherApplication.class)
public class MedTableServiceTest {
    @Test
    public void deleteMed() throws Exception {
        medTableService.deleteMed(291);
    }

    @Autowired
    MedTableService medTableService;
    @Test
    public void addMed() throws Exception {
        medTableService.addMed("测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1",
                "测试1");
    }

}
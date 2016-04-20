package com.simple.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.MyTest;

import java.io.IOException;
import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/20
 */
public class ExcelUtilsTest {
    private static final Logger LOG = LoggerFactory.getLogger(ExcelUtilsTest.class);

    @Test
    public void parseExcel() throws IOException, InvalidFormatException {
        ExcelUtils excelUtils = new ExcelUtils("C:\\Users\\jchen19\\Desktop\\personal\\git\\simple\\src\\main\\resources\\data.xlsx");
        excelUtils.setSheetName("test");
        List<MyTest> test = excelUtils.parse(MyTest.class);
        if (null != test && !test.isEmpty()) {
            for (MyTest myTest : test) {
                LOG.info("记录:{}",myTest.toString());
            }
        }

        excelUtils.close();
    }

}
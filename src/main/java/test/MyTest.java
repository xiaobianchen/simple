package test;

import com.simple.annotation.MapperCell;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/20
 */
public class MyTest {

    @MapperCell(cellName = "name",order = 0)
    private String name;

    @MapperCell(cellName = "phone",order = 1)
    private String phone;

    @MapperCell(cellName = "address",order = 2)
    private String address;

    @MapperCell(cellName = "type",order = 3)
    private int type;

    @MapperCell(cellName = "lat",order = 4)
    private double lat;

    @Override
    public String toString() {
        return "MyTest{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", lat=" + lat +
                '}';
    }
}

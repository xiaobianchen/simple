package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.simple.model.User;
import com.simple.util.JsonTools;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/11
 */
public class JsonToolsTest {

    @Test
    public void testToJsonFromObject() throws Exception {
        User user = new User();
        user.setId("1000");
        user.setUsername("zhangsan");
        user.setPassword("123");
        user.setRealName("xiaobian");
        user.setPhone("18601705642");

        String jsonString =  JsonTools.toJson(user);
        System.out.println(jsonString);
    }

    @Test
    public void testFromJsonObject() throws Exception{
        String json = "{\"id\":\"1000\",\"password\":\"123\",\"phone\":\"18601705642\",\"realName\":\"xiaobian\",\"username\":\"zhangsan\"}";
        User user = JsonTools.fromJson(json, User.class);
        System.out.println(user);
    }

    @Test
    public void testFromJsonList() {
        List<User> userList = new ArrayList<User>();

        User user = new User();
        User user2 = new User();
        user.setId("1000");
        user.setUsername("zhangsan");
        user.setPassword("123");
        user.setRealName("xiaobian");
        user.setPhone("18601705642");

        user2.setId("2000");
        user2.setUsername("lisi");
        user2.setPassword("123567");
        user2.setRealName("xiaobian2");
        user2.setPhone("18601705642");

        userList.add(user);
        userList.add(user2);
        String jsonString =  JsonTools.toJson(userList);
        System.out.println(jsonString);
    }

    @Test
    public void testFromJsonMap() {
        Map<String, User> map = new HashMap<String, User>();
        map.put("1",new User("1000","zhangsan","123","xiaobian","18601705642"));
        map.put("2", new User("2000", "zhangsan2", "123456", "xiaobian2", "15901705642"));
        String jsonString = JsonTools.toJson(map);
        System.out.println(jsonString);
    }

    @Test
    public void testFromJsonArrays(){
        String[] arrs =  {"bill","green","maks","jim"};
        String jsonString = JsonTools.toJson(arrs);
        System.out.println(jsonString);
    }

    @Test
    public void testFromJson2JsonArray(){
        String json = "[\"bill\",\"green\",\"maks\",\"jim\"]";
        JSONArray jsonArray = JSON.parseArray(json);
        System.out.println(jsonArray);
    }

    @Test
    public void testFromJson2List() {
        String json = "[\n" +
                "\t{\n" +
                "\t\t\"id\":\"1000\",\n" +
                "\t\t\"password\":\"123\",\n" +
                "\t\t\"phone\":\"18601705642\",\n" +
                "\t\t\"realName\":\"xiaobian\",\n" +
                "\t\t\"username\":\"zhangsan\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\":\"2000\",\n" +
                "\t\t\"password\":\"123567\",\n" +
                "\t\t\"phone\":\"18601705642\",\n" +
                "\t\t\"realName\":\"xiaobian2\",\n" +
                "\t\t\"username\":\"lisi\"\n" +
                "\t}\n" +
                "]\n";

        List<User> userList = JsonTools.fromJson2List(json, User.class);
        System.out.println(userList);
    }

    @Test
    public void testMap2Json(){
        String json = "[{\n" +
                "\t\"1\":{\n" +
                "\t\t\"id\":\"1000\",\n" +
                "\t\t\"password\":\"123\",\n" +
                "\t\t\"phone\":\"18601705642\",\n" +
                "\t\t\"realName\":\"xiaobian\",\n" +
                "\t\t\"username\":\"zhangsan\"\n" +
                "\t},\n" +
                "\t\"2\":{\n" +
                "\t\t\"id\":\"2000\",\n" +
                "\t\t\"password\":\"123456\",\n" +
                "\t\t\"phone\":\"15901705642\",\n" +
                "\t\t\"realName\":\"xiaobian2\",\n" +
                "\t\t\"username\":\"zhangsan2\"\n" +
                "\t}\n" +
                "}]";
        List<Map<String,Object>> map =  JsonTools.fromJson2Map(json);
        System.out.println(map);
    }

    @Test
    public void testJson2XML() throws Exception{
        String json = "[\n" +
                "\t{\n" +
                "\t\t\"id\":\"1000\",\n" +
                "\t\t\"password\":\"123\",\n" +
                "\t\t\"phone\":\"18601705642\",\n" +
                "\t\t\"realName\":\"xiaobian\",\n" +
                "\t\t\"username\":\"zhangsan\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"id\":\"2000\",\n" +
                "\t\t\"password\":\"123567\",\n" +
                "\t\t\"phone\":\"18601705642\",\n" +
                "\t\t\"realName\":\"xiaobian2\",\n" +
                "\t\t\"username\":\"lisi\"\n" +
                "\t}\n" +
                "]\n";

        String results = JsonTools.fromJson2XML(json);
        System.out.println(results);

    }

    @Test
    public void testXML2Json(){
        String json = JsonTools.xml2Json("<Response>\n" +
                "    <CustID>1300000428</CustID>\n" +
                "    <CompID>1100000324</CompID>\n" +
                "    <Items>\n" +
                "        <Item>\n" +
                "            <Sku_ProductNo>sku_0004</Sku_ProductNo>\n" +
                "            <Wms_Code>1700386977</Wms_Code>\n" +
                "            <Sku_Response>T</Sku_Response>\n" +
                "            <Sku_Reason></Sku_Reason>\n" +
                "        </Item>\n" +
                "        <Item>\n" +
                "            <Sku_ProductNo>0005</Sku_ProductNo>\n" +
                "            <Wms_Code>1700386978</Wms_Code>\n" +
                "            <Sku_Response>T</Sku_Response>\n" +
                "            <Sku_Reason></Sku_Reason>\n" +
                "        </Item>\n" +
                "    </Items>\n" +
                "</Response>\n");
        System.out.println(json);
    }

}
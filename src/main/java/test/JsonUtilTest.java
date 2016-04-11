package test;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/10
 */
public final class JsonUtilTest {


    public static void main(String[] args) {

        //将数组转换为JSON
//        String[] arr = {"asd","dfgd","asd","234"};
//        String json = JsonUtil.toJson(arr);
//        System.out.println(json);

//        将对象转换为json
//        User user = new User();
//        user.setId(String.valueOf(1));
//        user.setUsername("zhangsan" + 1);
//        user.setPassword("password" + 1);
//        user.setRealName("zhang" + 1);
//        user.setPhone("1860170564" + 1);
//
//        String jsonResult = JsonUtil.toJson(user);
//        System.out.println(jsonResult);

        //list转换为JSON
//        List<User> userList = new ArrayList<User>();
//        for(int i = 0;i < 10; i++){
//            userList.add(new User(""+i,"zhangsan" +i,"password"+i,"xiaobian"+i,"186"+i));
//        }
//
//        String json = JsonUtil.fromList2Json(userList);
//        System.out.println(json);

        //将map转换为JSON
//        Map<String,String> map = new HashMap<String,String>();
//        map.put("18601705642", "zhangsan");
//        map.put("15901706842", "lisi");
//
//        String json =  JsonUtil.fromMap2Json(map);
//        System.out.println(json);

        //将set转换为JSON
//        Set<User> set = new HashSet<User>();
//        set.add(new User("1","zhangsan","password1","san.zhangsan","18601705642"));
//        String result = JsonUtil.fromSet2Json(set);
//        System.out.println(result);

        //XML转换为JSON
//        String json = convertXML2JSON("select.xml");
//        System.out.println(json);

        //将json转换为对象
//        String json = "{\"id\":\"1\",\"username\":\"zhangsan1\",\"password\":\"password1\",\"realName\":\"zhang1\",\"phone\":\"18601705641\"}";
//        User user =  JsonUtil.fromJson(json, User.class);
//        System.out.println(user);


        //json 转换为list
//        String json = "[{\"id\":\"1\",\"password\":\"password\",\"phone\":\"1860170564\",\"realName\":\"zhang\",\"username\":\"zhangsan\"},{\"id\":\"2\",\"password\":\"password2\",\"phone\":\"1860170563\",\"realName\":\"zhang\",\"username\":\"zhangsan2\"}]";
//        List<User> userList = JsonTools.fromJson2List(json);
//        System.out.println(userList);
//        System.out.println(userList.size());
    }
}

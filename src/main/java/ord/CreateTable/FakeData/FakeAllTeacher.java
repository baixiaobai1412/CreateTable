package ord.CreateTable.FakeData;

import java.util.HashMap;

import java.util.Map;

public class FakeAllTeacher {
    public static  Map<Integer, String> getTeacherData() {

        Map<Integer, String> TeacherData = new HashMap<>();
        TeacherData.put(0, "语文 张三");
        TeacherData.put(1, "数学 李四");
        TeacherData.put(2, "英语 王五");

        TeacherData.put(3, "语文 严臣宇");
        TeacherData.put(4, "数学 严建群");
        TeacherData.put(5, "英语 严可钦");

        return TeacherData;
    }
}

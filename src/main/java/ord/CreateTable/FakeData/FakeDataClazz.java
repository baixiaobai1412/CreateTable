package ord.CreateTable.FakeData;

import java.util.*;

public class FakeDataClazz {
    public static ArrayList<String> getClazzData() {
        Map<Integer, String> TeacherData = FakeAllTeacher.getTeacherData();
        ArrayList<String>ClazzData = new ArrayList<>();
        ClazzData.add(FakeDataClazz.OneClazz(TeacherData));
        ClazzData.add(FakeDataClazz.TowClazz(TeacherData));
        ClazzData.add(FakeDataClazz.ThrClazz(TeacherData));
        Collections.shuffle(ClazzData);
        return ClazzData;
    }
//183-1班
    private static String OneClazz(Map<Integer, String> TeacherData) {

        List<Integer> ClazzTeacher = FakeDataClazz.TeacherList(0,1,2);
        String a="休息";
        for(int i = 0; i < ClazzTeacher.size();) {
            if (!TeacherData.get(ClazzTeacher.get(i)).equals("null")){
                a = "183-1班 "+TeacherData.get(ClazzTeacher.get(i));
                TeacherData.put(ClazzTeacher.get(i),"null");
                break;
            }else {
                i++;
            }
        }
            return a;
    }
//183-2班
    private static String TowClazz(Map<Integer, String> TeacherData) {

        List<Integer> ClazzTeacher = FakeDataClazz.TeacherList(3,4,5);

        String a="休息";
        for(int i = 0; i < ClazzTeacher.size();) {
            if (!TeacherData.get(ClazzTeacher.get(i)).equals("null")){
                a = "183-2班 "+TeacherData.get(ClazzTeacher.get(i));
                TeacherData.put(ClazzTeacher.get(i),"null");
                break;
            }else {
                i++;
            }
        }
        return a;
    }
//183-3班
    private static String ThrClazz(Map<Integer, String> TeacherData) {

        List<Integer> ClazzTeacher = FakeDataClazz.TeacherList(3,4,2);

        String a ="休息";
        for(int i = 0; i < ClazzTeacher.size();) {
            if (!TeacherData.get(ClazzTeacher.get(i)).equals("null")){
                a = "183-3班 "+TeacherData.get(ClazzTeacher.get(i));
                TeacherData.put(ClazzTeacher.get(i),"null");
                break;
            }else {
                i++;
            }
        }

        return a;
    }

    private static List<Integer>  TeacherList (int China,int Math,int English) {
        List<Integer> ClazzTeacher = new ArrayList<>();
        ClazzTeacher.add(China);       //语文课
        ClazzTeacher.add(Math);       //数学课
        ClazzTeacher.add(English);       //英语课
        Collections.shuffle(ClazzTeacher);
        return ClazzTeacher;
    }



}

package ord.CreateTable;

import ord.CreateTable.FakeData.FakeDataClazz;
import ord.CreateTable.FakeData.FakeDataRoom;
import ord.CreateTable.TeacherRelaxed.JudgmentTeacher;

import java.util.ArrayList;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<Integer, String> RoomData = FakeDataRoom.getRoomData();
        ArrayList<Integer> ClazzDataYan = new ArrayList<>();
        int flag = 0;
        int clazzK = 0;
        int time=0;
//            for (int time = 0 ; time<10;time++){
        while (clazzK < 10){
            time++;
            System.out.println("第"+(time+1)+"个课时");
            ArrayList<String> ClazzData = FakeDataClazz.getClazzData();
                for (int i = 0; i < RoomData.size();) {
                    if (ClazzData.get(i).equals("183-2班 数学 严建群") | ClazzData.get(i).equals("183-3班 数学 严建群")) {
                        ClazzDataYan.add(time);
                        if (ClazzDataYan.size()>2){
                            if (!JudgmentTeacher.Judgment(flag,ClazzDataYan)){
                                ClazzDataYan.remove(ClazzDataYan.size()-1);
                                ClazzData = FakeDataClazz.getClazzData();
                                System.out.println("老师连续上了三节课，正在重新分配");
                            }else {
                                i++;
                            }
                        }else {
                            i++;
                        }
                    }else{
                        i++;
                    }
                }
                for (int i = 0; i < RoomData.size();i++) {
                    System.out.println(RoomData.get(i));
                    System.out.println(ClazzData.get(i) + "\n");
                    if (ClazzData.get(i).equals("183-2班 数学 严建群")){
                        clazzK ++;
                    }
                }
        }
        System.out.println(ClazzDataYan);//打印严建群老师上的所有课时
    }
 }






package ord.CreateTable.TeacherRelaxed;

import java.util.ArrayList;

public class JudgmentTeacher {
    public static boolean Judgment(int flag, ArrayList<Integer> ClazzDataYan)  {
        for (int i = 1 ;i <ClazzDataYan.size();i++){
            int diff = ClazzDataYan.get(i) - ClazzDataYan.get(i-1);
            if (diff == 1) {
                flag += 1;
            }else {
                flag = 0;
            }
        }
        return flag < 2;
    }
}

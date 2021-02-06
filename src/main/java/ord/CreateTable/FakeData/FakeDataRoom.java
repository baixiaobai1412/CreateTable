package ord.CreateTable.FakeData;

import java.util.HashMap;
import java.util.Map;

public class FakeDataRoom {
    public static Map<Integer, String> getRoomData() {
        Map<Integer, String> RoomData = new HashMap<>();
        RoomData.put(0,"A801");
        RoomData.put(1,"A802");
        RoomData.put(2,"A803");
        return RoomData;
    }
}

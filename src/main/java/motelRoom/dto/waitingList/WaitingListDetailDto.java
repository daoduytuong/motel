package motelRoom.dto.waitingList;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class WaitingListDetailDto implements Serializable {
    private UUID waiting_list_id;
    private String user_id;
    private String room_id;
}

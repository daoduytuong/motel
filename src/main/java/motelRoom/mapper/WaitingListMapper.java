package motelRoom.mapper;
import motelRoom.dto.waitingList.WaitingListDetailDto;
import motelRoom.entity.WaitingListEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface WaitingListMapper {

//    CommodityDetailDto fromEntityToDetailDto(CommodityEntity commodityEntity);
//    List<CommodityDetailDto> fromEntityToDto(List<CommodityEntity> commodityEntities);


    WaitingListDetailDto fromEntityToDetailDto(WaitingListEntity waitingListEntity);

    List<WaitingListDetailDto> fromEntitiesToDto(List<WaitingListEntity> waitingListEntities);

}
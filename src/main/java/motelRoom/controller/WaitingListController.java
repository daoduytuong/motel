package motelRoom.controller;

import motelRoom.dto.waitingList.WaitingListDetailDto;
import motelRoom.service.waitingListService.WaitingListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/WaitingList")
public class WaitingListController {
    @Autowired
    WaitingListServiceImpl service;

    @GetMapping("/getAll")
    public List<WaitingListDetailDto> getAll()
    {
        return service.getAllWaitingList();
    }

//    @GetMapping("/{id}")
//    public WaitingListDetailDto getById(@PathVariable( name = "id")UUID uuid)
//    {
//        return service.getById(uuid);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<WaitingListDetailDto > findById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getById(id));
    }

}

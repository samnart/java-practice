//package org.example.mymicroservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/searh")
//public class SearchController {
//
//    private final SearchService searchService;
//
//    @Autowired
//    public SearchController(SearchService searchService) {
//        this.searchService = searchService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<AppartmentDto>> searchAvailableApartments() {
//        // Search available apartments logic
//        List<AppartmentDto> availableApartments = searchService.searchAvailableApartments();
//        return ResponseEntity.ok(availableApartments);
//    }
//}

//package org.example.mymicroservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/booking")
//public class BookingController {
//
//    private final BookingService bookingService;
//
//    @Autowired
//    public BookingController(BookingService bookingService) {
//        this.bookingService = bookingService;
//    }
//
//    @PostMapping("/book/{apartmentId}")
//    public ResponseEntity<String> bookApartment(@PathVariable Long apartmentId) {
//        // Book apartment login
//        bookingService.bookApartment(apartmentId);
//        return ResponseEntity.ok("Apartment booked successfully");
//    }
//
//    @PostMapping("/empty/{apartmentId}")
//    public ResponseEntity<String> emptyApartment(@PathVariable Long apartmentId) {
//        // Empty apartment logic
//        bookingService.emptyApartment(apartmentId);
//        return ResponseEntity.ok("Apartment emptied successfully");
//    }
//}

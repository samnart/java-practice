//package org.example.mymicroservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/appartment")
//public class AppartmentController {
//
//    private final AppartmentService appartmentService;
//
//    @Autowired
//    public AppartmentController(AppartmentService appartmentService) {
//        this.appartmentService = appartmentService;
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<String> addAppartment(@RequestBody AppartmentDto appartmentDto) {
//        // Add appartment login
//        appartmentService.addAppartment(appartmentDto);
//        return ResponseEntity.ok("Appartment added successfuly");
//    }
//
//    @DeleteMapping("/remove/{apartmentId}")
//    public ResponseEntity<String> removeAppartment(@PathVariable Long apartmentId) {
//        // Remove appartment login
//        appartmentService.removeAppartment(apartmentId);
//        return ResponseEntity.ok("Appartment removed successfully");
//    }
//}

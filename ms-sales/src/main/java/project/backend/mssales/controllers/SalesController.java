package project.backend.mssales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.backend.mssales.dto.SalesDto;
import project.backend.mssales.service.SalesService;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/sale")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping
    public ResponseEntity<List<SalesDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<SalesDto>>(salesService.GetSale(), HttpStatus.OK);
    }
}
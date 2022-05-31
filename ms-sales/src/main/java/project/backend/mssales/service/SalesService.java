package project.backend.mssales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.mssales.dto.SalesDto;
import project.backend.mssales.repository.SalesRepository;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public List<SalesDto> GetSale()
    {
        List<SalesDto> list= salesRepository.GetSale();
        list.forEach(l -> System.out.println(l));
        return list;

    }
}
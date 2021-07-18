package com.sbi.benefits.controllers;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.services.rds.auth.GetIamAuthTokenRequest;
import com.amazonaws.services.rds.auth.RdsIamAuthTokenGenerator;
import com.sbi.benefits.models.ApplyTable;
import com.sbi.benefits.models.BenefitTable;
import com.sbi.benefits.repository.BenefitRepository;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BenefitController {

    @Autowired
    BenefitRepository benefitRepository;

    @Autowired
    RestTemplate restTemplate;
    /*@Autowired
    BenefitProducer benefitProducer;*/



    private String URL = "/getApplyTable/{id}";
    private String APPLY_URL = "/createApplyTable";

   /* @GetMapping(value = "/getBenefitList")
    public List<BenefitTable> getBenifitDetails(){
        restTemplate.getForEntity(URL, ApplyTable[].class);
      return benefitRepository.findAll();
    }
*/
    @GetMapping(value = "/getBenefitTableData")
    public List<BenefitTable> getBenefitTableList(){
        return benefitRepository.findAll();
    }

    @GetMapping(value = "/getApplyData/{id}")
    public ApplyTable getApplyDetails(@PathVariable Integer id){
        ResponseEntity<ApplyTable> forEntity = restTemplate.getForEntity(URL, ApplyTable.class, id);
        System.out.println("Welcome to java");
        return forEntity.getBody();

    }

    @PostMapping(value = "/createNew")
    public void postApplyFromBenefit(@RequestBody ApplyTable applyTable){

        BenefitTable benefitTable = new BenefitTable();
        benefitTable.setApplicationId(applyTable.getApplicationId());
        benefitTable.setName(applyTable.getName());
        benefitTable.setSsn(applyTable.getSsn());
        benefitTable.setEmail(applyTable.getEmail());
        benefitTable.setBenefitId(123);
        benefitTable.setRewardValue(100);
        benefitTable.setRewardType("test");
        benefitTable.setRewardStatus("Targetted");
        benefitRepository.save(benefitTable);
            /*ResponseEntity<String> response = restTemplate.postForEntity(APPLY_URL, applyTable, String.class);
            benefitProducer.sendBenefit("apply.queue",applyTable);
            return response.getStatusCode();*/
    }

}

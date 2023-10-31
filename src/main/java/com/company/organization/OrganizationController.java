package com.company.organization;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    
    @Autowired
    private OrganizationRepository organizationRepository;

    @GetMapping
    public List<Organization> getOrganizations(){
        return organizationRepository.findAll();
    }

    @PostMapping
    public Organization addOrganization(Organization organization){
        return organizationRepository.save(organization);
    }

    
}

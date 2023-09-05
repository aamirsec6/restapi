package com.firstapi.restdemo.controller;

import com.firstapi.restdemo.Cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    Cloudvendor cloudvendor;

    @GetMapping("{vendorid}")
    public Cloudvendor getCloudvendordetails(String vendorid){
        return cloudvendor;
                //("c1","vendor 1","address","xxxx");
    }
    @PostMapping
    public String createCloudvendordetails(@RequestBody Cloudvendor cloudvendor){
        this.cloudvendor = cloudvendor;
        return "cloud vendor created successfully";
    }
    @PutMapping
    public String updateCloudvendordetails(@RequestBody Cloudvendor cloudvendor){
        this.cloudvendor = cloudvendor;
        return "cloud vendor created updated successfully";
    }
    @DeleteMapping("{vendorid}")
    public String deleteCloudvendordetails(String vendorid) {
        this.cloudvendor = null;
        return "cloud vendor deleted";
    }
}

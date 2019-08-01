package com.example.danyi.controller;

import com.example.danyi.entity.Region;
import com.example.danyi.service.RegionService;
import com.example.danyi.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private RegionService regionService;

    @RequestMapping("/treePage")
    public String treePage(){
        return "tree/tree";
    }

    @ResponseBody
    @RequestMapping(value="/selectRegion",method= RequestMethod.POST)
    public JsonResult selectSchool(){

        List<Region> listRegion=regionService.getRegion();

        JsonResult jsonResult=new JsonResult();
        jsonResult.setData("listRegion",listRegion);
        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value="/selectCity",method= RequestMethod.POST)
    public JsonResult selectCity(Long proviceId){
        List<Region> listCity=regionService.getCity(proviceId);
        JsonResult jsonResult=new JsonResult();
        jsonResult.setData("listCity",listCity);
        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value="/selectCountry",method= RequestMethod.POST)
    public JsonResult selectCountry(Long countryId){
        List<Region> listCountry=regionService.getCity(countryId);
        JsonResult jsonResult=new JsonResult();
        jsonResult.setData("listCountry",listCountry);
        return jsonResult;
    }
}

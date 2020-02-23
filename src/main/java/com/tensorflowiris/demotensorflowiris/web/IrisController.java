package com.tensorflowiris.demotensorflowiris.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tensorflowiris.demotensorflowiris.enums.IrisType;
import com.tensorflowiris.demotensorflowiris.models.Iris;
import com.tensorflowiris.demotensorflowiris.services.IrisClassifierService;

@RestController
public class IrisController {

    @Autowired
    IrisClassifierService irisClassifierService;

    @GetMapping(value = "/iris/classify/class")
    public IrisType classify(@RequestBody Iris iris) {
        return irisClassifierService.classify(iris);
    }

    @GetMapping(value = "/iris/classify/probabilities")
    public Map<IrisType, Float> classificationProbabilities(@RequestBody Iris iris) {
        return irisClassifierService.classificationProbabilities(iris);
    }

}
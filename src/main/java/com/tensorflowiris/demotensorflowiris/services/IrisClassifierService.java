package com.tensorflowiris.demotensorflowiris.services;

import java.util.Map;

import com.tensorflowiris.demotensorflowiris.enums.IrisType;
import com.tensorflowiris.demotensorflowiris.models.Iris;

public interface IrisClassifierService {
	  /**
     * Method to fetch a classification from the model
     * @param iris the data to classify
     * @return the predicted type
     */
    IrisType classify(Iris iris);

    /**
     * Method to fetch from the model the probabilities of all the types
     * @param iris the data to classify
     * @return A map relating the type with its predicted probabilities
     */
    Map<IrisType, Float> classificationProbabilities(Iris iris);
}

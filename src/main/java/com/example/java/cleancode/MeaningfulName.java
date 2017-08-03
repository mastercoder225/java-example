package com.example.java.cleancode;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulName {
    // bad
    private int d; // elapsed time in days

    // good
    private int elapsedTimeInDays;
    private int daysSinceCreation;
    private int daysSinceModification;
    private int fileAgeInDays;
}

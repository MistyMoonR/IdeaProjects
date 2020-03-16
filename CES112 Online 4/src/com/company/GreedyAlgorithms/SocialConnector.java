package com.company.GreedyAlgorithms;
import java.util.ArrayList;
import java.util.List;

public class SocialConnector {
    private boolean isCounterEnabled = true;
    private int counter = 4;
//    @Getter
//    @Setter
    List users;

    public SocialConnector() {
        users = new ArrayList<>();
    }

    public boolean switchCounter() {
        this.isCounterEnabled = !this.isCounterEnabled;
        return this.isCounterEnabled;
    }
}



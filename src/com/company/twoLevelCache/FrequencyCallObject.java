package com.company.twoLevelCache;

import java.util.Set;

public interface FrequencyCallObject <KeyType> {
    Set<KeyType> getMostFrequentlyUsedKeys();
    int getFrequencyOfCallingObject(KeyType key);
}

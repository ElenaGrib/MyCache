package com.company.twoLevelCache;

import java.io.IOException;

public interface LeveledCache <KeyType,ValueType> extends Cache<KeyType,ValueType>,FrequencyCallObject<KeyType>{
    void recache() throws IOException, ClassNotFoundException;
}

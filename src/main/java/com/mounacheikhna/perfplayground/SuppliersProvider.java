package com.mounacheikhna.perfplayground;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import java.util.HashMap;
import java.util.Map;

public class SuppliersProvider {

    public SuppliersProvider() {
    }

    Map<String, Supplier<Value>> provideOfInstance() {
        Map<String, Supplier<Value>> values = new HashMap<>();
        values.put("k1", Suppliers.ofInstance(new Value("value1")));

        values.put("k2", Suppliers.ofInstance(new Value("value2")));

        values.put("k3", Suppliers.ofInstance(new Value("value3")));

        return values;
    }

    Map<String, Supplier<Value>> provideOfMemoize() {
        Map<String, Supplier<Value>> values = new HashMap<>();
        values.put("k1", Suppliers.memoize(() -> new Value("value1")));

        values.put("k2", Suppliers.memoize(() -> new Value("value2")));

        values.put("k3", Suppliers.memoize(() -> new Value("value3")));

        return values;
    }

}

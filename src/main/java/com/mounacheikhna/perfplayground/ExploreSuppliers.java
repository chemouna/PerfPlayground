package com.mounacheikhna.perfplayground;

public class ExploreSuppliers {

    public static void main(String[] args) {
        SuppliersProvider suppliersProvider = new SuppliersProvider();
        // only value1 should be created in this case
        Value value1 = suppliersProvider.provideOfInstance().get("k1").get();
        System.out.println(value1);
    }

}

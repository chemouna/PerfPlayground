package com.mounacheikhna.perfplayground;

public class ExploreSuppliers {

    public static void main(String[] args) {
        SuppliersProvider suppliersProvider = new SuppliersProvider();

        // we want a way so that only value1 is created
        //Value value1 = suppliersProvider.provideOfInstance().get("k1").get();
        Value value1 = suppliersProvider.provideOfMemoize().get("k1").get();
        System.out.println(value1);
    }

}

package edu.kash.learn.model;

public class ModelTest {

    Owner owner;

    public void testOwner() {
        owner = new Owner();
        owner.setAddress("123 Main Str");
        //Asserts.AssertTrue(owner.getAddress());
    }
}


package com.linecorp.example.springelephant;

public class Person
{
    public Long id;
    
    public String name;
    
    public String phoneNumber;
    
    public Person(Long aId, String aName, String aPhoneNumber)
    {
        id=aId;
        name=aName;
        phoneNumber=aPhoneNumber;
    }
    
    public Person()
    {
        
    }
};

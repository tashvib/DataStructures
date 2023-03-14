//Set is like a list, but not ordered and items cannot repeat

//Implementation of Sets:
    //Every single object in java has a hashcode
    

//Sets are powerful becaused each value can be mapped to specific index

//Sets also have the ability to find a value given the value(constant look up time), whereas 
//in arrays you have to give the index of the value to find the value (linear look up time)

import java.util.HashSet;

public class Set{
    public static void main(String[] args){
        String str = "string";
        System.out.println(str.hashCode()); // hashcode: -891985903
        //the hashcode of an obj is a computed attribute
        //the hascode of "string" will ALWAYS be -891985903
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("hi"); //you dont add things to specific indexes, its not ordered, you can essentially just check where an item is
                            //you can't sort stuff
                            //good at checking if it contains an item or not

        System.out.println("does hashSet contain hi" + hashSet.contains("hi"));
        System.out.println(str.hashCode());
        System.out.println(str.hashCode());
        System.out.println(str.hashCode());

    }
}
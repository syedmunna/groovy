package com.munna

import java.util.regex.Pattern

class GroovyPractice1 {
    def static myMethod(){
        return "Munna";
    }
    public static void main(String[] args) {
        def list = [10,20,30,40];
        def list2 = [];
        list2 = list.minus([10,40]);
        println(list2);
        def date =new Date(1000);
        println(date);
        //maps in groovy
        def maps = [:]; //empty map
        def maps2 = ["name":"munna","age":"25"];
        list2 = maps2.keySet();
        println(list2);
        def reg = "Groovy" =~ "Groovy"; //creating matcher obj
        println("Groovy" ==~ "Gro*vy"); //checking in single line quickly
        println(reg.matches())
        def partn = ~"Munna"; //creating pattern obj
        println(partn.matcher("Munna").matches())
        println(myMethod())
        List<Integer> list3 = new ArrayList<>(); //using generics in groovy
        list3.add(10)
        list3.add(20)
        println(list3)
        def usingTraits = new GroovyPractice2_Traits();
        usingTraits.disp()
        usingTraits.myMethod()
        list2.each {}
        new File().eachLine {}
    }
}

package com.munna

class GroovyPractice2_Traits implements MyTrait{ //using traits
    @Override
    void disp() {
        println("i am from disp() method(override) of trait "+com_munna_MyTrait__name)
    }
}

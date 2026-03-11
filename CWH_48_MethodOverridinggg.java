class Animals{
    public void sounds(){
        System.out.println("Animal class produces sound");
    }

    public void eat(){
        System.out.println("Animal class eats");
    }
}

class Lion extends Animals{
    public void attacks(){
        System.out.println("Lion class attacks");
    }

    @Override
    public void eat(){
        System.out.println("Lion eats deer");
    }
}

public class CWH_48_MethodOverridinggg {
    public static void main(String[] args) {
        Lion sher1 = new Lion();
        sher1.sounds();
        sher1.eat();
        sher1.attacks();
    }
}

/*
Method Overriding (Java)
Method Overriding occurs when a child class provides its own implementation of a method that already exists in the parent class.

In simple terms:
-> Same method name + parameters, but different behavior in subclass.
-> It is used for Runtime Polymorphism.

Important Rules of Method Overriding ==>
    1️⃣ Method name must be same
    2️⃣ Parameters must be same
    3️⃣ Must use inheritance
    4️⃣ Return type must be same or compatible
    5️⃣ Cannot reduce access modifier
*/
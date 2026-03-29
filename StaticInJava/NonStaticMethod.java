package StaticInJava;
class Demo3 {

    {
        System.out.println("Non-static block executed");
    }

    Demo3(){
        System.out.println("Constructor executed");
    }

    public void greet(){
        System.out.println("Good Morning");
    }

    public static void main(String[] args){
        Demo3 d = new Demo3();
        d.greet();
    }
}


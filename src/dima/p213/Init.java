package dima.p213;

 class Init {
    Init(){
        System.out.println("class Init");
    }
}

class SecondInit extends Init{
    SecondInit(){
        System.out.println("class SecondInit");
    }
}

class ThirdInit extends SecondInit{
    public static void main(String[] args) {
        new ThirdInit();
    }
}
package overriding;

 class Bank {
    int getRateOfInterest(){
        return 5;
    }
}

class DutchBangla extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class Trust extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class Sonali extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}

class Main {
    public static void main(String[] args) {
        DutchBangla d1 = new DutchBangla();
        Sonali s1 = new Sonali();
        Trust t1 = new Trust();
        System.out.println("dutch bangla "+d1.getRateOfInterest());
        System.out.println("Sonali "+s1.getRateOfInterest());
        System.out.println("Trust "+t1.getRateOfInterest());
    }
}


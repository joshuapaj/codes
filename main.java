public class main {
    
    public static void main(String [] args){
        weapon w = new weapon();
        rocket r = new rocket();
        machinegun mg = new machinegun();
        w.shoot();
        r.shoot();
        mg.shoot(15);
    }
}


public class machinegun extends weapon {
    public void shoot(){
        System.out.println("pew");
    }
   
    //with specific number of rounds fire
    public void shoot(int rounds){
        for (int r = 0; r<rounds;r++)
        {
            System.out.println("pew");
        }
    }
}

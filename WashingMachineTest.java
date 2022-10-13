import java.util.ArrayList;

public class WashingMachineTest {
  public void RunTest(int asize) {

    int arr[] = new int[4];

     System.out.println("=== Start of the Test ===");
     System.out.println("=== Adding 100 Washers ===");
    
    ArrayList<WashingMachine> washers = new ArrayList<WashingMachine>();
    
    for (int i = 1; i <= asize; i++){
      
      WashingMachine washer1 = new WashingMachine(1.0, "WM"+i);
      
      washers.add(washer1);
    
    }

System.out.println("=== Running the Main Test ===");
   // turn on all the washers for testing, only 1-10 get clothes and soap
   for (WashingMachine w: washers)
   {
      if ( washers.indexOf(w) < 10 )
       {
         w.AddSoap();
         w.AddClothes(1.0);
       }
      w.StartWasher();
   }

    for(WashingMachine w: washers){
      w.PrintStatus();
    }
    System.out.println("Status = " + washers.get(1));
    System.out.println("=== End of Test ===");
  }
  
}
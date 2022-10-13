public class WashingMachine {
  private boolean hasSoap, running;
  private double currentLoad;
  private final double capacity;
  private String label;

  public WashingMachine(double maxCap, String s) {
    hasSoap = running = false;
    currentLoad = 0;
    capacity = maxCap; // 2.0 cubic feet
    label = s;

  }

    public String GetLabel()
  {
     return label;
  }

  public boolean IsRunning() {
    return running;
  }

  public boolean HasSoap() {
    return hasSoap;
  }

  public double Clothes() {
    return currentLoad;
  }

  public void AddClothes(double amount) {
    double request = currentLoad + amount;

    if (!running) {
      if (request <= capacity)
        currentLoad = request;
      else
        System.out.println("     WARNING: Washing machine overload ! ! ! ");
    } else {
      System.out.println("     WARNING: Cannot add clothes while running");
    }

  }


  public double RemoveClothes(){
    double removed = currentLoad;

    if (currentLoad == 0.0){
      System.out.println("     Nothing in Washing Machine to remove. ");
    }
    else{
      currentLoad = 0.0;
      System.out.println("     Clothing removed: " + removed);
    }

    return removed;
  }

  public void AddSoap() {
    if (!hasSoap)
      hasSoap = true;
    else
      System.out.println("     WARNING: Already has soap");
  }

  public void StartWasher() {
    if (!running && (currentLoad > 0))
      running = true;
    else
      System.out.println("     WARNING: Start button ignored");
  }

  public void PrintStatus() {
    System.out.println("Running = " + running);
    System.out.println("Has Soap = " + hasSoap);
    System.out.println("Current Load = " + currentLoad);
    System.out.println("Washer Number = " + label);
    System.out.println("==========================");
  }


}

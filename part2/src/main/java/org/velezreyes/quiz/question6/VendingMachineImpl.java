package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{
  private static VendingMachineImpl instance;
  private int insertedQuarters;

  private VendingMachineImpl(){
    this.insertedQuarters = 0;
  }
  public static VendingMachine getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
    //return null;
  }

  @Override
  public void insertQuarter() {
    insertedQuarters += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if(name.equals("ScottCola")) {
      if(insertedQuarters == 75){
        Drink drink = new Drink() {
          @Override
          public String getName() {
            return name;
          }

          @Override
          public boolean isFizzy() {
            return true;
          }
        };
        insertedQuarters -= 75;
        return drink;
      }else {
        throw new NotEnoughMoneyException();
      }
    }
    else if(name.equals("KarenTea")){
      if(insertedQuarters == 75) {
        throw new NotEnoughMoneyException();
      }else if (insertedQuarters == 100){
        Drink drink = new Drink() {
          @Override
          public String getName() {
            return name;
          }

          @Override
          public boolean isFizzy() {
            return false;
          }
        };
        insertedQuarters -= 100;
        return drink;
      }else {
        throw new NotEnoughMoneyException();
      }
    }
    else if(name.equals("BessieBooze")){
      if(insertedQuarters == 100){
        throw new UnknownDrinkException();
      }

    }else{
      throw new UnknownDrinkException();
    }
    return null;
  }

}

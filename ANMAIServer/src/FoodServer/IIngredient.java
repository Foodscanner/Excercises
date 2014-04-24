package FoodServer;

import java.util.List;

public interface IIngredient {
  
  public long getID();

  public String getName();
  
  public List<IFlag> getFlags();
  
  void removeFlag(Flag flag);

  public void addFlag();

  public void setId(long aID);
  
  public void setName(String aName);
  
  public IIngredient copy();


}
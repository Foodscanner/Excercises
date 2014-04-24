package FoodServer;

import java.util.ArrayList;
import java.util.List;

public class Ingredient implements IIngredient {
	private long _id;
	private String _name;
	private List<IFlag> _flags;

	public long getId() {
		return this._id;
	}

	public void setId(long aId) {
		this._id = aId;
	}


	public String getName() {
	    return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

  @Override
  public long getID() {
    return this._id; 
  }



  @Override
  public List<IFlag> getFlags() {
    List<IFlag> tempFlags = new ArrayList<IFlag>();
    for(IFlag flag:this._flags){
      tempFlags.add(flag.copy());
    }
    return tempFlags;
  }

  @Override
  public void removeFlag(Flag flag) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addFlag() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public IIngredient copy() {
    // TODO Auto-generated method stub
    return null;
  }

}
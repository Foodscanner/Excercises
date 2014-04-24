package foodServer;

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

	  public void addFlag(IFlag flag) {
	    // TODO Auto-generated method stub
	    
	  }
	  
	  public void removeFlag(IFlag flag) {
	    // TODO Auto-generated method stub
	    
	  }

	  public List<IFlag> getFlags() {
	    List<IFlag> tempFlags = new ArrayList<IFlag>();
	    for(IFlag flag:this._flags){
	      tempFlags.add(flag.copy());
	    }
	    return tempFlags;
	  }
	  
	  
	  public IIngredient copy() {
	    // TODO Auto-generated method stub
	    return null;
	  }
	  
	  
    public void persist() {
      // TODO Auto-generated method stub
    }



  


  






}
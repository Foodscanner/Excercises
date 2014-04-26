package foodServer;

/**
 * Allergy flags for {@link Article}
 * @author Christian Gläser
 *
 */
public class Flag implements IFlag{
	private long _id;
	private String _name;
	private String _description;
	private boolean _limitToProduct;
	public Article _unnamed_Article_;
	public Ingredient _unnamed_Ingredient_;

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

	public String getDescription() {
		return this._description;
	}

	public void setDescription(String aDescription) {
		this._description = aDescription;
	}

	public boolean getLimitToProduct() {
		return this._limitToProduct;
	}

	public void setLimitToProduct(boolean aLimitToProduct) {
		this._limitToProduct = aLimitToProduct;
	}

    public IFlag copy() {
    // TODO Auto-generated method stub
    return null;
    }

    public void persist() {
    // TODO Auto-generated method stub 
    }
}
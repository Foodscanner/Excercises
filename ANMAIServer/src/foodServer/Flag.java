package foodServer;

/**
 * Allergy flags for {@link Article}
 * @author Christian Gl�ser
 *
 */
public class Flag implements IFlag{
	private long id;
	private String name;
	private String description;
	private boolean limitToProduct;

	public long getId() {
		return this.id;
	}

	public void setId(long aId) {
		this.id = aId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public boolean getLimitToProduct() {
		return this.limitToProduct;
	}

	public void setLimitToProduct(boolean aLimitToProduct) {
		this.limitToProduct = aLimitToProduct;
	}

    public Flag copy() {
    // TODO Auto-generated method stub
    return null;
    }

    public void persist() {
    // TODO Auto-generated method stub 
    }
}
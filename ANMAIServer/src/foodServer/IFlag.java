package foodServer;

/**
 * An interface for Flags
 * @author Christian Gläser
 *
 */
public interface IFlag{

	public void setId(long aId);

	public void setName(String aName);

	public void setDescription(String aDescription);

	public void setLimitToProduct(boolean aLimitToProduct);
	
	public long getId();

	public String getName();

	public String getDescription();

	public boolean getLimitToProduct();
	
	public IFlag copy();
	
	public void persist();
}
package foodServer;

import java.net.URI;
import java.util.List;

import foodServer.datatypes.IEAN;

public interface IArticle {
	
	public IArticle getArticle();
	
	//ID
	/**
	 * @return Returns the EAN of the Product
	 */
	public IEAN getID();

	/**
	 * Necessary in case EAN changes, should be used with caution
	 * @param aID
	 */
	public void setID(IEAN aID);

	//Name
	/**
	 * @return The Name of the Product
	 */
	public String getName();
	
	public void setName(String aName);

	//Image URI
	public URI getImageURI();
	
	public void setImageURI(URI aImageURI);
	
	//Description
	public String getDescription();

	public void setDescription(String aDescription);
	
	//Flags
	/**
	 * Adds a product-specific flag
	 * @param aFlag
	 */
	public void addFlag(IFlag aFlag);

	/**
	 * Removes a product-specific flag
	 * @param aFlag
	 */
	public void removeFlag(IFlag aFlag);
	
	public List<IFlag> getFlags();
	
	public List<IFlag> getProductFlags();
	
	//Ingredients
	public List<IIngredient> getIngredients();
	
    public void addIngredient(IIngredient ingredient);
    
    public void removeIngredient(IIngredient ingredient);
    

	public void persist();
	
	





	







}
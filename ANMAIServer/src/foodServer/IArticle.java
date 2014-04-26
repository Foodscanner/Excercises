package foodServer;

import java.net.URI;
import java.util.List;

import foodServer.datatypes.IEAN;

public interface IArticle {

	public void setID(IEAN aID);

	public void setName(String aName);

	public void setImageURI(URI aImageURI);

	public void setDescription(String aDescription);

	public void removeFlag(IFlag aFlag);

	public void persist();
	
	public IEAN getID();

	public String getName();

	public String getDescription();

	public URI getImageURI();

	public List<IIngredient> getIngredients();

	public List<IFlag> getFlags();

	public List<IFlag> getProductFlags();

	public IArticle getProduct();

    public void addIngredient(IIngredient aIIngredient);
}
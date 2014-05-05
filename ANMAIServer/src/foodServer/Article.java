package foodServer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import foodServer.datatypes.EAN13;
import foodServer.datatypes.IEAN;
import foodServer.exceptions.NumberInvalidFormatException;

/**
 * An Article implementation
 * @author Christian Gl�ser, Felipe Oehrwald
 *
 */
public class Article implements IArticle {

	private IEAN id;

	private String name;

	private String description;

	private URI imageURI;
	private List<IIngredient> ingredients;
	
	private List<IFlag> flags;

	
	
	/**
	 * @param aId
	 * @throws NumberInvalidFormatException 
	 * Constructor of an article with parameter id
	 */
	public Article(long aId) throws NumberInvalidFormatException {
	    
		id = new EAN13(aId);
	}

	/**
	 * @see foodServer.IArticle#getID()
	 * Gets the id of the Article as long
	 */
	public long getID() {
		return id.getEAN();
	}
	
	private IEAN getIDAsEAN() {
	        return id;
	}
	
	/**(non-Javadoc)
	 * @see foodServer.IArticle#setID(long)
	 * If aId is a valid id, it is set as new id
	 */
	public void setID(long aID){
	  IEAN ean;
	  try {
      ean = new EAN13(aID);
      this.setID(ean);
      } catch (NumberInvalidFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      }
	  
	}

	/**
	 * @param aId
	 * Sets the id of the article
	 */
	private void setID(IEAN aId) {
		id = aId;
	}

	/**
	 * @see foodServer.IArticle#getName()
	 * @return The name of the article
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @see foodServer.IArticle#setName(java.lang.String)
	 * Sets the name of the article
	 */
	public void setName(String aName) {
		this.name = aName;
	}

	/**
	 * @see foodServer.IArticle#getDescription()
	 * @return A description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @see foodServer.IArticle#setDescription(java.lang.String)
	 * Sets the description in the Article
	 */
	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	/**
	 * @see foodServer.IArticle#getImageURI()
	 * Gets the image URI
	 **/
	public URI getImageURI() {
		// URI is immutable
		return this.imageURI;
	}

	/**
	 * @see foodServer.IArticle#setImageURI(java.net.URI)
	 * Sets the URI of the image
	 */
	public void setImageURI(URI aImageURI) {
		// TODO Logic check
		this.imageURI = aImageURI;
	}



	/*setIngredients(List<IIngredient> aIIngredient) {
		throw new UnsupportedOperationException();
	}*/

	/**
	 * @see foodServer.IArticle#getArticle()
	 * Returns a persisted article from the database
	 */
	public IArticle getArticle() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @see foodServer.IArticle#getFlags()
	 * Returns a list of all flags
	 */
	public List<IFlag> getFlags() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @see foodServer.IArticle#addFlag(foodServer.IFlag)
	 * Adds a product specific flag
	 */
	public void addFlag(IFlag aFlag) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see foodServer.IArticle#removeFlag(foodServer.IFlag)
	 * Removes a product specific flag. If flag doesn't exist, request is ignored
	 */
	public void removeFlag(IFlag aFlag) {
		flags.remove(aFlag);
	}

	/**
	 * @see foodServer.IArticle#getProductFlags()
	 * Returns the product specific flags. Logically, this is a subset of all flags
	 */
	public List<IFlag> getProductFlags() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @see foodServer.IArticle#getIngredients()
	 * Returns a list of ingredients
	 */
	public List<IIngredient> getIngredients() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @see foodServer.IArticle#addIngredient(foodServer.IIngredient)
	 * Adds an ingredient
	 */
	public void addIngredient(IIngredient aIIngredient) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see foodServer.IArticle#removeIngredient(foodServer.IIngredient)
	 * Removes an ingredient
	 */
	public void removeIngredient(IIngredient ingredient) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see foodServer.IArticle#persist()
	 * If article is new, new article is inserted in database. Else, if there have been changes, the article is updated
	 */
	public void persist() {
		// TODO Auto-generated method stub
	}






}
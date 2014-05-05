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
 * @author Christian Gl�ser
 *
 */
public class Article implements IArticle {

	private IEAN id;

	private String name;

	private String description;

	private URI imageURI;
	private List<IIngredient> ingredients;
	
	private List<IFlag> flags;

	
	
	public Article(IEAN aId) {
		id = aId;
	}

	public long getID() {
		return id.getEAN();
	}
	
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

	private void setID(IEAN aId) {
		id = aId;
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

	public URI getImageURI() {
		// URI is immutable
		return this.imageURI;
	}

	public void setImageURI(URI aImageURI) {
		// TODO Logic check
		this.imageURI = aImageURI;
	}



	public void setIngredients(List<IIngredient> aIIngredient) {
		throw new UnsupportedOperationException();
	}

	public IArticle getArticle() {
		throw new UnsupportedOperationException();
	}

	public List<IFlag> getFlags() {
		throw new UnsupportedOperationException();
	}
	
	public void addFlag(IFlag aFlag) {
		// TODO Auto-generated method stub
	}
	
	public void removeFlag(IFlag aFlag) {
		flags.remove(aFlag);
	}

	public List<IFlag> getProductFlags() {
		throw new UnsupportedOperationException();
	}

	public List<IIngredient> getIngredients() {
		throw new UnsupportedOperationException();
	}
	
	public void addIngredient(IIngredient aIIngredient) {
		// TODO Auto-generated method stub
	}
	
	public void removeIngredient(IIngredient ingredient) {
		// TODO Auto-generated method stub
		
	}

	public void persist() {
		// TODO Auto-generated method stub
	}






}
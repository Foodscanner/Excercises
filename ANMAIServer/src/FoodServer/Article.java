package FoodServer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Article implements IArticle {
	private long _id;
	private String _name;
	private String _description;
	private URI _imageURI;
	private List<IIngredient> _ingredients;
	private List<IFlag> _flags;
	public Ingredient _unnamed_Ingredient_;
	public ArticleUtil _unnamed_ArticleUtil_;
	public Flag _unnamed_Flag_;
	
	public Article(long aId){
	  setID(aId);
	}

	public long getID() {
		return this._id;
	}

	public void setID(long aId) {
	  //TODO Necessary????
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

	public URI getImageURI() {
	  //URI is immutable
		return this._imageURI; 
	}

	public void setImageURI(URI aImageURI) {
	  //TODO Logic check
		this._imageURI = aImageURI;
	}

	public List<IIngredient> getIngredients() {
		throw new UnsupportedOperationException();
	}

	public void setIngredients(List<IIngredient> aIIngredient) {
		throw new UnsupportedOperationException();
	}

	public IArticle getProduct() {
		throw new UnsupportedOperationException();
	}

	public List<IFlag> getFlags() {
		throw new UnsupportedOperationException();
	}

	public List<IFlag> getProductFlags() {
		throw new UnsupportedOperationException();
	}

    @Override
    public void setIngredients(IIngredient aIIngredient) {
    // TODO Auto-generated method stub
    }

    @Override
    public void removeFlag(IFlag aFlag) {
    // TODO Auto-generated method stub
    }

    @Override
    public void persist() {
    // TODO Auto-generated method stub
  }
}
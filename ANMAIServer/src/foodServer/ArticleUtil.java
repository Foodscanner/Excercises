package foodServer;

import foodServer.datatypes.EAN13;
import foodServer.datatypes.IEAN;
import foodServer.exceptions.ArticleNotFoundException;
import foodServer.exceptions.NumberInvalidFormatException;

/**
 * Used for creating instances of Articles by retrieving them from database
 * @author Christian Gläser
 *
 */
public class ArticleUtil {
	
	/**
	 * Private standard constructor to prevent initialization
	 */
	private ArticleUtil(){}

	/**
	 * Retrieves an article from database and sets values correctly
	 * @param aId
	 * @return An article of type Article, if article is in Database. Else null is returned.
	 * @throws NumberInvalidFormatException if number is not an ean. Use EAN13.isValid method to prevent error to be thrown
	 */
	public static Article getArticle(long aId) throws NumberInvalidFormatException {
		Article article = null;
		IEAN ean = new EAN13();
		if(ean.isValid(aId)){
		  //retrieve article from db
		  //article = ....
		}
		else{
		  throw new NumberInvalidFormatException();
		}
		return article;
	}
	
	//if more kinds of articles existed, more methods would be here
}
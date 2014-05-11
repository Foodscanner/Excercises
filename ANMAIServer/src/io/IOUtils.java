package io;

import java.util.HashMap;

import com.thoughtworks.xstream.XStream;

import foodServer.Article;
import foodServer.ArticleUtil;
import foodServer.IArticle;
import foodServer.IFlag;
import foodServer.datatypes.EAN13;
import foodServer.datatypes.IEAN;
import foodServer.exceptions.NumberInvalidFormatException;

public class IOUtils {
	private IOUtils() {
	}

	// Soon to be deprecated - s.b.
	public String getArticle(long ID) throws NumberInvalidFormatException {
		StandardExchangeArticle sea = new StandardExchangeArticle();
		sea.ID = ID;
		String returnString = null;

		try {
			IEAN iean = new EAN13(ID);
			// TODO: change to getArticle(iean);
			IArticle article = ArticleUtil.getArticle(ID);
			if (article == null) {
				sea.name = "No such article!";
				sea.describtion = "Article does not exist in database!";
			}
			// Packaging information into ExchangeArticle
			sea.name = article.getName();
			sea.describtion = article.getDescription();
			sea.pictureURI = article.getImageURI();
			sea.flags = new HashMap<Integer, String>();
			for (IFlag flag : article.getFlags()) {
				// TODO: remove cast to int as soon as issue #4 has been
				// resolved
				sea.flags.put((int) flag.getId(), flag.getName());
			}
		} catch (NumberInvalidFormatException ex) {
			sea.name = "File corruption!";
			sea.describtion = "Received EAN is invalid due to file corruption during transmission - please try again!";
		}

		XStream serializer = new XStream();
		returnString = serializer.toXML(sea);
		return returnString;
	}
}

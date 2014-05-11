package io;

import java.util.HashMap;

import com.thoughtworks.xstream.XStream;

import foodServer.Article;
import foodServer.ArticleUtil;
import foodServer.IFlag;
import foodServer.exceptions.NumberInvalidFormatException;

public class IOUtils {
	private IOUtils(){}
	
	//Soon to be deprecated - s.b.
	public String getArticle(long ID) throws NumberInvalidFormatException{
		String returnString = null;
		
		Article article = ArticleUtil.getArticle(ID);
		
		//Packaging information into ExchangeArticle
		StandardExchangeArticle sea = new StandardExchangeArticle();
		sea.name = article.getName();
		sea.describtion = article.getDescription();
		sea.pictureURI = article.getImageURI();
		sea.flags = new HashMap<Integer, String>();
		for(IFlag flag : article.getFlags()){
			//TODO: remove cast to int as soon as issue #4 has been resolved
			sea.flags.put((int)flag.getId(), flag.getName());
		}
		
		XStream serializer = new XStream();
		returnString = serializer.toXML(sea);
		return returnString;
	}
	
	//To be used after the switch from long to IEAN in the ArticleUtil class.
//	public String getArticle(IEAN ID){
//		String returnString = null;
//		Article article = ArticleUtil.getArticle(ID);
//		XStream serializer = new XStream();
//		returnString = serializer.toXML(article);
//		return returnString;
//	}
	

}

package io;

import java.net.URI;
import java.util.HashMap;

/**
 * Standard article format.
 * Use when standard article information is required by the App.
 * @author Gerald Melles
 *
 */
public class StandardExchangeArticle {
long ID;
String name;
String describtion;
URI pictureURI;
HashMap<Integer, String> flags;
}

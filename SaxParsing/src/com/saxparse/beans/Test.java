package com.saxparse.beans;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Test {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        
		XmlSaxParsing parsing =  new XmlSaxParsing();
		parsing.parsing("D:\\workspace\\cts\\SaxParsing\\parsing.xml");
		
		
		
	}

}

package com.saxparse.beans;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSaxParsing extends DefaultHandler {
	
	
	private SAXParser parser = null;
	private SAXParserFactory factory =null;
	
	
	
	

	public XmlSaxParsing() throws ParserConfigurationException, SAXException {
		
		factory =  SAXParserFactory.newInstance();
		parser = factory.newSAXParser();
		
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		
		
		//System.out.println("starting doc");
	}

	@Override
	public void endDocument() throws SAXException {

		//System.out.println("ending doc");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		//System.out.println("starting element");
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		//System.out.println("end element");

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
	if(length>0) {
		String test = new String (ch, start, length);
		
		System.out.println(test);
	}
		
		super.characters(ch, start, length);
	}

	
	public void parsing(String xmlFile) throws SAXException, IOException {
		
		//System.out.println("before parsing");
		
		parser.parse(xmlFile, this);
		
		//System.out.println("after parsing");
		
	}
	
	

}

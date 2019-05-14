package com.cts.bean1;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
      private Person person;  
	  private String name1;
      private String type;
      
      public Room() {
  		super();
  	}
      @Autowired
	public Room(Person person, String name1, String type) {
		super();
		this.person = person;
		this.name1 = name1;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Room [person=" + person + ", name1=" + name1 + ", type=" + type + "]";
	}
	
      
}

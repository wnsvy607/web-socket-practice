package com.example.chat.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloMessage {

	String name;

	public HelloMessage(String name) {
		this.name = name;
	}

}

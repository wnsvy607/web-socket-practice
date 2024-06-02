package com.example.chat.message;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloMessage {

	String name;

	public HelloMessage() {
	}

	public HelloMessage(String name) {
		this.name = name;
	}

}

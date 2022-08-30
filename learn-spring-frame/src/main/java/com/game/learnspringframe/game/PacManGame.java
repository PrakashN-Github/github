package com.game.learnspringframe.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{
	
	public void up() {
		System.out.println("Pac-Jump");
		}

	public void down() {
		System.out.println("Pac-go into hole");
		
	}

	public void left() {
		System.out.println("Pac-stop");
		
	}
	public void right() {
		System.out.println("Pac-go faster");
		
	}
	
	
	
}

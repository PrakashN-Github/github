package com.game.learnspringframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.game.learnspringframe.game.GameRunner;
import com.game.learnspringframe.game.MarioGame;
import com.game.learnspringframe.game.PacManGame;
import com.game.learnspringframe.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameApplication.class, args);
		
	// MarioGame,GameRunner
	 GameRunner runner=context.getBean(GameRunner.class);
				
		
		//MarioGame game= new MarioGame();	
		 // SuperContraGame game= new SuperContraGame();
       //PacManGame game= new PacManGame();
		//GameRunner runner= new GameRunner(game);
		runner.runGame();
		
		
		
	}

}

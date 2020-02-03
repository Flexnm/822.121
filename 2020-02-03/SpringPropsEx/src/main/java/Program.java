import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import beans.Team;
import config.SpringConfig;

public class Program {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			Environment env = ctx.getBean(Environment.class);
			
			Team redTeam = ctx.getBean(Team.class, env.getProperty("red_team_name"), 
					env.getProperty("red_team_lives", Integer.class));
			Team blueTeam = ctx.getBean(Team.class, env.getProperty("blue_team_name"), 
					env.getProperty("blue_team_lives", Integer.class));
			
			Random rand = new Random();
			System.out.println(redTeam.getName() + " VS " + blueTeam.getName());
			while(redTeam.getLives() > 0  && blueTeam.getLives() > 0) {
				int random = rand.nextInt(10) + 1;
				if(random <= 5) {
					blueTeam.setLives(blueTeam.getLives() - 1);
					System.out.println(blueTeam.getName() +" team now has " + blueTeam.getLives() + " lives!");
				} else {
					redTeam.setLives(redTeam.getLives() - 1);
					System.out.println(redTeam.getName() +" team now has " + redTeam.getLives() + " lives!");

				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
			
			if(redTeam.getLives()==0) {
				System.out.println(redTeam.getName() + " lost!!!");
			} else {
				System.out.println(blueTeam.getName() + " lost!!!");
			}
			
		}

	}

}

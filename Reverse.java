package mycontroller;

public class Reverse implements TurnMethod{
	
	public static void update(MyAIController controller, float delta) {
		
		if(controller.getVelocity() > 1);
		controller.applyReverseAcceleration();
		
		
	}

}

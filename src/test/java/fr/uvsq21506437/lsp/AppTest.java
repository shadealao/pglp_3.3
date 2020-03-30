package fr.uvsq21506437.lsp;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    
	public void testGetPosition() {
		ArrayList<Robot> Robots = new ArrayList<Robot>();
		Robots.add(new RobotType1(20));
		Robots.add(new RobotType2(20));
		for(int i = 0; i <Robots.size(); i++) Robots.get(i).avance();
		assertEquals(25, Robots.get(0).position);
		assertEquals(30, Robots.get(1).position);
		
	}
}

package fr.uvsq21506437.lsp;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * Ne respecte pas LSP car la classe fille RobotStatique ajoute au niveau de 
	 * la méthode avance une exception qui n'existe pas dans la classe mère
	 * 
	 * 
	 * Pour régler le pb robots statique n'est plus nue classe 
	 * fille de robot et on l'enlève donc de la liste Robots
	 */
    public static void main( String[] args )
    {
    	ArrayList<Robot> Robots = new ArrayList<Robot>();
		//Robots.add(new robotStatique(20));
		Robots.add(new RobotType1(20));
		Robots.add(new RobotType2(20));
		for(int i = 0; i <Robots.size(); i++) Robots.get(i).avance();
		for(int i = 0; i <Robots.size(); i++) System.out.println("position Robot de type "+(i+1)+" : "+Robots.get(i).position);
		
    }
}

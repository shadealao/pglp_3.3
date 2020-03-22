package fr.uvsq21506437.lsp;

/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * Ne respecte pas LSP car la classe fille RobotStatique ajoute au niveau de 
	 * la méthode avance une exception qui n'existe pas dans la classe mère
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

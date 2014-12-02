/**
 * 
 */
package mypgms;

/**
 * @author rejit_000
 *
 */
public class BiCycle {

	/**
	 */
	String color;
	int size;
	String charName;
	 
	public BiCycle(String girlColor,int girlSize,String girlCharName)
	{
		this.color = girlColor;
		this.size=girlSize;
		this.charName = girlCharName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiCycle bc= new BiCycle("purple",20,"TinkerBell");
		
		System.out.println("The Bicycle color is: " +bc.color);
		System.out.println("The size is:" +bc.size);
		System.out.println("The character name on the cycle is: "+bc.charName);

	}

}

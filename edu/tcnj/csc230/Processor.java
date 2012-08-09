/**Steven Kolln and Wade Glenn
Lab 09
4/21/12
Processor*/

package edu.tcnj.csc230;

import javafoundations.*;
import java.util.Scanner;

public class Processor
{
	private LinkedBinaryTree<String> tree;
	/**Creates strings for each response in the tree. Takes these strings and constructs a tree made from them*/
	public Processor()
	{
		String q1 = "Would you like to have a small snack?";
		String q2 = "Would you like to have a healthy snack?";
		String q3 = "Would you like to eat from home?";
		String q4 = "Do you want fruit?";
		String q5 = "Would you like to eat candy?";
		String q6 = "Would you like a manly meal?";
		String q7 = "Would you like fast food?";
		String q8 = "Do you want to eat a juicy fruit? (not the gum)";
		String q9 = "Do you want a granola bar?";
		String q10 = "Would you like skittles";
		String q11 = "Would you like to have chocolate";
		String q12 = "Would you like to use your grill?";
		String q13 = "Are you looking to lose weight?";
		String q14 = "Would you like to eat a cheap meal?";
		String q15 = "Would you like seafood?";
		String q16 = "Would you prefer a big fruit?";
		String q17 = "Do you like the color yellow?";
		String q18 = "Do you like nuts?";
		String q19 = "Do you want cereal?";
		String q20 = "Do you like things that are sour?";
		String q21 = "Have some starbursts!";
		String q22 = "Do you want to have penut butter in your chocolate?";
		String q23 = "Would you like cookies?";
		String q24 = "You should make a nice juicy steak!";
		String q25 = "Would you like to use your oven?";
		String q26 = "You should have a salad with vegetables!";
		String q27 = "Would you like to use your stove?";
		String q28 = "Would you like to eat a burger?";
		String q29 = "Would you like to eat chicken?";
		String q30 = "Would you like to eat Lobster?";
		String q31 = "Would you like to go to a family restaurant?";
		String q32 = "Have a watermelon!";
		String q33 = "Have some grapes!";
		String q34 = "Have a banana!";
		String q35 = "Have a rotten banana!";
		String q36 = "Have a kashi go lean bar!";
		String q37 = "Have a quaker oats bar!";
		String q38 = "Have some sour skittles!";
		String q39 = "Have some regular skittles!";
		String q40 = "Have some reeces penut butter cups!";
		String q41 = "Have a hershey chocolate bar!";
		String q42 = "Make some sugar cookies!";
		String q43 = "Have some chips!";
		String q44 = "Have some nice porkchops!";
		String q45 = "Now you're being lazy... go eat cereal or something.";
		String q46 = "Have some pasta with meatballs!";
		String q47 = "Cook your leftovers in the microwave!";
		String q48 = "You should eat at KFC!";
		String q49 = "You should eat at Smoothie King!";
		String q50 = "You should go to Red Lobster!";
		String q51 = "You should go to \nMcCormick & Schmick's Seafood Restaurant!";
		String q52 = "Have some cheerios!";
		String q53 = "Drink some water!(YUM!)";
		String q54 = "You should go to T.G.I Fridays!";
		String q55 = "You should go to your local bar!";
		String q56 = "You should go to McDonalds!";
		String q57 = "You should go to Sonic!!";
		
		LinkedBinaryTree<String> n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40, n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57;
		n32=new LinkedBinaryTree<String>(q32);
		n33=new LinkedBinaryTree<String>(q33);
		n16=new LinkedBinaryTree<String>(q16, n32, n33);
		n34=new LinkedBinaryTree<String>(q34);
		n35=new LinkedBinaryTree<String>(q35);
		n17=new LinkedBinaryTree<String>(q17, n34, n35);
		n8=new LinkedBinaryTree<String>(q8, n16, n17);
		n36=new LinkedBinaryTree<String>(q36);
		n37=new LinkedBinaryTree<String>(q37);
		n18=new LinkedBinaryTree<String>(q18, n36, n37);
		n52=new LinkedBinaryTree<String>(q52);
		n53=new LinkedBinaryTree<String>(q53);
		n19=new LinkedBinaryTree<String>(q19, n52, n53);
		n9=new LinkedBinaryTree<String>(q9, n18, n19);
		n4=new LinkedBinaryTree<String>(q4, n8, n9);
		n38=new LinkedBinaryTree<String>(q38);
		n39=new LinkedBinaryTree<String>(q39);
		n20=new LinkedBinaryTree<String>(q20, n38, n39);
		n21=new LinkedBinaryTree<String>(q21);
		n10=new LinkedBinaryTree<String>(q10, n20, n21);
		n40=new LinkedBinaryTree<String>(q40);
		n41=new LinkedBinaryTree<String>(q41);
		n22=new LinkedBinaryTree<String>(q22, n40, n41);
		n42=new LinkedBinaryTree<String>(q42);
		n43=new LinkedBinaryTree<String>(q43);
		n23=new LinkedBinaryTree<String>(q23, n42, n43);
		n11=new LinkedBinaryTree<String>(q11, n22, n23);
		n5=new LinkedBinaryTree<String>(q5, n10, n11);
		n2=new LinkedBinaryTree<String>(q2, n4, n5);
		n24=new LinkedBinaryTree<String>(q24);
		n44=new LinkedBinaryTree<String>(q44);
		n45=new LinkedBinaryTree<String>(q45);
		n25=new LinkedBinaryTree<String>(q25, n44, n45);
		n12=new LinkedBinaryTree<String>(q12, n24, n25);
		n26=new LinkedBinaryTree<String>(q26);
		n46=new LinkedBinaryTree<String>(q46);
		n47=new LinkedBinaryTree<String>(q47);
		n27=new LinkedBinaryTree<String>(q27, n46, n47);
		n13=new LinkedBinaryTree<String>(q13, n26, n27);
		n6=new LinkedBinaryTree<String>(q6, n12, n13);
		n56=new LinkedBinaryTree<String>(q56);
		n57=new LinkedBinaryTree<String>(q57);
		n28=new LinkedBinaryTree<String>(q28, n56, n57);
		n48=new LinkedBinaryTree<String>(q48);
		n49=new LinkedBinaryTree<String>(q49);
		n29=new LinkedBinaryTree<String>(q29, n48, n49);
		n14=new LinkedBinaryTree<String>(q14, n28, n29);
		n50=new LinkedBinaryTree<String>(q50);
		n51=new LinkedBinaryTree<String>(q51);
		n30=new LinkedBinaryTree<String>(q30, n50, n51);
		n54=new LinkedBinaryTree<String>(q54);
		n55=new LinkedBinaryTree<String>(q55);
		n31=new LinkedBinaryTree<String>(q31, n54, n55);
		n15=new LinkedBinaryTree<String>(q15, n30, n31);
		n7=new LinkedBinaryTree<String>(q7, n14, n15);
		n3=new LinkedBinaryTree<String>(q3, n6, n7);
		n1=new LinkedBinaryTree<String>(q1,n2,n3);
		tree=n1;

	}
	public void go()
	{
		ArrayIterator obj=(ArrayIterator) tree.preorder();
		while (obj.hasNext())
			System.out.println(obj.next());
	}
	public void start()
	{
		/**Best ascii art you will ever see*/
		System.out.println("                     |\\ /| /|_/|\n"+
        "                     |\\||-|\\||-/|/|\t\t FOOD PICKER MACHINE!\n"+
        "                    \\|\\|//||///\n"+
        "  _..----.._         |\\/\\||//||||\n"+
        ".'     o    '.       |||\\|/\\ ||\n"+
       "/   o       o  \\     | './\\_/.' |\n"+
      "|o        o     o|   |          |\n"+
      "/'-.._o     __.-'\\   |          |\n"+
      "\\      `````     /   |          |\n"+
      "|``--........--'`|    '.______.'\n"+
       "\\              /\n"+
        "`'----------'`\n\n");
		System.out.println("Let me help you find something good to eat\nEnter 'Y' if you agree and 'N' if you disagree\n");
		Scanner scan=new Scanner(System.in);
		boolean again=true, on=true;
		while (again)
		{
			/**Creates a LBT from the previous made in the constructor*/
			LinkedBinaryTree LBT=tree;
			/**Is always on until able to break out when hiting a leaf node.*/
			while (on)
			{
				/**Prints the elements string*/
				System.out.println(LBT.getRootElement());
				if(LBT.size()==1)
					break;
				String result="";
				result=scan.nextLine();
				try
				{
					result.charAt(0);
				}
				catch (StringIndexOutOfBoundsException e)
				{
					result="k";
				}
				while ("y".equalsIgnoreCase(String.valueOf(result.charAt(0)))==false&&"n".equalsIgnoreCase(String.valueOf(result.charAt(0)))==false)
				{
					System.out.println("Please enter 'y' if you agree and 'n' if you disagree");
					result=scan.nextLine();
					try
					{
						result.charAt(0);
					}
					catch (StringIndexOutOfBoundsException e)
					{
						result="k";
					}
				}
				/**If yes, go to the left and if no go to the right*/
				if ("y".equalsIgnoreCase(String.valueOf(result.charAt(0))))
				{
					LBT=LBT.getLeft();
					System.out.println("yes");
				}
				else
				{
					LBT=LBT.getRight();
					System.out.println("no");
				}
			}
			System.out.println("\n");
			String answer="";
			System.out.println("Are you still hungry? Enter 'y' for yes and 'n' for no.");
			answer=scan.nextLine();
			try
			{
				answer.charAt(0);
			}
			catch (StringIndexOutOfBoundsException e)
			{
				answer="k";
			}
			while ("y".equalsIgnoreCase(String.valueOf(answer.charAt(0)))==false&&"n".equalsIgnoreCase(String.valueOf(answer.charAt(0)))==false)
				{
					System.out.println("If you would like to go again please hit 'Y' if not hit 'N'");
					answer=scan.nextLine();
					try
					{
						answer.charAt(0);
					}
					catch (StringIndexOutOfBoundsException e)
					{
						answer="k";
					}
				}
			if ("n".equalsIgnoreCase(String.valueOf(answer.charAt(0))))
				again=false;
			System.out.println("\n\n\n");
		}
	}
}
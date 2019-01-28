
public class Main
{
    public static void main(String[] args) 
    {
	
	BinarySearchTree tree = new BinarySearchTree();
	tree.insert(10,"Ten");
	tree.insert(20,"Twenty");
	tree.insert(15,"Fifteen");
	
	System.out.println(tree.findMin().key);
	System.out.println(tree.findMax().key);
	System.out.println(tree.deleteNode(10));// print true
	System.out.println(tree.findMin().key);// now minimum should be 15
	
	
	}
}  

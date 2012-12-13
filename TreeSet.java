import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

class TreeSet<T extends Comparable<T>> {
  
	private static class Node<T> {
		private T item;
		private Node<T> left; 
		private Node<T> right; 
	
		Node(T item0, Node<T> left0, Node<T> right0) {
			item = item0;
			left = left0;
			right = right0;
		}
	}
	
	private Node<T> root = null;
	private int numItems = 0; 

	public int size() {
		return numItems;
	}
	
	public boolean add(T item) {
		int numItems0 = numItems;
		root = add(root, item);
		return numItems0 < numItems;
	}
	
	private Node<T> add(Node<T> p, T item) {
		if(p == null) {
			numItems++;
			return new Node<T>(item,null,null);
		} else if(p.item.compareTo(item)>0) {
			p.left = add(p.left,item); 
			return p;
		} else if(p.item.compareTo(item)<0) {
			p.right = add(p.right,item);
			return p;
		} else {
			return p;
		}
	}
	
	public T first() {
		if(root == null) {
			return null;
		}
		Node<T> p = root;
		while(p.left!=null) {
			p = p.left;
		}
		return p.item;
	}
	
	public T pollFirst() {
		if(root.left == null) {
			T item = root.item;
			root = null;
			return item;
		}
		
		Node<T> parent = null;
		Node<T> p = root;
		
		while(p!=null && p.left!=null) {
			parent = p;
			p = p.left;
		}
		
		T item = p.item;
		
		if(p.right != null) {
			parent.left = p.right;
		} else {
			parent.left = null;
		}
		
		return item;
	}
	
	public ArrayList<T> breadthFirst() {
		ArrayList<T> result = new ArrayList<T>();
		Queue<Node<T>> myNode = new Queue<Node<T>>();
		myNode.enq(root);
		while(!myNode.isEmpty()) {
			Node<T> p = myNode.deq();
			if(p!=null) {
				result.add(p.item);
				myNode.enq(p.left);
				myNode.enq(p.right);
			}
		}
		return result;
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node<T> p) {
		if(p == null) {
			return 0;
		}
		return 1 + Math.max(height(p.left), height(p.right));
	}
	
	public int count(T lo, T hi) {
		return count(root,lo,hi);
	}
	
	private int count(Node<T> p, T lo, T hi) {
		if(p == null) {
			return 0;
		}
		else if(hi.compareTo(p.item) > 0 && lo.compareTo(p.item) < 0) {
			return 1 + count(p.left,lo,hi) + count(p.right,lo,hi);
		}
		return count(p.left,lo,hi) + count(p.right,lo,hi);
	}
	
	public boolean contains(T item) {
		return contains(root, item);
	}
	
	private boolean contains(Node<T> p, T item) {
		if(p == null) {
			return false;
		} else if(p.item.compareTo(item)>0) {
			return contains(p.left,item); 
		} else if(p.item.compareTo(item)<0) {
			return contains(p.right,item);
		} else {
			return true;
		}
	}
	
	public void displayTree() {
        displayTree(root);
    }
	
	private void displayTree(Node<T> root) {
        int maxLevel = maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }
	
	public String toString() {
		String str = "";
		Stack<Node<T>> myNodes = new Stack<Node<T>>();
		myNodes.push(root);
		while(!myNodes.isEmpty()) {
			Node<T> p = myNodes.pop();
			if(p!=null) {
				myNodes.push(p.right);
				myNodes.push(p.left);
				str = str + p.item + ", ";
			}
		}
		return "[ " + str.substring(0,str.length()-2) + " ]";
	}
	
	
	
	 private  void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {	
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }

        int floor           =   maxLevel - level;
        int edgeLines      =  (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces     =  (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces   =  (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);
        List<Node<T>> newNodes = new ArrayList<Node<T>>();

        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.item);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
            printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i);

                if (nodes.get(j) == null) {
                    printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null) {
                    System.out.print("/");
                } else {
                    printWhitespaces(1);
                }

                printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null) {
                    System.out.print("\\");
                } else {
                    printWhitespaces(1);
                }
                printWhitespaces(edgeLines + edgeLines - i);
            }
            System.out.println("");
        }
        printNodeInternal(newNodes, level + 1, maxLevel);
    }
	
	private  void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
	
	private  int maxLevel(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }
	
	private  boolean isAllElementsNull(List<Node<T>> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }
        return true;
    }
}

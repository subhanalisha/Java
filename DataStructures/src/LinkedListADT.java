
class LinkedList{
int data;
LinkedList nextNode;

public LinkedList(int data){
	this.data=data;
}

public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public LinkedList getNextNode() {
	return nextNode;
}
public void setNextNode(LinkedList nextNode) {
	this.nextNode = nextNode;
}
}
public class LinkedListADT{
	
	LinkedList headNode;
	
	public void insertAtFront(LinkedList newNode){
		
		if(headNode!=null){
			newNode.nextNode=this.headNode;
			this.headNode=newNode;
		}
		else
			this.headNode=newNode;
	}
	public void insertAtEnd(LinkedList newNode){
		if(headNode!=null){
			LinkedList tempHeadNode=this.headNode;
			while(tempHeadNode.nextNode!=null)
				tempHeadNode=tempHeadNode.nextNode;
			
			tempHeadNode.nextNode=newNode;
		}
		else
			this.headNode=newNode;
		
	}
	public void insertAtMiddle(int position,LinkedList newNode){
		// assumption: p nodes exits
		
		LinkedList tempHeadNode = this.headNode;
		int pos=position;
		while(pos-2!=0){
			pos--;
		tempHeadNode=tempHeadNode.nextNode;
		}
		newNode.nextNode=tempHeadNode.nextNode;
		tempHeadNode.nextNode=newNode;
		
	}
	public void display(){
		LinkedList tempHeadNode=this.headNode;
		while(tempHeadNode!=null){
			System.out.print(tempHeadNode.data+" ");
			tempHeadNode=tempHeadNode.nextNode;
		}
	}
	
	public static void main(String args[]){
		LinkedListADT listADT=new LinkedListADT();
		
		// test insert at front
		//for(int i=1;i<=10;i++)
			//listADT.insertAtFront(new LinkedList(i));
		//test insert at end
		
		//for(int i=1;i<=10;i++)
			//listADT.insertAtEnd(new LinkedList(i));
		
		
		//test insert at middel
		
			for(int i=1;i<=10;i++)
				listADT.insertAtEnd(new LinkedList(i));
			
			listADT.insertAtEnd(new LinkedList(12));
			listADT.insertAtMiddle(11, new LinkedList(11));
			
			
		
		
		listADT.display();
			
	}
	
}

package codingInterviewGuide.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CatDogAsylum {

	
	
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
    	class Animal{
            int id;
            int order;
            
            public Animal(int id, int order){
                this.id = id;
                this.order = order;
            }
        }
    	
    	ArrayList<Integer> res = new ArrayList<>();
    	Queue<Animal> cat = new LinkedList<>();
    	Queue<Animal> dog = new LinkedList<>();
    	int order = 0;
        for(int i=0; i < ope.length; i++) {
        	if(ope[i][0] == 1) {
        		if(ope[i][1]>0) {
        			dog.offer(new Animal(ope[i][1], order++));
        		}else {
        			cat.offer(new Animal(ope[i][1], order++));
        		}
        	}else if(ope[i][0] == 2) {
        		if(ope[i][1]==0) {
        			if(dog.isEmpty()&&cat.isEmpty()) continue;
        			if(dog.isEmpty() || cat.isEmpty()) {
        				if (!dog.isEmpty()) {
							res.add(dog.poll().id);
						}else {
							res.add(cat.poll().id);
						}
        			}else {
        				if(dog.peek().order < cat.peek().order) {
            				res.add(dog.poll().id);
            			}else {
    						res.add(cat.poll().id);
    					}
        			}
        		}else if (ope[i][1]==1) {
        			if(!dog.isEmpty())
        				res.add(dog.poll().id);					
				}else if (ope[i][1]==-1) {
					if(!cat.isEmpty())
						res.add(cat.poll().id);
				}
        	}
        }
    	
    	return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	}

}

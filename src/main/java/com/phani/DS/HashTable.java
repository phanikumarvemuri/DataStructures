package com.phani.DS;

public class HashTable {
	
	HashNode[] table;
	int size;
	 
	HashTable(int size)
	{
		this.size=size;
		this.table=new HashNode[this.size];
	}
	
	
public int hash(String paramobject)
{
	return paramobject.hashCode()%this.size;
}
	

public void put(String key1,int value1)
{
	String key = key1;
	int value= value1;
	try
	{
		if(key==null)
		{
			throw new NullPointerException();
		}
		else
		{
			
			int hash = hash(key);
			HashNode[] entry = this.table;
			HashNode localentry = entry[hash];
			if(localentry == null)
			{
				entry[hash] = new HashNode(key,value,null);
				return;
			}
			else
			{
				 HashNode temp = entry[hash];
				for(localentry= entry[hash]; localentry != null;localentry=localentry.next)
				{
					
					
					if(localentry.key.equals(key))
						
					{
						localentry.value=value;
						return;
					}
				temp = localentry;	
				}
			
			temp.next= new HashNode(key,value,null);
		}
	}
	}
	catch (Exception e)
	{
		throw new NullPointerException(e.getMessage());
	}
		
}

public String toString()
{
	String newline = System.getProperty("line.seperator");
   for(int i=0;i<this.size;i++)
   {
	   for(HashNode localentry = this.table[i];localentry!=null;localentry=localentry.next)
	   {
		   System.out.println( "{"+localentry.key + ","+ localentry.value + "}");
	   }
	   System.out.println(newline);
	   
   }
   return null;
}
	public static void main(String [] args)
	{
		HashTable ht = new HashTable(11);
		ht.put("apple", 1);
		ht.put("ball", 2);
		ht.put("apple", 2);
		ht.put("cat",3);
		ht.put(null, 10);
		System.out.println(ht);
		
	}

}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class GetData {
	
	
	public static void main(String args[])
	{
		
		File txtFile=new File("itemDetail.txt");
		String getFileData;
		String[] dataArray;
		String itemId,name,stock,price;
		
		itemId="ItemId";
		name="Item Name";
		stock="Stock";
		price="Price";
		String updatedString;
		
		try
		{
			if(txtFile.exists())
			{
				//Reading file 
				FileReader fr=new FileReader(txtFile);
				BufferedReader brf=new BufferedReader(fr);
				
				getFileData=brf.readLine();
				//Writing to the file
				FileWriter fw=new FileWriter(txtFile);
				BufferedWriter bw=new BufferedWriter(fw);
				
				
				
				
				System.out.println(getFileData);
				while(getFileData!=null)
				{
					dataArray=getFileData.split(",");
					if(dataArray[0].equals("1"))
					{
						updatedString="";
						dataArray[2]="333";
						
						for(int k=0;k<dataArray.length;k++)
						{
							updatedString+=dataArray[k]+",";
						}
							
						System.out.println("Updated String"+updatedString);
						bw.write(updatedString+"");
						
						
					}
					else
					{
						bw.write(getFileData+"\n");
						
					}
					getFileData=brf.readLine();
					dataArray=null;
				}
				bw.flush();
				bw.close();
				/*System.out.printf("%-10s  %-40s %-5s %-5s\n",itemId,name,stock,price);
				while(getFileData!=null)
				{
					
					//Storing each value in to array
					dataArray=getFileData.split(",");
					
					//Printing all the values individually
					
					for(int i=0;i<dataArray.length;i++)
					{
						if(i==0)
						{
							System.out.printf("%-10s",dataArray[i]);
						}
						else if(i==1)
						{
							System.out.printf("%-40s", dataArray[i]);
						}
						else if(i==2)
						{
							System.out.printf("%s", dataArray[i]);
						}
						else
						{
							System.out.printf("%-5s",dataArray[i]);
						}
						
					}
					System.out.printf("\n");
					
					//Printing the data of the file
					
					getFileData=brf.readLine();
				}*/
				//Getting data from a file and storing it in String
				
				
			}
			else
			{
				System.out.println("File not exists");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Problem with File reading:"+e.getMessage());
			e.printStackTrace();
		}
		
	}

	
}
	
	
	

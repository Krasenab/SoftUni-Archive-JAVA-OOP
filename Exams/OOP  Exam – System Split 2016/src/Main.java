import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import systemSplit.ExpressSoftware;
import systemSplit.Hardware;
import systemSplit.Software;
import systemSplit.HeavyHardware;
import systemSplit.LightSoftware;

public class Main {

	public static void main(String[] args) {
		
		Map<Hardware,List<Software>> db = new HashMap<>();		
		Scanner sc = new Scanner(System.in);		
		String inputArr = sc.nextLine();
		
		while(!inputArr.equals("System Split")) 
		{
			String isRelease = inputArr.substring(0, 7);
			
			if(isRelease.equals("Release")) 
			{
				//System.out.println("Release");
				String releseInformation = inputArr.substring(inputArr.indexOf('(') + 1,inputArr.indexOf(')'));
				String[] data = releseInformation.split(", ");
				String hardwareName = data[0];
				String softwareName = data[1];
				release(db,hardwareName,softwareName);
			}
			else if(inputArr.equals("Analyze()")) 
			{
				System.out.println("Loading analyze");
				analyze(db);
			}
			else {
				
				String componentInfo = inputArr.substring(8);
				String realCommponetns = "";
				 for(int a = 0;a<componentInfo.length();a++) 
				 {
					char currentChar =  componentInfo.charAt(a);
					if(currentChar=='(') 
					{
						break;
					}
					realCommponetns += currentChar;
				 }
				 //System.out.println(realCommponetns);
				 
				 String data = inputArr.substring(inputArr.indexOf('(') + 1, inputArr.lastIndexOf(')'));
				 String[] dataInfo =data.split(", "); 
				 if(realCommponetns.equals("HeavyHardware")) 
				 {
					 
					 String name = dataInfo[0];
					 int capacity = Integer.parseInt(dataInfo[1]);
					 int memory = Integer.parseInt(dataInfo[2]);
					 String type = "Heavy";
					 
					 Hardware h = new HeavyHardware(name,capacity,memory,type);
					 db.put(h, null);
					 			 
				 }
				 else if(realCommponetns.equals("PowerHardware")) 
				 {
					 
					 String name = dataInfo[0];
					 int capacity = Integer.parseInt(dataInfo[1]);
					 int memory = Integer.parseInt(dataInfo[2]);
					 Hardware pH = new HeavyHardware(name,capacity,memory,"Power");
					 db.put(pH, null);
				 }
				 else if(realCommponetns.equals("LightSoftware")) 
				 {
					 String nameOfHardware = dataInfo[0];
					 String nameSoft = dataInfo[1];
					 int capacity = Integer.parseInt(dataInfo[2]);
					 int memory = Integer.parseInt(dataInfo[3]);			 
					 LightSoftware lS = new LightSoftware(nameSoft,capacity,memory,"Light");
					 addSoftwareToHardware(db,nameOfHardware,lS);
					 			 
				 }
				 else if(realCommponetns.equals("LightSoftware")) 
				 {
					 String nameOfHardware = dataInfo[0];
					 String nameSoft = dataInfo[1];
					 int capacity = Integer.parseInt(dataInfo[2]);
					 int memory = Integer.parseInt(dataInfo[3]);			 
					 Software lS = new LightSoftware(nameSoft,capacity,memory,"Light");
					 addSoftwareToHardware(db,nameOfHardware,lS);
					 			 
				 }
				 else if(realCommponetns.equals("ExpressSoftware")) 
				 {
					 String nameOfHardware = dataInfo[0];
					 String nameSoft = dataInfo[1];
					 int capacity = Integer.parseInt(dataInfo[2]);
					 int memory = Integer.parseInt(dataInfo[3]);			 
					 Software eS = new ExpressSoftware(nameSoft,capacity,memory,"Express");
					 addSoftwareToHardware(db,nameOfHardware,eS);
				 }
				 
			}
			
			
						 
			 inputArr = sc.nextLine();
		}
			 
		// printMap(db);
	}
	public static void addSoftwareToHardware(Map<Hardware,List<Software>> inputDb,String hardwareName,Software sf) 
	{
		for(Hardware h:inputDb.keySet()) 
		{
			if(h.getName().equals(hardwareName)) 
			{
			   inputDb.computeIfAbsent(h, valueKey -> new ArrayList<>()).add(sf);
			}
		}
	}
	public static void printMap(Map<Hardware,List<Software>> inputDb) 
	{
		for(Map.Entry<Hardware,List<Software>> hAndS:inputDb.entrySet()) 
		{
			Hardware h = hAndS.getKey();
			System.out.println("Hardware info: " + h.getName() + " " + h.getMaximumCapacity() + " " + h.getMaximumMomory());
			List<Software> s = hAndS.getValue();
			if(s.size()!=0) 
			{
				for(Software sSmall:s) 
				{
					System.out.println("------Software name: " + sSmall.getName() + " data:" + sSmall.getCapacityConsumption() + " " + sSmall.getMemoryConsumption() + " " + sSmall.getType());
				}
			}
			
		}
	}
	public static void release(Map<Hardware,List<Software>> dbInput,String nameHardware,String nameSoftware) 
	{
	
		
		for(Map.Entry<Hardware,List<Software>> data: dbInput.entrySet()) 
		{
			Hardware h = data.getKey();
			List<Software> sList = data.getValue();
			if(sList.size()<=0) 
			{
				return;
			}
			for(Software soft: sList) 
			{
				if(soft.getName().equals(nameSoftware)) 
				{
					sList.remove(soft);
				}
			}
			
		}
	}
	public static void  analyze(Map<Hardware,List<Software>> db) 
	{
		StringBuilder sb = new StringBuilder();
		int countHard = 0;
		int countSoft = 0;
		int totalOperationalMemoryInUse = 0;
		int totalCapacityTaken = 0; 
		int hardMemo = 0;
		int hardCapa= 0;
		sb.append("System Analysis \n");
		for(Map.Entry<Hardware,List<Software>> d:db.entrySet()) 
		{
			countHard++;
			List<Software> sl = d.getValue();
			if(sl !=null) 
			{
				countSoft += sl.size();
				for(Software sf: sl) 
				{
					totalOperationalMemoryInUse+= sf.getMemoryConsumption();
					totalCapacityTaken += sf.getCapacityConsumption();
				}				
			}
			hardMemo += d.getKey().getMaximumMomory();
			hardCapa += d.getKey().getMaximumCapacity();
		}
		sb.append("Hardware Components: " + countHard+ "\n");
		sb.append("Software Components: " + countSoft + "\n");
		sb.append("Total Operational Memory: " +totalOperationalMemoryInUse +"/"+hardMemo+ "\n");
		sb.append("Total Capacity Taken:" + totalCapacityTaken +  "/" + hardCapa +"\n");
		
		System.out.println(sb);
	}

}

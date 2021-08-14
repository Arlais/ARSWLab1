package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class BlackThread extends Thread{
	
	private int inicio;
	private int fin;
	private String ip;
	private int count;
	LinkedList<Integer> servers=new LinkedList<>();
	
	public BlackThread(int i, int f, String ipb){
		inicio=i;
		fin=f;
		ip=ipb;
		count=0;
	}
	
	public void run() {
		for(int i=inicio;i<fin;i++) {
			if (HostBlacklistsDataSourceFacade.getInstance().isInBlackListServer(i, ip)) {
				count+=1;
				servers.add(i);
			}
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public LinkedList<Integer> getServers() {
		return servers;
	}
}

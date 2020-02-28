package io.cucumber.skeleton;

public class Belly {
	public int total_cukes;
	public int total_wait_time;
	public int total_growl;
	
    public void eat(int cukes) {
    	total_cukes += cukes;
    	
    }
    public void wait(int time) {
    	total_wait_time += time;
    }
    public void growl() {
    	total_growl += 1;
    }
}

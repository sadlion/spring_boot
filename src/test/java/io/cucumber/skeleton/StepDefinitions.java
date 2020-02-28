package io.cucumber.skeleton;

//import com.hppk.cucumber.hello.Bag;

import io.cucumber.skeleton.Belly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	private final Belly belly = new Belly();
	
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        //Belly belly = new Belly();
        belly.eat(cukes);
    }
    
    @When("I wait {int} hour")
    public void i_wait_hour(int int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	//Belly belly = new Belly();
        belly.wait(int1);
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	//Belly belly = new Belly();
        belly.growl();
    }
    
}

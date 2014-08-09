package pe.com.mcordova.actions;

public class HelloWorldAction{
	   private String name;

	   public String execute() throws Exception {
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	}
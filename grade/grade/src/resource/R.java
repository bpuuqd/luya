package resource;

import java.util.Scanner;

import controller.Controller;
import model.Dao;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Search;

public interface R {
	int MAX = 100;
	Controller controller = new Controller();
	Input input = new Input();
	Output output = new Output();
	Menu menu = new Menu();
	Data data = new Data();
	Search search = new Search();
	Modify modify = new Modify();
	Delete delete = new Delete();
	
	
	
	Dao dao = Dao.getInstance();
	
	Scanner scan = new Scanner(System.in);
}

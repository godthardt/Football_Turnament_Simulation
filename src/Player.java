

import java.io.Serializable;
import java.sql.Date;

public class Player extends Person implements Serializable {
	private static final long serialVersionUID = 1;  //Helps class control version of serialized objects
	public Player(String name) {
		super();
		this.name = name;
		id = nextId++;
	}

@Override
public String toString() {
	return name;
}
}

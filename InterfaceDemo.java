
public class InterfaceDemo {
	public static void main(String[] args) {
		Database db=null;
		try{
		Class klass=Class.forName(args[0]);
		db=(Database)klass.newInstance();
		}catch(Exception e){}
		db.connect();
		db.disconnect();
	}

}

interface Database {
void connect();
void disconnect();
}

class OracleDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("connected to Oracle Database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from Oracle Database");
	}

}

class SqlServerDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("connected to SQLserver Database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from SQLserver Database");
	}

}

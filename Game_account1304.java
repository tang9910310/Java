package game;
public class Game_account{
	private String account;
	private String password;
	static int KeyID = 0;
	private int UID;
    
	public Game_account() {
		this(null, null);
	}
	public Game_account(String account, String password) {
		setGame_account(account, password);
	}
	public Game_account(Game_account game) {
		this(game.get_Account(), game.get_Password());
	}
	public void setGame_account(String account, String password) {
		set_Account(account);
		set_Password(password);
	}
	private void set_Account(String name) {
		account = name;
	}
	private void set_Password(String name) {
		password = name;
	}
	public String get_Account() {
		return account;
	}
	public String get_Password() {
		KeyID++;
		return password;
	}
	public int get_KeyID() {
		return KeyID;
	}
	public int get_UID() {
		return UID = 1105108100 + KeyID;
	}
    public void showProfile(){
    	System.out.println("您的帳號：" + account);
    	System.out.println("您的密碼：" + password);
    	System.out.println("您的識別碼：" + get_UID());
    }
}
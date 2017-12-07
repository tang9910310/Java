class Game_account{
	final String account;
	private String password;
	final String date;
	static int KeyID = 2;
	private int UID;
    
	public Game_account() {
		this(null, null);
	}
	public Game_account(String account, String password) {
		this.account = account;
		set_Password(password);
		this.date = null;
	}
	public Game_account(String account, String password, String date) {
		this.account = account;
		this.date = date;
		set_Password(password);
	}
	public Game_account(Game_account game) {
		this(game.get_Account(), game.get_Password(), game.get_Date());
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
	public String get_Date() {
		return date;
	}
    public void showProfile(){
    	System.out.println("您的帳號：" + account);
    	System.out.println("您的密碼：" + password);
    	System.out.println("您的識別碼：" + get_UID());
    	System.out.println("您建立的時間：" + date);
    }
}
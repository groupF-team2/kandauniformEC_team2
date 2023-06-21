package dto;

public class admin {

	// 管理者ID
	private String adminId;
	// ユーザーネーム
	private String adminName;
	// パスワード
	private String adminPass;

	public admin() {
		// コンストラクタ
		this.adminId = null;
		this.adminName = null;
		this.adminPass = null;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
}

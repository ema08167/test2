package com.internousdev.ecsite.dto;

		public class LoginDTO {
		private String loginId;
		private String loginPassword;
		private String userName;
		private boolean loginFig=false;

		public String getLoginId(){
			return loginId;
		}

		public void setLoginId(String loginId){
			this.loginId=loginId;
		}

		public String getLogtinPassword(){
			return loginPassword;
		}

		public void setLoginPassword(String loginPassword){
			this.loginPassword=loginPassword;
		}

		public String getUserName(){
			return userName;
		}

		public void setUserName(String userName){
			this.userName=userName;
		}

		public boolean getLoginFig(){
			return loginFig;
		}

		public void setLoginFig(boolean loginFig){
			this.loginFig=loginFig;
	}
}

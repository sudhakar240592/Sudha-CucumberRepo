package com.util;

import com.FunctionalLibraries.Base;
import com.pom.Fblogin;
import com.pom.VerifyLogin;
import com.pom.VerifyReservationPage;
import com.pom.VerifySelectPage;

public class SingletonManager extends Base {

	private VerifyLogin vl;

	public VerifyLogin getVl() {
		if (vl == null) {
			vl = new VerifyLogin();
		}
		return vl;
	}

	private VerifyReservationPage vr;

	public VerifyReservationPage getVr() {
		if (vr == null) {
			vr = new VerifyReservationPage();
		}
		return vr;
	}

	private VerifySelectPage vs;

	public VerifySelectPage getVs() {
		if (vs == null) {
			vs = new VerifySelectPage();
		}
		return vs;
	}

	private Fblogin fb;

	public Fblogin getFb() {
		if (fb == null) {
			fb = new Fblogin();
		}
		return fb;
	}
}

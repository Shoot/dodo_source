package com.android.volley;

import android.content.Intent;
/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {
    private Intent c;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.c != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public AuthFailureError(iw6 iw6Var) {
        super(iw6Var);
    }
}

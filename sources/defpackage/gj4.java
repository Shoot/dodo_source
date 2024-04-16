package defpackage;

import androidx.annotation.NonNull;
/* renamed from: gj4  reason: default package */
/* loaded from: classes.dex */
public enum gj4 {
    NETWORK_ERROR(7, "No internet connection"),
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    RATE_LIMITED(31, "Rate Limited"),
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    ERROR(29, "Unknown error");
    
    private final int a;
    private final String b;

    gj4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @NonNull
    public static gj4 a(int i) {
        gj4[] values;
        for (gj4 gj4Var : values()) {
            if (gj4Var.a == i) {
                return gj4Var;
            }
        }
        throw new RuntimeException("Unsupported error id: " + i);
    }

    public int i() {
        return this.a;
    }

    public String k() {
        return this.b;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.b;
    }
}

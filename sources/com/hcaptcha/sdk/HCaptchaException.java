package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;
/* loaded from: classes.dex */
public class HCaptchaException extends Exception {
    private final gj4 a;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaException(gj4 gj4Var) {
        this.a = gj4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean a(@Nullable Object obj) {
        return obj instanceof HCaptchaException;
    }

    public gj4 b() {
        return this.a;
    }

    public int c() {
        return this.a.i();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj;
        if (!hCaptchaException.a(this) || !super.equals(obj)) {
            return false;
        }
        gj4 b = b();
        gj4 b2 = hCaptchaException.b();
        if (b != null ? b.equals(b2) : b2 == null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a.k();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode();
        gj4 b = b();
        int i = hashCode2 * 59;
        if (b == null) {
            hashCode = 43;
        } else {
            hashCode = b.hashCode();
        }
        return i + hashCode;
    }

    @Override // java.lang.Throwable
    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaException(hCaptchaError=" + b() + ")";
    }
}

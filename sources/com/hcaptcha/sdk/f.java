package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import lombok.Generated;
/* loaded from: classes.dex */
class f implements Serializable {
    private zr4 a;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    /* loaded from: classes.dex */
    public static class a {
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean a;
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private zr4 b;

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public f a() {
            zr4 zr4Var = this.b;
            if (!this.a) {
                zr4Var = f.b();
            }
            return new f(zr4Var);
        }

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "HCaptchaInternalConfig.HCaptchaInternalConfigBuilder(htmlProvider$value=" + this.b + ")";
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public f(zr4 zr4Var) {
        this.a = zr4Var;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private static zr4 a() {
        return new e();
    }

    public static /* synthetic */ zr4 b() {
        return a();
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static a c() {
        return new a();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean d(@Nullable Object obj) {
        return obj instanceof f;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public zr4 e() {
        return this.a;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!fVar.d(this)) {
            return false;
        }
        zr4 e = e();
        zr4 e2 = fVar.e();
        if (e != null ? e.equals(e2) : e2 == null) {
            return true;
        }
        return false;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int hashCode;
        zr4 e = e();
        if (e == null) {
            hashCode = 43;
        } else {
            hashCode = e.hashCode();
        }
        return hashCode + 59;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + e() + ")";
    }
}

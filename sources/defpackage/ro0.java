package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CaptchaSettings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lro0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "verificationKey", "Lyxb;", "Lyxb;", c.a, "()Lyxb;", "verificationProvider", "Lpo0;", "Lpo0;", "()Lpo0;", "mode", "<init>", "(Ljava/lang/String;Lyxb;Lpo0;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ro0  reason: default package */
/* loaded from: classes.dex */
public final class ro0 {
    private final String a;
    private final yxb b;
    private final po0 c;

    public ro0(String str, yxb yxbVar, po0 po0Var) {
        z65.h(str, "verificationKey");
        z65.h(yxbVar, "verificationProvider");
        z65.h(po0Var, "mode");
        this.a = str;
        this.b = yxbVar;
        this.c = po0Var;
    }

    public final po0 a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final yxb c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro0)) {
            return false;
        }
        ro0 ro0Var = (ro0) obj;
        if (z65.c(this.a, ro0Var.a) && this.b == ro0Var.b && this.c == ro0Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CaptchaSettings(verificationKey=" + this.a + ", verificationProvider=" + this.b + ", mode=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

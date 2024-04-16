package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: NeedCaptchaDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\t\u0010\u0010¨\u0006\u0013"}, d2 = {"Lev6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "verificationKey", "I", c.a, "()I", "verificationProvider", "mode", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ev6  reason: default package */
/* loaded from: classes.dex */
public final class ev6 {
    @uca("verificationKey")
    private final String a;
    @uca("verificationProvider")
    private final int b;
    @uca("mode")
    private final int c;

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev6)) {
            return false;
        }
        ev6 ev6Var = (ev6) obj;
        if (z65.c(this.a, ev6Var.a) && this.b == ev6Var.b && this.c == ev6Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        return "NeedCaptchaDto(verificationKey=" + str + ", verificationProvider=" + i + ", mode=" + i2 + ")";
    }
}

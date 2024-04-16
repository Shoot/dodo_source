package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: NativeChatUser.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lau6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "firstName", c.a, "lastName", "Lf28;", DateTokenConverter.CONVERTER_KEY, "Lf28;", "()Lf28;", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf28;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: au6  reason: default package */
/* loaded from: classes.dex */
public final class au6 {
    private final String a;
    private final String b;
    private final String c;
    private final f28 d;

    public au6(String str, String str2, String str3, f28 f28Var) {
        z65.h(str, "id");
        z65.h(str2, "firstName");
        z65.h(str3, "lastName");
        z65.h(f28Var, "phone");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f28Var;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final f28 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au6)) {
            return false;
        }
        au6 au6Var = (au6) obj;
        if (z65.c(this.a, au6Var.a) && z65.c(this.b, au6Var.b) && z65.c(this.c, au6Var.c) && z65.c(this.d, au6Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        f28 f28Var = this.d;
        return "NativeChatUser(id=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", phone=" + f28Var + ")";
    }
}

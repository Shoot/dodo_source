package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Check.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0018"}, d2 = {"Lz21;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lp31;", "b", "Lp31;", "()Lp31;", MessageAttributes.TYPE, c.a, RemoteMessageConst.Notification.URL, "<init>", "(Ljava/lang/String;Lp31;Ljava/lang/String;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z21  reason: default package */
/* loaded from: classes2.dex */
public final class z21 implements Serializable {
    private final String a;
    private final p31 b;
    private final String c;

    public z21(String str, p31 p31Var, String str2) {
        z65.h(str, "id");
        z65.h(p31Var, MessageAttributes.TYPE);
        z65.h(str2, RemoteMessageConst.Notification.URL);
        this.a = str;
        this.b = p31Var;
        this.c = str2;
    }

    public final p31 a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        if (z65.c(this.a, z21Var.a) && this.b == z21Var.b && z65.c(this.c, z21Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        p31 p31Var = this.b;
        String str2 = this.c;
        return "Check(id=" + str + ", type=" + p31Var + ", url=" + str2 + ")";
    }
}

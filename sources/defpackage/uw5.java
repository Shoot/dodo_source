package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: LogRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Luw5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "requestId", "b", "deviceId", "Lddc;", "Lddc;", "()Lddc;", RemoteMessageConst.FROM, DateTokenConverter.CONVERTER_KEY, RemoteMessageConst.TO, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lddc;Lddc;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uw5  reason: default package */
/* loaded from: classes.dex */
public final class uw5 {
    private final String a;
    private final String b;
    private final ddc c;
    private final ddc d;

    public uw5(String str, String str2, ddc ddcVar, ddc ddcVar2) {
        z65.h(str, "requestId");
        z65.h(str2, "deviceId");
        z65.h(ddcVar, RemoteMessageConst.FROM);
        z65.h(ddcVar2, RemoteMessageConst.TO);
        this.a = str;
        this.b = str2;
        this.c = ddcVar;
        this.d = ddcVar2;
    }

    public final String a() {
        return this.b;
    }

    public final ddc b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final ddc d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw5)) {
            return false;
        }
        uw5 uw5Var = (uw5) obj;
        if (z65.c(this.a, uw5Var.a) && z65.c(this.b, uw5Var.b) && z65.c(this.c, uw5Var.c) && z65.c(this.d, uw5Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LogRequest(requestId=" + this.a + ", deviceId=" + this.b + ", from=" + this.c + ", to=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

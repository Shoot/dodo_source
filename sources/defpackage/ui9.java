package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.net.Proxy;
import kotlin.Metadata;
/* compiled from: RequestLine.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lui9;", "", "Lhi9;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lsq4;", RemoteMessageConst.Notification.URL, c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ui9  reason: default package */
/* loaded from: classes3.dex */
public final class ui9 {
    public static final ui9 a = new ui9();

    private ui9() {
    }

    private final boolean b(hi9 hi9Var, Proxy.Type type) {
        if (!hi9Var.g() && type == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public final String a(hi9 hi9Var, Proxy.Type type) {
        z65.h(hi9Var, "request");
        z65.h(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(hi9Var.h());
        sb.append(' ');
        ui9 ui9Var = a;
        if (ui9Var.b(hi9Var, type)) {
            sb.append(hi9Var.l());
        } else {
            sb.append(ui9Var.c(hi9Var.l()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public final String c(sq4 sq4Var) {
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        String c = sq4Var.c();
        String e = sq4Var.e();
        if (e != null) {
            return c + '?' + e;
        }
        return c;
    }
}

package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import kotlin.Metadata;
/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lnq4;", "", "", "method", "", "a", e.a, "b", DateTokenConverter.CONVERTER_KEY, c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: nq4  reason: default package */
/* loaded from: classes3.dex */
public final class nq4 {
    public static final nq4 a = new nq4();

    private nq4() {
    }

    public static final boolean a(String str) {
        z65.h(str, "method");
        if (!z65.c(str, NetworkHandler.POST) && !z65.c(str, "PATCH") && !z65.c(str, NetworkHandler.PUT) && !z65.c(str, NetworkHandler.DELETE) && !z65.c(str, "MOVE")) {
            return false;
        }
        return true;
    }

    public static final boolean b(String str) {
        z65.h(str, "method");
        if (!z65.c(str, NetworkHandler.GET) && !z65.c(str, NetworkHandler.HEAD)) {
            return true;
        }
        return false;
    }

    public static final boolean e(String str) {
        z65.h(str, "method");
        if (!z65.c(str, NetworkHandler.POST) && !z65.c(str, NetworkHandler.PUT) && !z65.c(str, "PATCH") && !z65.c(str, "PROPPATCH") && !z65.c(str, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean c(String str) {
        z65.h(str, "method");
        return !z65.c(str, "PROPFIND");
    }

    public final boolean d(String str) {
        z65.h(str, "method");
        return z65.c(str, "PROPFIND");
    }
}

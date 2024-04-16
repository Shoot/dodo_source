package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MindboxLoggerImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a \u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u001a \u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\n"}, d2 = {"", "", "message", "", "a", DateTokenConverter.CONVERTER_KEY, "", "exception", e.a, "b", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gk6  reason: default package */
/* loaded from: classes.dex */
public final class gk6 {
    public static final void a(Object obj, String str) {
        z65.h(obj, "<this>");
        z65.h(str, "message");
        fk6.a.d(obj, str);
    }

    public static final void b(Object obj, String str, Throwable th) {
        Unit unit;
        z65.h(obj, "<this>");
        z65.h(str, "message");
        if (th != null) {
            fk6.a.f(obj, str, th);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            fk6.a.e(obj, str);
        }
    }

    public static /* synthetic */ void c(Object obj, String str, Throwable th, int i, Object obj2) {
        if ((i & 2) != 0) {
            th = null;
        }
        b(obj, str, th);
    }

    public static final void d(Object obj, String str) {
        z65.h(obj, "<this>");
        z65.h(str, "message");
        fk6.a.i(obj, str);
    }

    public static final void e(Object obj, String str, Throwable th) {
        Unit unit;
        z65.h(obj, "<this>");
        z65.h(str, "message");
        if (th != null) {
            fk6.a.k(obj, str, th);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            fk6.a.a(obj, str);
        }
    }

    public static /* synthetic */ void f(Object obj, String str, Throwable th, int i, Object obj2) {
        if ((i & 2) != 0) {
            th = null;
        }
        e(obj, str, th);
    }
}

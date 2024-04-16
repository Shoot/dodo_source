package defpackage;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MindboxDI.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsj6;", "", "", c.a, "Landroid/content/Context;", "appContext", "", "b", "Lgo;", "Lgo;", "a", "()Lgo;", DateTokenConverter.CONVERTER_KEY, "(Lgo;)V", "appModule", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sj6  reason: default package */
/* loaded from: classes.dex */
public final class sj6 {
    public static final sj6 a = new sj6();
    public static go b;

    private sj6() {
    }

    public final go a() {
        go goVar = b;
        if (goVar != null) {
            return goVar;
        }
        z65.z("appModule");
        return null;
    }

    public final void b(Context context) {
        z65.h(context, "appContext");
        if (c()) {
            return;
        }
        gk6.a(this, "MindboxDI init in " + Thread.currentThread().getName());
        Context applicationContext = context.getApplicationContext();
        z65.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        wn a2 = xn.a((Application) applicationContext);
        nm a3 = om.a(a2);
        yk2 a4 = zk2.a(a2, a3);
        l63 a5 = m63.a(a4, a3);
        go6 a6 = ho6.a(a2, a3, a4);
        d(ho.a(a2, a5, a6, zi8.a(a5, a6, a3, a2), a4, a3));
    }

    public final boolean c() {
        if (b != null) {
            return true;
        }
        return false;
    }

    public final void d(go goVar) {
        z65.h(goVar, "<set-?>");
        b = goVar;
    }
}

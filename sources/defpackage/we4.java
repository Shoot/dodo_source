package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: GeopositionModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lwe4;", "", "Lje4;", "geoLocationProviderFactory", "Ljgb;", "timeFormatter", "Lzl5;", c.a, "Lr43;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: we4  reason: default package */
/* loaded from: classes3.dex */
public final class we4 {
    public static final we4 a = new we4();

    private we4() {
    }

    public final r43 a() {
        return new s43();
    }

    public final je4 b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new yp2(context);
    }

    public final zl5 c(je4 je4Var, jgb jgbVar) {
        z65.h(je4Var, "geoLocationProviderFactory");
        z65.h(jgbVar, "timeFormatter");
        return new am5(je4Var, jgbVar);
    }
}

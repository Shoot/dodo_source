package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.ym;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
/* compiled from: InstantAppStatusDetector.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lc55;", "", "Lym$c;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c55  reason: default package */
/* loaded from: classes.dex */
public final class c55 {
    private final Context a;

    public c55(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    public final ym.c a() {
        ym.c cVar;
        try {
            Boolean bool = (Boolean) o7b.a(g55.a(this.a).y());
            z65.e(bool);
            if (bool.booleanValue()) {
                cVar = ym.c.b;
            } else {
                cVar = ym.c.c;
            }
            return cVar;
        } catch (ExecutionException unused) {
            return ym.c.d;
        }
    }
}

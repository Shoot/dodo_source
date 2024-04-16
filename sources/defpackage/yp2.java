package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.tc8;
import kotlin.Metadata;
/* compiled from: DefaultGeoLocationProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lyp2;", "Lje4;", "Lie4;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yp2  reason: default package */
/* loaded from: classes4.dex */
public final class yp2 implements je4 {
    private final Context a;

    public yp2(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    @Override // defpackage.je4
    public ie4 a() {
        if (z65.c(zp2.a(this.a), tc8.a.a)) {
            return new qg4(this.a);
        }
        throw new IllegalArgumentException("Unknown platform!");
    }
}

package defpackage;

import android.os.Trace;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\n"}, d2 = {"Lrjb;", "", "", Action.NAME_ATTRIBUTE, "a", "token", "", "b", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rjb  reason: default package */
/* loaded from: classes.dex */
public final class rjb {
    public static final rjb a = new rjb();

    private rjb() {
    }

    public final Object a(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}

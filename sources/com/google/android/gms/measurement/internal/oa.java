package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.CoreConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class oa {
    private final t91 a;
    private long b;

    public oa(t91 t91Var) {
        gh8.j(t91Var);
        this.a = t91Var;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long j) {
        if (this.b == 0 || this.a.b() - this.b >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = this.a.b();
    }
}

package defpackage;

import kotlin.Metadata;
/* compiled from: TimeLeftResolver.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Llgb;", "Lkgb;", "", "startTime", "interval", "a", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lgb  reason: default package */
/* loaded from: classes4.dex */
public final class lgb implements kgb {
    @Override // defpackage.kgb
    public long a(long j, long j2) {
        return (j + j2) - System.currentTimeMillis();
    }

    @Override // defpackage.kgb
    public long b() {
        return System.currentTimeMillis();
    }
}

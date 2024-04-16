package defpackage;

import defpackage.xv9;
import java.util.concurrent.ThreadFactory;
/* compiled from: NewThreadScheduler.java */
/* renamed from: tx6  reason: default package */
/* loaded from: classes3.dex */
public final class tx6 extends xv9 {
    private static final vp9 d = new vp9("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory c;

    public tx6() {
        this(d);
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new ux6(this.c);
    }

    public tx6(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}

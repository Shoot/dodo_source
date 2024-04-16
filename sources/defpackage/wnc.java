package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: wnc  reason: default package */
/* loaded from: classes2.dex */
public final class wnc implements Iterator<bpc> {
    private int a = 0;
    private final /* synthetic */ qnc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wnc(qnc qncVar) {
        this.b = qncVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.z()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bpc next() {
        if (this.a < this.b.z()) {
            qnc qncVar = this.b;
            int i = this.a;
            this.a = i + 1;
            return qncVar.v(i);
        }
        int i2 = this.a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}

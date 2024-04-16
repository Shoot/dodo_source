package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: jnc  reason: default package */
/* loaded from: classes2.dex */
final class jnc implements Iterator<bpc> {
    private final /* synthetic */ Iterator a;
    private final /* synthetic */ Iterator b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jnc(qnc qncVar, Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bpc next() {
        if (this.a.hasNext()) {
            return new gpc(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new gpc((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}

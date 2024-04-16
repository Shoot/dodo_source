package defpackage;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: n4d  reason: default package */
/* loaded from: classes2.dex */
final class n4d implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ m4d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4d(m4d m4dVar) {
        t2d t2dVar;
        this.b = m4dVar;
        t2dVar = m4dVar.a;
        this.a = t2dVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

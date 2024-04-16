package defpackage;

import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: o4d  reason: default package */
/* loaded from: classes2.dex */
final class o4d implements ListIterator<String> {
    private ListIterator<String> a;
    private final /* synthetic */ int b;
    private final /* synthetic */ m4d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4d(m4d m4dVar, int i) {
        t2d t2dVar;
        this.b = i;
        this.c = m4dVar;
        t2dVar = m4dVar.a;
        this.a = t2dVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}

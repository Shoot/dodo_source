package defpackage;

import java.util.Iterator;
/* compiled from: UnmodifiableIterator.java */
/* renamed from: yqb  reason: default package */
/* loaded from: classes2.dex */
public abstract class yqb<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

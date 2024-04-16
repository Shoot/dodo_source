package defpackage;

import java.util.ListIterator;
/* compiled from: UnmodifiableListIterator.java */
/* renamed from: crb  reason: default package */
/* loaded from: classes2.dex */
public abstract class crb<E> extends yqb<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}

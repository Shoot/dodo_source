package defpackage;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableList.java */
/* renamed from: nc9  reason: default package */
/* loaded from: classes2.dex */
public class nc9<E> extends ww4<E> {
    static final ww4<Object> e = new nc9(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nc9(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ww4, defpackage.uw4
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public Object[] d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int f() {
        return this.d;
    }

    @Override // java.util.List
    public E get(int i) {
        hh8.g(i, this.d);
        E e2 = (E) this.c[i];
        Objects.requireNonNull(e2);
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int k() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public boolean u() {
        return false;
    }
}

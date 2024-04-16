package defpackage;

import defpackage.ja1;
import java.util.Collection;
import java.util.Set;
/* compiled from: Algorithm.java */
/* renamed from: db  reason: default package */
/* loaded from: classes.dex */
public interface db<T extends ja1> {
    boolean b(Collection<T> collection);

    void c();

    Set<? extends ia1<T>> e(float f);

    int f();

    void lock();

    void unlock();
}

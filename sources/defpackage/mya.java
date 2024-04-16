package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Stream.java */
/* renamed from: mya  reason: default package */
/* loaded from: classes.dex */
public class mya<T> implements Closeable {
    private final Iterator<? extends T> a;

    private mya(Iterable<? extends T> iterable) {
        this(null, new wn5(iterable));
    }

    public static <T> mya<T> b(Iterable<? extends T> iterable) {
        o57.c(iterable);
        return new mya<>(iterable);
    }

    public mya<T> a(ph8<? super T> ph8Var) {
        return new mya<>(null, new i47(this.a, ph8Var));
    }

    public List<T> c() {
        ArrayList arrayList = new ArrayList();
        while (this.a.hasNext()) {
            arrayList.add(this.a.next());
        }
        return arrayList;
    }

    mya(tq7 tq7Var, Iterator<? extends T> it) {
        this.a = it;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}

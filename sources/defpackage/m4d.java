package defpackage;

import com.google.android.gms.internal.measurement.d1;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
@Deprecated
/* renamed from: m4d  reason: default package */
/* loaded from: classes2.dex */
public final class m4d extends AbstractList<String> implements t2d, RandomAccess {
    private final t2d a;

    public m4d(t2d t2dVar) {
        this.a = t2dVar;
    }

    @Override // defpackage.t2d
    public final List<?> b() {
        return this.a.b();
    }

    @Override // defpackage.t2d
    public final void b0(d1 d1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new n4d(this);
    }

    @Override // defpackage.t2d
    public final Object j(int i) {
        return this.a.j(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new o4d(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.t2d
    public final t2d K() {
        return this;
    }
}

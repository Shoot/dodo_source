package defpackage;

import defpackage.nca;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
/* compiled from: ImmutableMultimap.java */
/* renamed from: yw4  reason: default package */
/* loaded from: classes2.dex */
public abstract class yw4<K, V> extends o70<K, V> implements Serializable {
    final transient xw4<K, ? extends uw4<V>> a;
    final transient int b;

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: yw4$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> {
        final Map<K, Collection<V>> a = yb8.c();
        Comparator<? super K> b;
        Comparator<? super V> c;
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: yw4$b */
    /* loaded from: classes2.dex */
    static class b {
        static final nca.b<yw4> a = nca.a(yw4.class, "map");
        static final nca.b<yw4> b = nca.a(yw4.class, "size");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yw4(xw4<K, ? extends uw4<V>> xw4Var, int i) {
        this.a = xw4Var;
        this.b = i;
    }

    @Override // defpackage.u1
    public boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u1, defpackage.dq6
    /* renamed from: c */
    public xw4<K, Collection<V>> a() {
        return (xw4<K, ? extends uw4<V>>) this.a;
    }

    @Override // defpackage.u1
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.u1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.u1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

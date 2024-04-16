package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentViews.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lrz7;", "K", "V", "Lvw4;", "Lc1;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "Ldz7;", "a", "Ldz7;", "map", "", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Ldz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rz7  reason: default package */
/* loaded from: classes.dex */
public final class rz7<K, V> extends c1<V> implements vw4<V> {
    private final dz7<K, V> a;

    public rz7(dz7<K, V> dz7Var) {
        z65.h(dz7Var, "map");
        this.a = dz7Var;
    }

    @Override // defpackage.c1, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.c1
    public int d() {
        return this.a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new sz7(this.a.q());
    }
}

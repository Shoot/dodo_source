package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lipa;", "K", "V", "E", "", "", "clear", "", "isEmpty", "Lupa;", "a", "Lupa;", DateTokenConverter.CONVERTER_KEY, "()Lupa;", "map", "", "g", "()I", "size", "<init>", "(Lupa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ipa  reason: default package */
/* loaded from: classes.dex */
public abstract class ipa<K, V, E> implements Set<E>, ie5 {
    private final upa<K, V> a;

    public ipa(upa<K, V> upaVar) {
        z65.h(upaVar, "map");
        this.a = upaVar;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    public final upa<K, V> d() {
        return this.a;
    }

    public int g() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ec1.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        z65.h(tArr, "array");
        return (T[]) ec1.b(this, tArr);
    }
}

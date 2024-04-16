package defpackage;
/* compiled from: CachedHashCodeArrayMap.java */
/* renamed from: yl0  reason: default package */
/* loaded from: classes.dex */
public final class yl0<K, V> extends lr<K, V> {
    private int i;

    @Override // defpackage.wka, java.util.Map
    public void clear() {
        this.i = 0;
        super.clear();
    }

    @Override // defpackage.wka, java.util.Map
    public int hashCode() {
        if (this.i == 0) {
            this.i = super.hashCode();
        }
        return this.i;
    }

    @Override // defpackage.wka
    public void l(wka<? extends K, ? extends V> wkaVar) {
        this.i = 0;
        super.l(wkaVar);
    }

    @Override // defpackage.wka
    public V m(int i) {
        this.i = 0;
        return (V) super.m(i);
    }

    @Override // defpackage.wka
    public V n(int i, V v) {
        this.i = 0;
        return (V) super.n(i, v);
    }

    @Override // defpackage.wka, java.util.Map
    public V put(K k, V v) {
        this.i = 0;
        return (V) super.put(k, v);
    }
}

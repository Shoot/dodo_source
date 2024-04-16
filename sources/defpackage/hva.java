package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;
import defpackage.ja1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: StaticCluster.java */
/* renamed from: hva  reason: default package */
/* loaded from: classes.dex */
public class hva<T extends ja1> implements ia1<T> {
    private final LatLng a;
    private final List<T> b = new ArrayList();

    public hva(LatLng latLng) {
        this.a = latLng;
    }

    @Override // defpackage.ia1
    public int a() {
        return this.b.size();
    }

    public boolean b(T t) {
        return this.b.add(t);
    }

    @Override // defpackage.ia1
    public Collection<T> c() {
        return this.b;
    }

    public boolean d(T t) {
        return this.b.remove(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hva)) {
            return false;
        }
        hva hvaVar = (hva) obj;
        if (!hvaVar.a.equals(this.a) || !hvaVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ia1
    public LatLng getPosition() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.a + ", mItems.size=" + this.b.size() + CoreConstants.CURLY_RIGHT;
    }
}

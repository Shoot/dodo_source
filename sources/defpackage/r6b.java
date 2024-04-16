package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* renamed from: r6b  reason: default package */
/* loaded from: classes.dex */
public final class r6b implements mp5 {
    private final Set<n6b<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public void e() {
        this.a.clear();
    }

    @NonNull
    public List<n6b<?>> f() {
        return vub.k(this.a);
    }

    @Override // defpackage.mp5
    public void g() {
        for (n6b n6bVar : vub.k(this.a)) {
            n6bVar.g();
        }
    }

    public void k(@NonNull n6b<?> n6bVar) {
        this.a.add(n6bVar);
    }

    public void m(@NonNull n6b<?> n6bVar) {
        this.a.remove(n6bVar);
    }

    @Override // defpackage.mp5
    public void onDestroy() {
        for (n6b n6bVar : vub.k(this.a)) {
            n6bVar.onDestroy();
        }
    }

    @Override // defpackage.mp5
    public void onStart() {
        for (n6b n6bVar : vub.k(this.a)) {
            n6bVar.onStart();
        }
    }
}

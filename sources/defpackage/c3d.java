package defpackage;

import defpackage.c3d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: c3d  reason: default package */
/* loaded from: classes2.dex */
public class c3d<T extends c3d> {
    private final bad a;
    protected final a0d b;
    private final List<z0d> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public c3d(bad badVar, t91 t91Var) {
        gh8.j(badVar);
        this.a = badVar;
        this.c = new ArrayList();
        a0d a0dVar = new a0d(this, t91Var);
        a0dVar.h();
        this.b = a0dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(a0d a0dVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bad b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(a0d a0dVar) {
        for (z0d z0dVar : this.c) {
            z0dVar.zza();
        }
    }
}

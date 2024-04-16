package defpackage;

import androidx.annotation.NonNull;
import defpackage.ua7;
/* compiled from: OperationImpl.java */
/* renamed from: za7  reason: default package */
/* loaded from: classes.dex */
public class za7 implements ua7 {
    private final qq6<ua7.b> c = new qq6<>();
    private final ufa<ua7.b.c> d = ufa.t();

    public za7() {
        a(ua7.b);
    }

    public void a(@NonNull ua7.b bVar) {
        this.c.l(bVar);
        if (bVar instanceof ua7.b.c) {
            this.d.p((ua7.b.c) bVar);
        } else if (bVar instanceof ua7.b.a) {
            this.d.q(((ua7.b.a) bVar).a());
        }
    }
}

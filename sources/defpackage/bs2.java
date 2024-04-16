package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: DefaultUserAgentPublisher.java */
/* renamed from: bs2  reason: default package */
/* loaded from: classes2.dex */
public class bs2 implements dub {
    private final String a;
    private final hg4 b;

    bs2(Set<cp5> set, hg4 hg4Var) {
        this.a = e(set);
        this.b = hg4Var;
    }

    public static bm1<dub> c() {
        return bm1.e(dub.class).b(d03.n(cp5.class)).f(new rm1() { // from class: as2
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                dub d;
                d = bs2.d(im1Var);
                return d;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dub d(im1 im1Var) {
        return new bs2(im1Var.c(cp5.class), hg4.a());
    }

    private static String e(Set<cp5> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<cp5> it = set.iterator();
        while (it.hasNext()) {
            cp5 next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.dub
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}

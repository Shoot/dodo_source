package defpackage;

import kotlin.Metadata;
/* compiled from: brotli.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0003"}, d2 = {"Lik9;", "response", "a", "okhttp-brotli"}, k = 2, mv = {1, 9, 0})
/* renamed from: jg0  reason: default package */
/* loaded from: classes3.dex */
public final class jg0 {
    public static final ik9 a(ik9 ik9Var) {
        boolean v;
        boolean v2;
        fh0 c;
        z65.h(ik9Var, "response");
        if (!lq4.b(ik9Var)) {
            return ik9Var;
        }
        kk9 b = ik9Var.b();
        String o = ik9.o(ik9Var, "Content-Encoding", null, 2, null);
        if (o != null) {
            v = l0b.v(o, "br", true);
            if (!v) {
                v2 = l0b.v(o, "gzip", true);
                if (v2) {
                    c = c77.c(new zi4(b.source()));
                } else {
                    return ik9Var;
                }
            } else {
                c = c77.c(c77.j(new hg0(b.source().z())));
            }
            return ik9Var.u().q("Content-Encoding").q("Content-Length").b(kk9.Companion.a(c, b.contentType(), -1L)).c();
        }
        return ik9Var;
    }
}

package defpackage;

import defpackage.vo9;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: SequentialExchangeFinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lfca;", "Lyl3;", "Lu79;", "a", "Lvo9;", "Lvo9;", "b", "()Lvo9;", "routePlanner", "<init>", "(Lvo9;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: fca  reason: default package */
/* loaded from: classes3.dex */
public final class fca implements yl3 {
    private final vo9 a;

    public fca(vo9 vo9Var) {
        z65.h(vo9Var, "routePlanner");
        this.a = vo9Var;
    }

    @Override // defpackage.yl3
    public u79 a() {
        vo9.b d;
        IOException iOException = null;
        while (!b().isCanceled()) {
            try {
                d = b().d();
            } catch (IOException e) {
                if (iOException != null) {
                    vl3.a(iOException, e);
                } else {
                    iOException = e;
                }
                if (!uo9.a(b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!d.g()) {
                vo9.a h = d.h();
                if (h.f()) {
                    h = d.d();
                }
                vo9.b a = h.a();
                Throwable b = h.b();
                if (b == null) {
                    if (a != null) {
                        b().c().u(a);
                    }
                } else {
                    throw b;
                }
            }
            return d.a();
        }
        throw new IOException("Canceled");
    }

    @Override // defpackage.yl3
    public vo9 b() {
        return this.a;
    }
}

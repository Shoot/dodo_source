package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\r\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ld91;", "", "Lkd8;", "event", "", DateTokenConverter.CONVERTER_KEY, "Lwd8;", "prevClick", "newClick", "", c.a, "b", "Lxyb;", "a", "Lxyb;", "viewConfiguration", "", "I", "()I", "setClicks", "(I)V", "clicks", "Lwd8;", "getPrevClick", "()Lwd8;", "setPrevClick", "(Lwd8;)V", "<init>", "(Lxyb;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d91  reason: default package */
/* loaded from: classes.dex */
final class d91 {
    private final xyb a;
    private int b;
    private wd8 c;

    public d91(xyb xybVar) {
        z65.h(xybVar, "viewConfiguration");
        this.a = xybVar;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b(wd8 wd8Var, wd8 wd8Var2) {
        z65.h(wd8Var, "prevClick");
        z65.h(wd8Var2, "newClick");
        if (s67.j(s67.p(wd8Var2.g(), wd8Var.g())) < 100.0d) {
            return true;
        }
        return false;
    }

    public final boolean c(wd8 wd8Var, wd8 wd8Var2) {
        z65.h(wd8Var, "prevClick");
        z65.h(wd8Var2, "newClick");
        if (wd8Var2.m() - wd8Var.m() < this.a.a()) {
            return true;
        }
        return false;
    }

    public final void d(kd8 kd8Var) {
        z65.h(kd8Var, "event");
        wd8 wd8Var = this.c;
        wd8 wd8Var2 = kd8Var.c().get(0);
        if (wd8Var != null && c(wd8Var, wd8Var2) && b(wd8Var, wd8Var2)) {
            this.b++;
        } else {
            this.b = 1;
        }
        this.c = wd8Var2;
    }
}

package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.s7;
import defpackage.xvb;
import kotlin.Metadata;
/* compiled from: AutoCompletePresenter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"Lq00;", "Lms3;", "Lr00;", "Ls7$a;", "", "text", "", "u", "t", "Lss3;", "item", "v", Image.TYPE_SMALL, "rawValue", "fieldValue", "a", "n", "Lxvb;", "g", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: q00  reason: default package */
/* loaded from: classes4.dex */
public abstract class q00 extends ms3<r00, s7.a> {
    @Override // defpackage.ls3
    public void a(String str, ss3 ss3Var) {
        z65.h(str, "rawValue");
        z65.h(ss3Var, "fieldValue");
        r(str);
        if (!z65.c(ss3Var, ss3.c.a())) {
            j(ss3Var);
        }
        r00 l = l();
        if (l != null) {
            l.setText(str);
        }
    }

    @Override // defpackage.m54
    public xvb g() {
        if (c().c() && z65.c(d(), ss3.c.a())) {
            return new xvb.a(1);
        }
        return xvb.b.a;
    }

    @Override // defpackage.ms3
    public void n() {
        super.n();
        r00 l = l();
        if (l != null) {
            l.setText(b());
        }
    }

    public final void s(String str) {
        z65.h(str, "text");
        r(str);
        u(str);
    }

    public abstract void t();

    public abstract void u(String str);

    public abstract void v(ss3 ss3Var);
}

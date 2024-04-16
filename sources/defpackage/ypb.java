package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: UiApplier.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lypb;", "Lw0;", "Len5;", "", "index", "instance", "", "n", Image.TYPE_MEDIUM, "count", "a", RemoteMessageConst.FROM, RemoteMessageConst.TO, c.a, "k", e.a, "root", "<init>", "(Len5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ypb  reason: default package */
/* loaded from: classes.dex */
public final class ypb extends w0<en5> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypb(en5 en5Var) {
        super(en5Var);
        z65.h(en5Var, "root");
    }

    @Override // defpackage.wp
    public void a(int i, int i2) {
        b().V0(i, i2);
    }

    @Override // defpackage.wp
    public void c(int i, int i2, int i3) {
        b().M0(i, i2, i3);
    }

    @Override // defpackage.w0, defpackage.wp
    public void e() {
        super.e();
        um7 g0 = j().g0();
        if (g0 != null) {
            g0.o();
        }
    }

    @Override // defpackage.w0
    protected void k() {
        j().U0();
    }

    @Override // defpackage.wp
    /* renamed from: m */
    public void f(int i, en5 en5Var) {
        z65.h(en5Var, "instance");
        b().t0(i, en5Var);
    }

    @Override // defpackage.wp
    /* renamed from: n */
    public void d(int i, en5 en5Var) {
        z65.h(en5Var, "instance");
    }
}

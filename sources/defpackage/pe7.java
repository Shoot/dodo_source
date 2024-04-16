package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderHistoryDetailsRouter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0006\u0010\r\u001a\u00020\u0005R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpe7;", "Lfe7;", "Loz3;", "Ll3c;", "b", "", "a", "Lz21;", "check", DateTokenConverter.CONVERTER_KEY, "", "checkUrl", c.a, e.a, "Lfe7;", "externalRouter", "Lf63;", "Lf63;", "router", "<init>", "(Lfe7;Lf63;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pe7  reason: default package */
/* loaded from: classes2.dex */
public final class pe7 implements fe7 {
    private final fe7 a;
    private final f63 b;

    public pe7(fe7 fe7Var, f63 f63Var) {
        z65.h(fe7Var, "externalRouter");
        z65.h(f63Var, "router");
        this.a = fe7Var;
        this.b = f63Var;
    }

    @Override // defpackage.fe7
    public void a() {
        this.a.a();
    }

    @Override // defpackage.fe7
    public oz3<l3c> b() {
        return this.a.b();
    }

    @Override // defpackage.fe7
    public void c(String str) {
        z65.h(str, "checkUrl");
        this.a.c(str);
    }

    @Override // defpackage.fe7
    public void d(z21 z21Var) {
        z65.h(z21Var, "check");
        this.a.d(z21Var);
    }

    public final void e() {
        this.b.d();
    }
}

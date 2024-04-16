package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MenuItemPersonalizerProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lme6;", "", "Lje6;", "a", "Lhq3;", "Lhq3;", "featureService", "b", "Lje6;", "realMenuItemPersonalizer", c.a, "noopMenuItemPersonalizer", "<init>", "(Lhq3;Lje6;Lje6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: me6  reason: default package */
/* loaded from: classes4.dex */
public final class me6 {
    private final hq3 a;
    private final je6 b;
    private final je6 c;

    public me6(hq3 hq3Var, je6 je6Var, je6 je6Var2) {
        z65.h(hq3Var, "featureService");
        z65.h(je6Var, "realMenuItemPersonalizer");
        z65.h(je6Var2, "noopMenuItemPersonalizer");
        this.a = hq3Var;
        this.b = je6Var;
        this.c = je6Var2;
    }

    public final je6 a() {
        if (this.a.a(bq3.v5)) {
            return this.b;
        }
        return this.c;
    }
}

package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: MemoryDataSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u001b"}, d2 = {"Lvc6;", "", "", "numberCanceledOrder", "", e.a, "Loz3;", "b", "Lvv6;", "networkAvailabilityState", "g", "", DateTokenConverter.CONVERTER_KEY, "a", "Loqb;", "stateStatus", "f", c.a, "Lfr6;", "Lfr6;", "networkStateFlow", "Lcr6;", "Lcr6;", "numberCanceledOrderFlow", "unexpectedStateStatusFlow", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vc6  reason: default package */
/* loaded from: classes3.dex */
public final class vc6 {
    private final fr6<vv6> a = mua.a(vv6.a);
    private final cr6<Integer> b = uha.b(0, 1, null, 5, null);
    private final cr6<oqb> c = uha.b(0, 1, null, 5, null);

    public final oz3<vv6> a() {
        return this.a;
    }

    public final oz3<Integer> b() {
        return this.b;
    }

    public final oz3<oqb> c() {
        return this.c;
    }

    public final boolean d() {
        if (this.a.getValue() == vv6.a) {
            return true;
        }
        return false;
    }

    public final void e(int i) {
        this.b.a(Integer.valueOf(i));
    }

    public final void f(oqb oqbVar) {
        z65.h(oqbVar, "stateStatus");
        this.c.a(oqbVar);
    }

    public final void g(vv6 vv6Var) {
        z65.h(vv6Var, "networkAvailabilityState");
        vv6 vv6Var2 = vv6.a;
        if (vv6Var == vv6Var2 && this.a.getValue() == vv6.b) {
            this.a.setValue(vv6.c);
            this.a.setValue(vv6Var2);
            return;
        }
        this.a.setValue(vv6Var);
    }
}

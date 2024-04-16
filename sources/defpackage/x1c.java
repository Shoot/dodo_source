package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: VnAddressFormatterImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lx1c;", "Lh8;", "Lw6;", "address", "", DateTokenConverter.CONVERTER_KEY, "b", c.a, "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x1c  reason: default package */
/* loaded from: classes4.dex */
public final class x1c implements h8 {
    private final String d(w6 w6Var) {
        StringBuilder sb = new StringBuilder();
        String c = w6Var.n().c();
        z65.g(c, "getStreetName(...)");
        String sb2 = g9.b(sb, c).toString();
        z65.g(sb2, "with(...)");
        return sb2;
    }

    @Override // defpackage.h8
    public String a(w6 w6Var) {
        z65.h(w6Var, "address");
        return d(w6Var);
    }

    @Override // defpackage.h8
    public String b(w6 w6Var) {
        z65.h(w6Var, "address");
        return d(w6Var);
    }

    @Override // defpackage.h8
    public String c(w6 w6Var) {
        z65.h(w6Var, "address");
        return d(w6Var);
    }
}

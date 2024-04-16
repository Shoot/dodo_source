package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DefaultPhoneFormatProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lfr2;", "", "Lm28;", "phoneFormatRepository", "Lv28;", "b", "Lj28;", "defaultFormat", "Lh48;", c.a, "a", "<init>", "()V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: fr2  reason: default package */
/* loaded from: classes2.dex */
public final class fr2 {
    public static final fr2 a = new fr2();

    private fr2() {
    }

    public final m28 a() {
        return new xz4();
    }

    public final v28 b(m28 m28Var) {
        z65.h(m28Var, "phoneFormatRepository");
        return new w28(new o28(new l28(m28Var), new q28()));
    }

    public final h48 c(m28 m28Var, j28 j28Var) {
        z65.h(m28Var, "phoneFormatRepository");
        z65.h(j28Var, "defaultFormat");
        return new i48(new o28(new l28(m28Var), new q28()), j28Var);
    }
}

package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PhoneInputHandlerImplementation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lw28;", "Lv28;", "Lu28;", "input", "Lg48;", "a", "b", "notFormatted", c.a, "Ln28;", "Ln28;", "phoneFormatService", "<init>", "(Ln28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: w28  reason: default package */
/* loaded from: classes2.dex */
public final class w28 implements v28 {
    private final n28 a;

    public w28(n28 n28Var) {
        z65.h(n28Var, "phoneFormatService");
        this.a = n28Var;
    }

    @Override // defpackage.v28
    public g48 a(u28 u28Var) {
        z65.h(u28Var, "input");
        return this.a.a(u28Var);
    }

    @Override // defpackage.v28
    public g48 b(u28 u28Var) {
        z65.h(u28Var, "input");
        return this.a.b(u28Var);
    }

    @Override // defpackage.v28
    public g48 c(g48 g48Var) {
        z65.h(g48Var, "notFormatted");
        return this.a.b(new u28(g48Var.e(), g48Var.c()));
    }
}

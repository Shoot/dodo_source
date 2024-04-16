package defpackage;

import com.dodopizza.phonenumber.format.PhoneFormatException;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PhoneParserImplementation.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Li48;", "Lh48;", "", "rawPhone", "Lf28;", "a", c.a, "phone", "b", "Ln28;", "Ln28;", "phoneFormatService", "Lj28;", "Lj28;", "defaultFormat", "<init>", "(Ln28;Lj28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: i48  reason: default package */
/* loaded from: classes2.dex */
public final class i48 implements h48 {
    private final n28 a;
    private final j28 b;

    public i48(n28 n28Var, j28 j28Var) {
        z65.h(n28Var, "phoneFormatService");
        z65.h(j28Var, "defaultFormat");
        this.a = n28Var;
        this.b = j28Var;
    }

    @Override // defpackage.h48
    public f28 a(String str) {
        z65.h(str, "rawPhone");
        if (str.length() != 0) {
            return this.a.b(new u28(str, this.b)).f();
        }
        throw new PhoneFormatException();
    }

    @Override // defpackage.h48
    public String b(f28 f28Var) {
        z65.h(f28Var, "phone");
        return c(f28Var.toString());
    }

    public String c(String str) {
        z65.h(str, "rawPhone");
        return this.a.b(new u28(str, this.b)).e();
    }
}

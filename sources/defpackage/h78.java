package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PizzaDoughNameFormatter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lh78;", "Lg78;", "", "size", "dough", c.a, "b", "Lfl8;", "product", "a", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h78  reason: default package */
/* loaded from: classes.dex */
public final class h78 implements g78 {
    private final String c(String str, String str2) {
        String str3;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        StringBuilder sb = new StringBuilder(str3);
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            sb.append(", ");
        }
        if (str2 != null && str2.length() != 0) {
            sb.append(qhb.a(str2));
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // defpackage.g78
    public String a(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        if (fl8Var instanceof m78) {
            m78 m78Var = (m78) fl8Var;
            return c(m78Var.s().e(), m78Var.o().e());
        }
        return "";
    }

    @Override // defpackage.g78
    public String b(String str, String str2) {
        return c(str, str2);
    }
}

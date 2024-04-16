package defpackage;

import com.google.i18n.phonenumbers.a;
import com.google.i18n.phonenumbers.b;
import kotlin.Metadata;
/* compiled from: PhoneFormatter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lq28;", "Lp28;", "", "phoneWithoutPrefix", "Lj28;", "format", "a", "phoneBody", "b", "Lcom/google/i18n/phonenumbers/b;", "Lcom/google/i18n/phonenumbers/b;", "phoneNumberUtil", "<init>", "()V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: q28  reason: default package */
/* loaded from: classes2.dex */
public final class q28 implements p28 {
    private final b a;

    public q28() {
        b v = b.v();
        z65.g(v, "getInstance(...)");
        this.a = v;
    }

    @Override // defpackage.p28
    public String a(String str, j28 j28Var) {
        z65.h(str, "phoneWithoutPrefix");
        z65.h(j28Var, "format");
        if (str.length() == 0) {
            return str;
        }
        a s = this.a.s(j28Var.a());
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = s.m(str.charAt(i));
            z65.g(str2, "inputDigit(...)");
        }
        return str2;
    }

    @Override // defpackage.p28
    public String b(String str) {
        z65.h(str, "phoneBody");
        return new ec9("[\\D]").i(str, "");
    }
}

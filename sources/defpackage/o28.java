package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.b;
import com.google.i18n.phonenumbers.d;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PhoneFormatService.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001e"}, d2 = {"Lo28;", "Ln28;", "Lcom/google/i18n/phonenumbers/d;", "googlePhoneNumber", "Lj28;", "format", "", c.a, "phoneNumber", "Lc58;", DateTokenConverter.CONVERTER_KEY, "phoneToParse", "defaultCountryCode", e.a, "Lu28;", "input", "Lg48;", "a", "b", "Lk28;", "Lk28;", "detector", "Lp28;", "Lp28;", "phoneFormatter", "Lcom/google/i18n/phonenumbers/b;", "Lcom/google/i18n/phonenumbers/b;", "phoneNumberUtil", "<init>", "(Lk28;Lp28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: o28  reason: default package */
/* loaded from: classes2.dex */
public final class o28 implements n28 {
    private final k28 a;
    private final p28 b;
    private final b c;

    public o28(k28 k28Var, p28 p28Var) {
        z65.h(k28Var, "detector");
        z65.h(p28Var, "phoneFormatter");
        this.a = k28Var;
        this.b = p28Var;
        b v = b.v();
        z65.g(v, "getInstance(...)");
        this.c = v;
    }

    private final String c(d dVar, j28 j28Var) {
        String a;
        if (this.c.K(dVar)) {
            a = this.c.m(dVar, b.EnumC0248b.INTERNATIONAL);
        } else {
            p28 p28Var = this.b;
            String b = j28Var.b();
            long f = dVar.f();
            a = p28Var.a(b + f, j28Var);
        }
        z65.e(a);
        return nvb.a(a, j28Var);
    }

    private final c58 d(d dVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (dVar != null) {
            z = this.c.K(dVar);
        } else {
            z = false;
        }
        if (dVar != null && this.c.B(dVar) != b.c.MOBILE) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            z3 = true;
        }
        return new c58(z, z3);
    }

    private final d e(String str, String str2) {
        try {
            return this.c.Y(str, str2);
        } catch (NumberParseException unused) {
            return null;
        }
    }

    static /* synthetic */ d f(o28 o28Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return o28Var.e(str, str2);
    }

    @Override // defpackage.n28
    public g48 a(u28 u28Var) {
        String T0;
        CharSequence R0;
        z65.h(u28Var, "input");
        if (u28Var.b().length() == 0) {
            return new g48(u28Var);
        }
        String b = this.b.b(u28Var.b());
        p28 p28Var = this.b;
        String b2 = u28Var.a().b();
        T0 = o0b.T0(p28Var.a(b2 + b, u28Var.a()), u28Var.a().b().length());
        R0 = m0b.R0(T0);
        String obj = R0.toString();
        f28 f28Var = new f28(u28Var.a().b(), b);
        j28 a = u28Var.a();
        String b3 = u28Var.a().b();
        return new g48(f28Var, a, obj, d(f(this, b3 + obj, null, 2, null)));
    }

    @Override // defpackage.n28
    public g48 b(u28 u28Var) {
        String a;
        z65.h(u28Var, "input");
        d f = f(this, u28Var.b(), null, 2, null);
        j28 a2 = u28Var.a();
        if (f != null && f.l()) {
            a2 = this.a.a(this.c.E(f), f.c(), a2);
            a = c(f, a2);
        } else {
            f = e(u28Var.b(), a2.a());
            if (f != null && f.l()) {
                a = c(f, a2);
            } else {
                a = this.b.a(u28Var.b(), a2);
            }
        }
        return new g48(new f28(a2.b(), this.b.b(a)), a2, a, d(f));
    }
}

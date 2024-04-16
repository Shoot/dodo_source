package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.s7;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: AddressFieldsConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001e"}, d2 = {"Lv7;", "Lws3;", "Ln7;", "Ls7$a;", "b", "Ls7$b;", c.a, "", LocalityEntity.FIELD_COUNTRY_CODE, "", "Lis3;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/Collection;", "defaultConfig", "roConfig", DateTokenConverter.CONVERTER_KEY, "deConfig", e.a, "ngConfig", "f", "siConfig", "g", "viConfig", "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v7  reason: default package */
/* loaded from: classes4.dex */
public final class v7 implements ws3 {
    private final Context a;
    private final Collection<is3> b;
    private final Collection<is3> c;
    private final Collection<is3> d;
    private final Collection<is3> e;
    private final Collection<is3> f;
    private final Collection<is3> g;

    public v7(Context context) {
        List o;
        List o2;
        List o3;
        List o4;
        List o5;
        List o6;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        n7 n7Var = n7.b;
        s7.a b = b(n7Var);
        b.d(true);
        b.g(true);
        b.e(true);
        Unit unit = Unit.a;
        n7 n7Var2 = n7.c;
        s7.a b2 = b(n7Var2);
        b2.e(true);
        n7 n7Var3 = n7.e;
        n7 n7Var4 = n7.g;
        n7 n7Var5 = n7.h;
        n7 n7Var6 = n7.f;
        n7 n7Var7 = n7.i;
        n7 n7Var8 = n7.k;
        o = kc1.o(b, b2, c(n7Var3), c(n7Var4), c(n7Var5), c(n7Var6), c(n7Var7), c(n7Var8));
        this.b = o;
        s7.a b3 = b(n7Var);
        b3.d(true);
        b3.g(true);
        b3.e(true);
        s7.a b4 = b(n7Var2);
        b4.e(true);
        o2 = kc1.o(b3, b4, c(n7.d), c(n7Var3), c(n7Var4), c(n7Var5), c(n7Var6), c(n7Var7), c(n7Var8));
        this.c = o2;
        s7.a b5 = b(n7Var);
        b5.d(true);
        b5.g(true);
        b5.e(true);
        o3 = kc1.o(b5, c(n7Var8));
        this.e = o3;
        s7.a b6 = b(n7Var);
        b6.d(true);
        b6.g(true);
        b6.e(true);
        s7.a b7 = b(n7Var2);
        b7.e(true);
        o4 = kc1.o(b6, b7, c(n7Var3), c(n7Var6), c(n7Var8));
        this.d = o4;
        s7.a b8 = b(n7Var);
        b8.d(true);
        b8.g(true);
        b8.e(true);
        s7.a b9 = b(n7Var2);
        b9.e(true);
        o5 = kc1.o(b8, b9, c(n7Var3), c(n7Var5), c(n7Var7), c(n7Var8));
        this.f = o5;
        s7.a b10 = b(n7Var);
        b10.d(true);
        b10.g(true);
        b10.e(true);
        o6 = kc1.o(b10, c(n7Var8));
        this.g = o6;
    }

    private final s7.a b(n7 n7Var) {
        return new s7.a(n7Var.getValue(), o7.a(n7Var), false, false, false, 28, null);
    }

    private final s7.b c(n7 n7Var) {
        return new s7.b(n7Var.getValue(), o7.a(n7Var), false, false, 12, null);
    }

    @Override // defpackage.ws3
    public Collection<is3> a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        switch (str.hashCode()) {
            case 48658:
                if (str.equals("112")) {
                    return this.b;
                }
                break;
            case 49682:
                if (str.equals("233")) {
                    return this.b;
                }
                break;
            case 49809:
                if (str.equals("276")) {
                    return this.d;
                }
                break;
            case 50834:
                if (str.equals("398")) {
                    return this.b;
                }
                break;
            case 51546:
                if (str.equals("417")) {
                    return this.b;
                }
                break;
            case 51632:
                if (str.equals("440")) {
                    return this.b;
                }
                break;
            case 52661:
                if (str.equals("566")) {
                    return this.e;
                }
                break;
            case 53467:
                if (str.equals("616")) {
                    return this.b;
                }
                break;
            case 53556:
                if (str.equals("642")) {
                    return this.c;
                }
                break;
            case 53557:
                if (str.equals("643")) {
                    return this.b;
                }
                break;
            case 54395:
                if (str.equals("704")) {
                    return this.g;
                }
                break;
            case 54396:
                if (str.equals("705")) {
                    return this.f;
                }
                break;
            case 55420:
                if (str.equals("826")) {
                    return this.b;
                }
                break;
            case 55538:
                if (str.equals("860")) {
                    return this.b;
                }
                break;
        }
        return this.b;
    }
}

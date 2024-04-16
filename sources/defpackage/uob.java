package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B6\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JL\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006$"}, d2 = {"Luob;", "", "Lw24;", "fontFamily", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "resourceLoaderCacheKey", "a", "(Lw24;Lv34;IILjava/lang/Object;)Luob;", "", "toString", "", "hashCode", "other", "", "equals", "Lw24;", c.a, "()Lw24;", "b", "Lv34;", "f", "()Lv34;", "I", DateTokenConverter.CONVERTER_KEY, "()I", e.a, "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "<init>", "(Lw24;Lv34;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uob  reason: default package */
/* loaded from: classes.dex */
public final class uob {
    private final w24 a;
    private final v34 b;
    private final int c;
    private final int d;
    private final Object e;

    public /* synthetic */ uob(w24 w24Var, v34 v34Var, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(w24Var, v34Var, i, i2, obj);
    }

    public static /* synthetic */ uob b(uob uobVar, w24 w24Var, v34 v34Var, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            w24Var = uobVar.a;
        }
        if ((i3 & 2) != 0) {
            v34Var = uobVar.b;
        }
        v34 v34Var2 = v34Var;
        if ((i3 & 4) != 0) {
            i = uobVar.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = uobVar.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = uobVar.e;
        }
        return uobVar.a(w24Var, v34Var2, i4, i5, obj);
    }

    public final uob a(w24 w24Var, v34 v34Var, int i, int i2, Object obj) {
        z65.h(v34Var, "fontWeight");
        return new uob(w24Var, v34Var, i, i2, obj, null);
    }

    public final w24 c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uob)) {
            return false;
        }
        uob uobVar = (uob) obj;
        if (z65.c(this.a, uobVar.a) && z65.c(this.b, uobVar.b) && q34.f(this.c, uobVar.c) && r34.e(this.d, uobVar.d) && z65.c(this.e, uobVar.e)) {
            return true;
        }
        return false;
    }

    public final v34 f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        w24 w24Var = this.a;
        int i = 0;
        if (w24Var == null) {
            hashCode = 0;
        } else {
            hashCode = w24Var.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.b.hashCode()) * 31) + q34.g(this.c)) * 31) + r34.f(this.d)) * 31;
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) q34.h(this.c)) + ", fontSynthesis=" + ((Object) r34.i(this.d)) + ", resourceLoaderCacheKey=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private uob(w24 w24Var, v34 v34Var, int i, int i2, Object obj) {
        z65.h(v34Var, "fontWeight");
        this.a = w24Var;
        this.b = v34Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }
}

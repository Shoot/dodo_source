package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: AndroidFontResolveInterceptor.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lug;", "Ljc8;", "Lv34;", "fontWeight", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", "", "other", "", "equals", "b", "I", "fontWeightAdjustment", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public final class ug implements jc8 {
    private final int b;

    public ug(int i) {
        this.b = i;
    }

    @Override // defpackage.jc8
    public /* synthetic */ int a(int i) {
        return ic8.b(this, i);
    }

    @Override // defpackage.jc8
    public /* synthetic */ w24 b(w24 w24Var) {
        return ic8.a(this, w24Var);
    }

    @Override // defpackage.jc8
    public /* synthetic */ int c(int i) {
        return ic8.c(this, i);
    }

    @Override // defpackage.jc8
    public v34 d(v34 v34Var) {
        int l;
        z65.h(v34Var, "fontWeight");
        int i = this.b;
        if (i != 0 && i != Integer.MAX_VALUE) {
            l = i.l(v34Var.B() + this.b, 1, 1000);
            return new v34(l);
        }
        return v34Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ug) && this.b == ((ug) obj).b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

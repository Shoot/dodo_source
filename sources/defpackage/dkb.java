package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: TraitV5.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010,\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b+\u0010\f¨\u0006/"}, d2 = {"Ldkb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "getSpicy", "()Z", "spicy", "b", "getVegan", "vegan", c.a, "getForChildren", "forChildren", DateTokenConverter.CONVERTER_KEY, "getBaked", "baked", e.a, "getDrink", "drink", "f", "getFood", "food", "g", "getDigital", "digital", Image.TYPE_HIGH, "getMaterial", "material", "i", "hotAndReady", "j", "getAlcohol", "alcohol", "k", ProductEntity.TYPE_PIZZA, "l", "getSauce", "sauce", "<init>", "(ZZZZZZZZZZZZ)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: dkb  reason: default package */
/* loaded from: classes.dex */
public final class dkb {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public dkb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
    }

    public final boolean a() {
        return this.i;
    }

    public final boolean b() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb)) {
            return false;
        }
        dkb dkbVar = (dkb) obj;
        if (this.a == dkbVar.a && this.b == dkbVar.b && this.c == dkbVar.c && this.d == dkbVar.d && this.e == dkbVar.e && this.f == dkbVar.f && this.g == dkbVar.g && this.h == dkbVar.h && this.i == dkbVar.i && this.j == dkbVar.j && this.k == dkbVar.k && this.l == dkbVar.l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((a91.a(this.a) * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + a91.a(this.i)) * 31) + a91.a(this.j)) * 31) + a91.a(this.k)) * 31) + a91.a(this.l);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        boolean z9 = this.i;
        boolean z10 = this.j;
        boolean z11 = this.k;
        boolean z12 = this.l;
        return "TraitV5(spicy=" + z + ", vegan=" + z2 + ", forChildren=" + z3 + ", baked=" + z4 + ", drink=" + z5 + ", food=" + z6 + ", digital=" + z7 + ", material=" + z8 + ", hotAndReady=" + z9 + ", alcohol=" + z10 + ", pizza=" + z11 + ", sauce=" + z12 + ")";
    }
}

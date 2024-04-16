package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ym;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboProductCardData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R'\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lth1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "menuItemId", "cartItemId", "Lym$d;", c.a, "Lym$d;", e.a, "()Lym$d;", "screen", DateTokenConverter.CONVERTER_KEY, "I", "()I", "positionInMenu", "Ljava/util/ArrayList;", "Lsi8;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "preferredSlotProducts", "f", "Z", "()Z", "isHeroProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lym$d;ILjava/util/ArrayList;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: th1  reason: default package */
/* loaded from: classes4.dex */
public final class th1 implements Serializable {
    private final String a;
    private final String b;
    private final ym.d c;
    private final int d;
    private final ArrayList<si8> e;
    private final boolean f;

    public th1(String str, String str2, ym.d dVar, int i, ArrayList<si8> arrayList, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(dVar, "screen");
        z65.h(arrayList, "preferredSlotProducts");
        this.a = str;
        this.b = str2;
        this.c = dVar;
        this.d = i;
        this.e = arrayList;
        this.f = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final ArrayList<si8> d() {
        return this.e;
    }

    public final ym.d e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        if (z65.c(this.a, th1Var.a) && z65.c(this.b, th1Var.b) && this.c == th1Var.c && this.d == th1Var.d && z65.c(this.e, th1Var.e) && this.f == th1Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        ym.d dVar = this.c;
        int i = this.d;
        ArrayList<si8> arrayList = this.e;
        boolean z = this.f;
        return "ComboProductCardData(menuItemId=" + str + ", cartItemId=" + str2 + ", screen=" + dVar + ", positionInMenu=" + i + ", preferredSlotProducts=" + arrayList + ", isHeroProduct=" + z + ")";
    }

    public /* synthetic */ th1(String str, String str2, ym.d dVar, int i, ArrayList arrayList, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, dVar, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? new ArrayList() : arrayList, (i2 & 32) != 0 ? false : z);
    }
}

package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyWidgetDataVO.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006#"}, d2 = {"Lc36;", "Lq4c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "title", "b", "balance", c.a, DateTokenConverter.CONVERTER_KEY, "subtitle", "", "Ljava/util/List;", "()Ljava/util/List;", "parallaxResources", "Z", "g", "()Z", "isNeedToPayAttention", "Ld36;", "f", "Ld36;", "()Ld36;", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c36  reason: default package */
/* loaded from: classes4.dex */
public final class c36 extends q4c {
    private final String a;
    private final String b;
    private final String c;
    private final List<Integer> d;
    private final boolean e;
    private final d36 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c36(String str, String str2, String str3, List<Integer> list, boolean z) {
        super(null);
        z65.h(str, "title");
        z65.h(str2, "balance");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = d36.b;
    }

    public final String b() {
        return this.b;
    }

    public final List<Integer> c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c36)) {
            return false;
        }
        c36 c36Var = (c36) obj;
        if (z65.c(this.a, c36Var.a) && z65.c(this.b, c36Var.b) && z65.c(this.c, c36Var.c) && z65.c(this.d, c36Var.d) && this.e == c36Var.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q4c
    /* renamed from: f */
    public d36 a() {
        return this.f;
    }

    public final boolean g() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        List<Integer> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return ((i2 + i) * 31) + a91.a(this.e);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List<Integer> list = this.d;
        boolean z = this.e;
        return "LoyaltyWidgetDataVO(title=" + str + ", balance=" + str2 + ", subtitle=" + str3 + ", parallaxResources=" + list + ", isNeedToPayAttention=" + z + ")";
    }
}

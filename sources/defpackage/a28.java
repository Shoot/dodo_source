package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalWidgetDataVO.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\"\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"La28;", "Lq4c;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lc28;", "a", "Lc28;", e.a, "()Lc28;", MessageAttributes.TYPE, "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "title", c.a, "setSubtitle", "(Ljava/lang/String;)V", "subtitle", "badgeTitle", "Z", "f", "()Z", "g", "(Z)V", "isNeedToAttractAttention", "<init>", "(Lc28;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a28  reason: default package */
/* loaded from: classes4.dex */
public final class a28 extends q4c {
    private final c28 a;
    private final String b;
    private String c;
    private final String d;
    private boolean e;

    public /* synthetic */ a28(c28 c28Var, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28Var, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    @Override // defpackage.q4c
    /* renamed from: e */
    public c28 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a28)) {
            return false;
        }
        a28 a28Var = (a28) obj;
        if (this.a == a28Var.a && z65.c(this.b, a28Var.b) && z65.c(this.c, a28Var.c) && z65.c(this.d, a28Var.d) && this.e == a28Var.e) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final void g(boolean z) {
        this.e = z;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + a91.a(this.e);
    }

    public String toString() {
        c28 c28Var = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        boolean z = this.e;
        return "PersonalWidgetDataVO(type=" + c28Var + ", title=" + str + ", subtitle=" + str2 + ", badgeTitle=" + str3 + ", isNeedToAttractAttention=" + z + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a28(c28 c28Var, String str, String str2, String str3, boolean z) {
        super(null);
        z65.h(c28Var, MessageAttributes.TYPE);
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        this.a = c28Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }
}

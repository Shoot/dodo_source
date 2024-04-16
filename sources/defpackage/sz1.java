package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CourierTipsOptions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\tB5\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000e\u0010\u001c¨\u0006!"}, d2 = {"Lsz1;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", c.a, "()Z", "isAvailable", "b", "Ljava/lang/String;", "getPayTipsUrl", "()Ljava/lang/String;", "payTipsUrl", "getSuccessRedirectUrl", "successRedirectUrl", DateTokenConverter.CONVERTER_KEY, "getFailureRedirectUrl", "failureRedirectUrl", "", "Lv1b;", e.a, "Ljava/util/List;", "()Ljava/util/List;", "suggestedTips", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "f", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sz1  reason: default package */
/* loaded from: classes.dex */
public final class sz1 {
    public static final a f = new a(null);
    private static final sz1 g;
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final List<v1b> e;

    /* compiled from: CourierTipsOptions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lsz1$a;", "", "Lsz1;", "NO_OPTIONS", "Lsz1;", "a", "()Lsz1;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sz1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sz1 a() {
            return sz1.g;
        }
    }

    static {
        List l;
        l = kc1.l();
        g = new sz1(false, "", "", "", l);
    }

    public sz1(boolean z, String str, String str2, String str3, List<v1b> list) {
        z65.h(str, "payTipsUrl");
        z65.h(str2, "successRedirectUrl");
        z65.h(str3, "failureRedirectUrl");
        z65.h(list, "suggestedTips");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final List<v1b> b() {
        return this.e;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz1)) {
            return false;
        }
        sz1 sz1Var = (sz1) obj;
        if (this.a == sz1Var.a && z65.c(this.b, sz1Var.b) && z65.c(this.c, sz1Var.c) && z65.c(this.d, sz1Var.d) && z65.c(this.e, sz1Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        List<v1b> list = this.e;
        return "CourierTipsOptions(isAvailable=" + z + ", payTipsUrl=" + str + ", successRedirectUrl=" + str2 + ", failureRedirectUrl=" + str3 + ", suggestedTips=" + list + ")";
    }
}

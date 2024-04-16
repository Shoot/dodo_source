package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.nt;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResultVO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b\t\u0010 ¨\u0006$"}, d2 = {"Lau;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", e.a, "()Z", "isConfiguredByUser", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "userFirstName", c.a, "message", "Lnt;", "Lnt;", "()Lnt;", "result", "Lrt;", "Lrt;", "getCustomization", "()Lrt;", "customization", "", "Lnt$c;", "()Ljava/util/List;", "ingredients", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lnt;Lrt;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: au  reason: default package */
/* loaded from: classes2.dex */
public final class au {
    private final boolean a;
    private final String b;
    private final String c;
    private final nt d;
    private final rt e;

    public au(boolean z, String str, String str2, nt ntVar, rt rtVar) {
        z65.h(str2, "message");
        z65.h(ntVar, "result");
        z65.h(rtVar, "customization");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = ntVar;
        this.e = rtVar;
    }

    public final List<nt.c> a() {
        List<nt.c> o0;
        o0 = sc1.o0(this.d.d(), this.e.a());
        return o0;
    }

    public final String b() {
        return this.c;
    }

    public final nt c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        if (this.a == auVar.a && z65.c(this.b, auVar.b) && z65.c(this.c, auVar.c) && z65.c(this.d, auVar.d) && z65.c(this.e, auVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((a + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        nt ntVar = this.d;
        rt rtVar = this.e;
        return "AssistantGeneratorResultVO(isConfiguredByUser=" + z + ", userFirstName=" + str + ", message=" + str2 + ", result=" + ntVar + ", customization=" + rtVar + ")";
    }
}

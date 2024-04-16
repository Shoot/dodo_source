package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Landing.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001c¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lhj5;", "", "", Action.NAME_ATTRIBUTE, "Ltj5;", e.a, "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "title", "b", "f", "subtitle", c.a, DateTokenConverter.CONVERTER_KEY, "promoText", "personalDataAgreementUrl", "g", "termsOfServiceUrl", "actionButtonText", "address", "", "Ljava/util/List;", "getSocialLinks", "()Ljava/util/List;", "socialLinks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hj5  reason: default package */
/* loaded from: classes4.dex */
public final class hj5 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final List<tj5> h;

    public hj5(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<tj5> list) {
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        z65.h(str3, "promoText");
        z65.h(str4, "personalDataAgreementUrl");
        z65.h(str5, "termsOfServiceUrl");
        z65.h(str6, "actionButtonText");
        z65.h(str7, "address");
        z65.h(list, "socialLinks");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = list;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final tj5 e(String str) {
        Object obj;
        z65.h(str, Action.NAME_ATTRIBUTE);
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((tj5) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (tj5) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        hj5 hj5Var = (hj5) obj;
        if (z65.c(this.a, hj5Var.a) && z65.c(this.b, hj5Var.b) && z65.c(this.c, hj5Var.c) && z65.c(this.d, hj5Var.d) && z65.c(this.e, hj5Var.e) && z65.c(this.f, hj5Var.f) && z65.c(this.g, hj5Var.g) && z65.c(this.h, hj5Var.h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        List<tj5> list = this.h;
        return "Landing(title=" + str + ", subtitle=" + str2 + ", promoText=" + str3 + ", personalDataAgreementUrl=" + str4 + ", termsOfServiceUrl=" + str5 + ", actionButtonText=" + str6 + ", address=" + str7 + ", socialLinks=" + list + ")";
    }
}

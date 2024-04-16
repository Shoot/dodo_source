package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RemoteMessage.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lod9;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "uniqueKey", "b", "f", "title", c.a, "description", "", "Lqs8;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "pushActions", e.a, "pushLink", "imageUrl", "payload", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: od9  reason: default package */
/* loaded from: classes.dex */
public final class od9 {
    private final String a;
    private final String b;
    private final String c;
    private final List<qs8> d;
    private final String e;
    private final String f;
    private final String g;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final List<qs8> d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od9)) {
            return false;
        }
        od9 od9Var = (od9) obj;
        if (z65.c(this.a, od9Var.a) && z65.c(this.b, od9Var.b) && z65.c(this.c, od9Var.c) && z65.c(this.d, od9Var.d) && z65.c(this.e, od9Var.e) && z65.c(this.f, od9Var.f) && z65.c(this.g, od9Var.g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "RemoteMessage(uniqueKey=" + this.a + ", title=" + this.b + ", description=" + this.c + ", pushActions=" + this.d + ", pushLink=" + this.e + ", imageUrl=" + this.f + ", payload=" + this.g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

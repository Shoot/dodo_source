package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tB9\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001f"}, d2 = {"Lj;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", "Ljava/lang/Integer;", "getMinVersion", "()Ljava/lang/Integer;", "minVersion", c.a, "getMaxVersion", "maxVersion", DateTokenConverter.CONVERTER_KEY, "salt", "", "Lj$a;", e.a, "Ljava/util/List;", "()Ljava/util/List;", "variants", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j  reason: default package */
/* loaded from: classes.dex */
public final class j {
    private final String a;
    private final Integer b;
    private final Integer c;
    private final String d;
    private final List<a> e;

    /* compiled from: InAppConfig.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tB=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006#"}, d2 = {"Lj$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getType", MessageAttributes.TYPE, "Lj$a$a;", c.a, "Lj$a$a;", "()Lj$a$a;", "kind", DateTokenConverter.CONVERTER_KEY, "I", "()I", "lower", e.a, "upper", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "inapps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$a$a;IILjava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final EnumC0369a c;
        private final int d;
        private final int e;
        private final List<String> f;

        /* compiled from: InAppConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0369a {
            ALL,
            CONCRETE
        }

        public a(String str, String str2, EnumC0369a enumC0369a, int i, int i2, List<String> list) {
            z65.h(str, "id");
            z65.h(str2, MessageAttributes.TYPE);
            z65.h(enumC0369a, "kind");
            z65.h(list, "inapps");
            this.a = str;
            this.b = str2;
            this.c = enumC0369a;
            this.d = i;
            this.e = i2;
            this.f = list;
        }

        public final List<String> a() {
            return this.f;
        }

        public final EnumC0369a b() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && z65.c(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "Variant(id=" + this.a + ", type=" + this.b + ", kind=" + this.c + ", lower=" + this.d + ", upper=" + this.e + ", inapps=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public j(String str, Integer num, Integer num2, String str2, List<a> list) {
        z65.h(str, "id");
        z65.h(str2, "salt");
        z65.h(list, "variants");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = list;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final List<a> c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (z65.c(this.a, jVar.a) && z65.c(this.b, jVar.b) && z65.c(this.c, jVar.c) && z65.c(this.d, jVar.d) && z65.c(this.e, jVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((((i2 + i) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ABTest(id=" + this.a + ", minVersion=" + this.b + ", maxVersion=" + this.c + ", salt=" + this.d + ", variants=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

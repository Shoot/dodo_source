package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lqz4;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "inAppId", "<init>", "(Ljava/lang/String;)V", "Lqz4$a;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qz4  reason: default package */
/* loaded from: classes.dex */
public abstract class qz4 {
    private final String a;

    /* compiled from: InAppType.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0017"}, d2 = {"Lqz4$a;", "Lqz4;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "inAppId", c.a, "imageUrl", DateTokenConverter.CONVERTER_KEY, "redirectUrl", e.a, "intentData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qz4$a */
    /* loaded from: classes.dex */
    public static final class a extends qz4 {
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4) {
            super(str, null);
            z65.h(str, "inAppId");
            z65.h(str2, "imageUrl");
            z65.h(str3, "redirectUrl");
            z65.h(str4, "intentData");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // defpackage.qz4
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d) && z65.c(this.e, aVar.e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "SimpleImage(inAppId=" + this.b + ", imageUrl=" + this.c + ", redirectUrl=" + this.d + ", intentData=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ qz4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String a() {
        return this.a;
    }

    private qz4(String str) {
        this.a = str;
    }
}

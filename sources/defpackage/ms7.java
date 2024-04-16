package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.qz4;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lms7;", "", "", "id", "Lqz4;", "a", "<init>", "()V", "Lms7$a;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ms7  reason: default package */
/* loaded from: classes.dex */
public abstract class ms7 {

    /* compiled from: InAppConfig.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, d2 = {"Lms7$a;", "Lms7;", "", "id", "Lqz4;", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", MessageAttributes.TYPE, "b", "imageUrl", c.a, "getRedirectUrl", "redirectUrl", DateTokenConverter.CONVERTER_KEY, "getIntentPayload", "intentPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ms7$a */
    /* loaded from: classes.dex */
    public static final class a extends ms7 {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4) {
            super(null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(str2, "imageUrl");
            z65.h(str3, "redirectUrl");
            z65.h(str4, "intentPayload");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // defpackage.ms7
        public qz4 a(String str) {
            z65.h(str, "id");
            return new qz4.a(str, this.b, this.c, this.d);
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "SimpleImage(type=" + this.a + ", imageUrl=" + this.b + ", redirectUrl=" + this.c + ", intentPayload=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private ms7() {
    }

    public /* synthetic */ ms7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract qz4 a(String str);
}

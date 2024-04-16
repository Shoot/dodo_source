package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RnDigitalLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ldn9;", "", "<init>", "()V", "a", "b", "Ldn9$a;", "Ldn9$b;", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dn9  reason: default package */
/* loaded from: classes.dex */
public abstract class dn9 {

    /* compiled from: RnDigitalLink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Ldn9$a;", "Ldn9;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "formLink", "b", c.a, "title", "productImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dn9$a */
    /* loaded from: classes.dex */
    public static final class a extends dn9 {
        private final String a;
        private final String b;
        private final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(null);
            z65.h(str, "formLink");
            z65.h(str2, "title");
            z65.h(str3, "productImageUrl");
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (str.length() > 0) {
                if (str3.length() > 0) {
                    return;
                }
                throw new IllegalArgumentException("Product image url is empty".toString());
            }
            throw new IllegalArgumentException("Form link is empty".toString());
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
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
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            return "Available(formLink=" + str + ", title=" + str2 + ", productImageUrl=" + str3 + ")";
        }
    }

    /* compiled from: RnDigitalLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldn9$b;", "Ldn9;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dn9$b */
    /* loaded from: classes.dex */
    public static final class b extends dn9 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private dn9() {
    }

    public /* synthetic */ dn9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

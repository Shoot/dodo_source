package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductSize.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lkm8;", "Ljava/io/Serializable;", "", "b", "", "toString", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "measure", "getValue", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", c.a, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: km8  reason: default package */
/* loaded from: classes.dex */
public final class km8 implements Serializable {
    public static final a c = new a(null);
    private final String a;
    private final String b;

    /* compiled from: ProductSize.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lkm8$a;", "", "", "rawValue", "a", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: km8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            float f;
            z65.h(str, "rawValue");
            if (str.length() != 0) {
                try {
                    f = Float.parseFloat(str);
                } catch (NumberFormatException unused) {
                    f = 0.0f;
                }
                long j = f;
                if (f == ((float) j)) {
                    return String.valueOf(j);
                }
                return String.valueOf(f);
            }
            return str;
        }
    }

    public km8() {
        this(null, null, 3, null);
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        boolean z;
        boolean z2 = false;
        if (this.a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.b.length() == 0) {
            z2 = true;
        }
        return z & z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km8)) {
            return false;
        }
        km8 km8Var = (km8) obj;
        if (z65.c(this.a, km8Var.a) && z65.c(this.b, km8Var.b)) {
            return true;
        }
        return false;
    }

    public final String getValue() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "ProductSize(measure=" + str + ", value=" + str2 + ")";
    }

    public km8(String str, String str2) {
        z65.h(str, "measure");
        z65.h(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ km8(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

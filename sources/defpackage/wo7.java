package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CheckoutDetails.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lwo7;", "Ljava/io/Serializable;", "a", "b", "Lwo7$a;", "Lwo7$b;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo7  reason: default package */
/* loaded from: classes4.dex */
public interface wo7 extends Serializable {

    /* compiled from: CheckoutDetails.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo7$a;", "Lwo7;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo7$a */
    /* loaded from: classes4.dex */
    public static final class a implements wo7 {
        public static final a a = new a();

        private a() {
        }
    }

    /* compiled from: CheckoutDetails.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lwo7$b;", "Lwo7;", "", "isSelected", "J", "g", "()Z", "a", "b", "Lwo7$b$a;", "Lwo7$b$b;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo7$b */
    /* loaded from: classes4.dex */
    public interface b extends wo7 {

        /* compiled from: CheckoutDetails.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lwo7$b$a;", "Lwo7$b;", "", "isSelected", "j", "", "title", "description", "switcherTitle", "actionTitle", "actionUrl", "a", "toString", "", "hashCode", "", "other", "equals", "Z", "g", "()Z", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", c.a, e.a, DateTokenConverter.CONVERTER_KEY, "f", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: wo7$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements b {
            private final boolean a;
            private final String b;
            private final String c;
            private final String d;
            private final String e;
            private final String f;

            public a(boolean z, String str, String str2, String str3, String str4, String str5) {
                z65.h(str, "title");
                z65.h(str2, "description");
                z65.h(str3, "switcherTitle");
                z65.h(str4, "actionTitle");
                z65.h(str5, "actionUrl");
                this.a = z;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
            }

            public static /* synthetic */ a b(a aVar, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.a;
                }
                if ((i & 2) != 0) {
                    str = aVar.b;
                }
                String str6 = str;
                if ((i & 4) != 0) {
                    str2 = aVar.c;
                }
                String str7 = str2;
                if ((i & 8) != 0) {
                    str3 = aVar.d;
                }
                String str8 = str3;
                if ((i & 16) != 0) {
                    str4 = aVar.e;
                }
                String str9 = str4;
                if ((i & 32) != 0) {
                    str5 = aVar.f;
                }
                return aVar.a(z, str6, str7, str8, str9, str5);
            }

            public final a a(boolean z, String str, String str2, String str3, String str4, String str5) {
                z65.h(str, "title");
                z65.h(str2, "description");
                z65.h(str3, "switcherTitle");
                z65.h(str4, "actionTitle");
                z65.h(str5, "actionUrl");
                return new a(z, str, str2, str3, str4, str5);
            }

            public final String c() {
                return this.e;
            }

            public final String d() {
                return this.f;
            }

            public final String e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (this.a == aVar.a && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d) && z65.c(this.e, aVar.e) && z65.c(this.f, aVar.f)) {
                    return true;
                }
                return false;
            }

            public final String f() {
                return this.d;
            }

            @Override // defpackage.wo7.b
            public boolean g() {
                return this.a;
            }

            public int hashCode() {
                return (((((((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final String i() {
                return this.b;
            }

            @Override // defpackage.wo7.b
            /* renamed from: j */
            public a J(boolean z) {
                return b(this, z, null, null, null, null, null, 62, null);
            }

            public String toString() {
                boolean z = this.a;
                String str = this.b;
                String str2 = this.c;
                String str3 = this.d;
                String str4 = this.e;
                String str5 = this.f;
                return "Custom(isSelected=" + z + ", title=" + str + ", description=" + str2 + ", switcherTitle=" + str3 + ", actionTitle=" + str4 + ", actionUrl=" + str5 + ")";
            }
        }

        /* compiled from: CheckoutDetails.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lwo7$b$b;", "Lwo7$b;", "", "isSelected", "b", "a", "", "toString", "", "hashCode", "", "other", "equals", "Z", "g", "()Z", "<init>", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: wo7$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0726b implements b {
            private final boolean a;

            public C0726b(boolean z) {
                this.a = z;
            }

            public final C0726b a(boolean z) {
                return new C0726b(z);
            }

            @Override // defpackage.wo7.b
            /* renamed from: b */
            public C0726b J(boolean z) {
                return a(z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0726b) && this.a == ((C0726b) obj).a) {
                    return true;
                }
                return false;
            }

            @Override // defpackage.wo7.b
            public boolean g() {
                return this.a;
            }

            public int hashCode() {
                return a91.a(this.a);
            }

            public String toString() {
                boolean z = this.a;
                return "Default(isSelected=" + z + ")";
            }
        }

        b J(boolean z);

        boolean g();
    }
}

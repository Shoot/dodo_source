package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;
/* compiled from: PaymentWay.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 %2\u00020\u0001:\n\u000b\u0010\u0013\t\u001b\u001f%&'(B;\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0007R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\u0082\u0001\t)*+,-./01¨\u00062"}, d2 = {"Ljw7;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Liw7;", DateTokenConverter.CONVERTER_KEY, "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "acquirerName", "Ldt7;", com.huawei.hms.opendevice.c.a, "Ldt7;", "()Ldt7;", "paymentIntegrationType", "Ldu7;", "Ldu7;", "()Ldu7;", "paymentMethodType", com.huawei.hms.push.e.a, "I", "()I", "priority", "f", "Z", "()Z", "isRedirectSaveCardEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt7;Ldu7;IZ)V", "g", Image.TYPE_HIGH, "i", "j", "Ljw7$a;", "Ljw7$b;", "Ljw7$c;", "Ljw7$e;", "Ljw7$f;", "Ljw7$g;", "Ljw7$h;", "Ljw7$i;", "Ljw7$j;", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jw7  reason: default package */
/* loaded from: classes2.dex */
public abstract class jw7 implements Serializable {
    public static final d g = new d(null);
    private final String a;
    private final String b;
    private final dt7 c;
    private final du7 d;
    private final int e;
    private final boolean f;

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ljw7$a;", "Ljw7;", "Ljava/io/Serializable;", "Lpf0;", Image.TYPE_HIGH, "Lpf0;", "i", "()Lpf0;", "brandName", "", "id", "acquirerName", "Ldt7;", "paymentIntegrationType", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpf0;Ldt7;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$a */
    /* loaded from: classes2.dex */
    public static final class a extends jw7 implements Serializable {
        private final pf0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, pf0 pf0Var, dt7 dt7Var, int i) {
            super(str, str2, dt7Var, du7.n, i, false, 32, null);
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(pf0Var, "brandName");
            z65.h(dt7Var, "paymentIntegrationType");
            this.h = pf0Var;
        }

        public final pf0 i() {
            return this.h;
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b#\u0010$J;\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Ljw7$b;", "Ljw7;", "Ljava/io/Serializable;", "", "id", "acquirerName", "Ldt7;", "paymentIntegrationType", "", "priority", "", "isRedirectSaveCardEnabled", "i", "toString", "hashCode", "", "other", "equals", Image.TYPE_HIGH, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "a", "j", "Ldt7;", "b", "()Ldt7;", "k", "I", com.huawei.hms.push.e.a, "()I", "l", "Z", "f", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt7;IZ)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$b */
    /* loaded from: classes2.dex */
    public static final class b extends jw7 implements Serializable {
        private final String h;
        private final String i;
        private final dt7 j;
        private final int k;
        private final boolean l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, dt7 dt7Var, int i, boolean z) {
            super(str, str2, dt7Var, du7.j, i, z, null);
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(dt7Var, "paymentIntegrationType");
            this.h = str;
            this.i = str2;
            this.j = dt7Var;
            this.k = i;
            this.l = z;
        }

        public static /* synthetic */ b j(b bVar, String str, String str2, dt7 dt7Var, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.h;
            }
            if ((i2 & 2) != 0) {
                str2 = bVar.i;
            }
            String str3 = str2;
            if ((i2 & 4) != 0) {
                dt7Var = bVar.j;
            }
            dt7 dt7Var2 = dt7Var;
            if ((i2 & 8) != 0) {
                i = bVar.k;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z = bVar.l;
            }
            return bVar.i(str, str3, dt7Var2, i3, z);
        }

        @Override // defpackage.jw7
        public String a() {
            return this.i;
        }

        @Override // defpackage.jw7
        public dt7 b() {
            return this.j;
        }

        @Override // defpackage.jw7
        public int e() {
            return this.k;
        }

        @Override // defpackage.jw7
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.h, bVar.h) && z65.c(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l) {
                return true;
            }
            return false;
        }

        @Override // defpackage.jw7
        public boolean f() {
            return this.l;
        }

        @Override // defpackage.jw7
        public String getId() {
            return this.h;
        }

        @Override // defpackage.jw7
        public int hashCode() {
            return (((((((this.h.hashCode() * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + a91.a(this.l);
        }

        public final b i(String str, String str2, dt7 dt7Var, int i, boolean z) {
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(dt7Var, "paymentIntegrationType");
            return new b(str, str2, dt7Var, i, z);
        }

        public String toString() {
            String str = this.h;
            String str2 = this.i;
            dt7 dt7Var = this.j;
            int i = this.k;
            boolean z = this.l;
            return "CardPaymentMethod(id=" + str + ", acquirerName=" + str2 + ", paymentIntegrationType=" + dt7Var + ", priority=" + i + ", isRedirectSaveCardEnabled=" + z + ")";
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljw7$c;", "Ljw7;", "Ljava/io/Serializable;", "", "id", "", "priority", "<init>", "(Ljava/lang/String;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$c */
    /* loaded from: classes2.dex */
    public static final class c extends jw7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(str, "", dt7.b, du7.f, i, false, 32, null);
            z65.h(str, "id");
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ljw7$d;", "", "", "DUMMY_PAYMENT_WAY_ID", "Ljava/lang/String;", "", "DUMMY_PAYMENT_WAY_PRIORITY", "I", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Ljw7$e;", "Ljw7;", "Ljava/io/Serializable;", "Lwg4;", Image.TYPE_HIGH, "Lwg4;", "i", "()Lwg4;", "googlePayInitData", "", "id", "acquirerName", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILwg4;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$e */
    /* loaded from: classes2.dex */
    public static final class e extends jw7 implements Serializable {
        private final wg4 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, int i, wg4 wg4Var) {
            super(str, str2, dt7.b, du7.h, i, false, 32, null);
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(wg4Var, "googlePayInitData");
            this.h = wg4Var;
        }

        public final wg4 i() {
            return this.h;
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljw7$f;", "Ljw7;", "Ljava/io/Serializable;", "", "id", "", "priority", "<init>", "(Ljava/lang/String;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$f */
    /* loaded from: classes2.dex */
    public static final class f extends jw7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, int i) {
            super(str, "", dt7.b, du7.l, i, false, 32, null);
            z65.h(str, "id");
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Ljw7$g;", "Ljw7;", "Ljava/io/Serializable;", "Lp60;", Image.TYPE_HIGH, "Lp60;", "i", "()Lp60;", "card", "", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "title", "Lwp0;", "Lwp0;", "k", "()Lwp0;", MessageAttributes.TYPE, "id", "acquirerName", "Ldt7;", "paymentIntegrationType", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt7;ILp60;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$g */
    /* loaded from: classes2.dex */
    public static final class g extends jw7 implements Serializable {
        private final p60 h;
        private final String i;
        private final wp0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, dt7 dt7Var, int i, p60 p60Var) {
            super(str, str2, dt7Var, du7.k, i, false, 32, null);
            String str3;
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(dt7Var, "paymentIntegrationType");
            this.h = p60Var;
            if (p60Var != null) {
                str3 = p60Var.a();
            } else {
                str3 = null;
            }
            this.i = Marker.ANY_MARKER + (str3 == null ? "" : str3);
            this.j = p60Var != null ? p60Var.e() : null;
        }

        public final p60 i() {
            return this.h;
        }

        public final String j() {
            return this.i;
        }

        public final wp0 k() {
            return this.j;
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw7$h;", "Ljw7;", "Ljava/io/Serializable;", "", "id", "acquirerName", "Ldt7;", "paymentIntegrationType", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt7;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$h */
    /* loaded from: classes2.dex */
    public static final class h extends jw7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, dt7 dt7Var, int i) {
            super(str, str2, dt7Var, du7.m, i, false, 32, null);
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(dt7Var, "paymentIntegrationType");
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ljw7$i;", "Ljw7;", "Ljava/io/Serializable;", "Lpf0;", Image.TYPE_HIGH, "Lpf0;", "getBrandName", "()Lpf0;", "brandName", "", "id", "acquirerName", "Ldt7;", "paymentIntegrationType", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpf0;Ldt7;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$i */
    /* loaded from: classes2.dex */
    public static final class i extends jw7 implements Serializable {
        private final pf0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, pf0 pf0Var, dt7 dt7Var, int i) {
            super(str, str2, dt7Var, du7.o, i, false, 32, null);
            z65.h(str, "id");
            z65.h(str2, "acquirerName");
            z65.h(pf0Var, "brandName");
            z65.h(dt7Var, "paymentIntegrationType");
            this.h = pf0Var;
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljw7$j;", "Ljw7;", "Ljava/io/Serializable;", "", "id", "", "priority", "<init>", "(Ljava/lang/String;I)V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw7$j */
    /* loaded from: classes2.dex */
    public static final class j extends jw7 implements Serializable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, int i) {
            super(str, "", dt7.b, du7.g, i, false, 32, null);
            z65.h(str, "id");
        }
    }

    /* compiled from: PaymentWay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jw7$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class k {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[du7.values().length];
            try {
                iArr[du7.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[du7.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[du7.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[du7.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[du7.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[du7.n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[du7.o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[du7.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[du7.k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[du7.l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[du7.i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ jw7(String str, String str2, dt7 dt7Var, du7 du7Var, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dt7Var, du7Var, i2, z);
    }

    public String a() {
        return this.b;
    }

    public dt7 b() {
        return this.c;
    }

    public du7 c() {
        return this.d;
    }

    public final iw7 d() {
        switch (k.$EnumSwitchMapping$0[c().ordinal()]) {
            case 1:
                return iw7.k;
            case 2:
                return iw7.c;
            case 3:
                return iw7.g;
            case 4:
                return iw7.f;
            case 5:
                return iw7.h;
            case 6:
                return iw7.i;
            case 7:
                return iw7.j;
            case 8:
            case 9:
            case 10:
                return iw7.d;
            case 11:
                throw new IllegalArgumentException("The payment type is not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(cls2, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type com.dodopizza.payment.impl.PaymentWay");
        if (z65.c(getId(), ((jw7) obj).getId())) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f;
    }

    public String getId() {
        return this.a;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private jw7(String str, String str2, dt7 dt7Var, du7 du7Var, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = dt7Var;
        this.d = du7Var;
        this.e = i2;
        this.f = z;
    }

    public /* synthetic */ jw7(String str, String str2, dt7 dt7Var, du7 du7Var, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dt7Var, du7Var, i2, (i3 & 32) != 0 ? false : z, null);
    }
}

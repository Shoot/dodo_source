package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RatingAnalytics.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001d\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0006JM\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bJ\u0016\u0010\"\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b¨\u0006'"}, d2 = {"Lc59;", "", "Lbc;", "", "value", "n", "", "binaryRatingPositive", Image.TYPE_MEDIUM, "(Lbc;Ljava/lang/Boolean;)Lbc;", "checked", "", DateTokenConverter.CONVERTER_KEY, "Lqd;", "sender", "orderId", "rating", "Ldc;", com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "(Ljava/lang/String;Ljava/lang/Boolean;)Ldc;", "", "selectedTagsTitles", "isTipsAvailable", "tipsAmount", "comment", "isAutoSubmission", "i", "j", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Collection;ZILjava/lang/String;Z)Ldc;", "k", "l", com.huawei.hms.opendevice.c.a, "<init>", "()V", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c59  reason: default package */
/* loaded from: classes4.dex */
public final class c59 {
    public static final c59 a = new c59();

    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lc59$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "b", "Ljava/lang/String;", "orderId", "<init>", "(Lqd;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c59$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final qd a;
        private final String b;

        public a(qd qdVar, String str) {
            z65.h(qdVar, "sender");
            z65.h(str, "orderId");
            this.a = qdVar;
            this.b = str;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.t(vc.z(new bc("feedback_module_shown"), this.a), this.b).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            String str = this.b;
            return "RatingModuleShown(sender=" + qdVar + ", orderId=" + str + ")";
        }
    }

    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lc59$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "orderId", "b", "Z", "isTipsAvailable", "Lqd;", com.huawei.hms.opendevice.c.a, "Lqd;", "sender", "<init>", "(Ljava/lang/String;ZLqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c59$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final boolean b;
        private final qd c;

        public b(String str, boolean z, qd qdVar) {
            z65.h(str, "orderId");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = z;
            this.c = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(bc.e(vc.t(new bc("screen_feedback"), this.a), "tips_available", Boolean.valueOf(this.b), false, 4, null), this.c).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b && z65.c(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            qd qdVar = this.c;
            return "RatingShowScreenEvent(orderId=" + str + ", isTipsAvailable=" + z + ", sender=" + qdVar + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.t(bcVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd qdVar, String str, int i) {
            super(1);
            this.a = qdVar;
            this.b = str;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            vc.t(bcVar, this.b);
            return c59.a.n(bcVar, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qd qdVar, String str, boolean z) {
            super(1);
            this.a = qdVar;
            this.b = str;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            vc.t(bcVar, this.b);
            return c59.a.m(bcVar, Boolean.valueOf(this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, int i) {
            super(1);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            return c59.a.n(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Boolean bool) {
            super(1);
            this.a = str;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            return c59.a.m(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ Collection<String> c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;
        final /* synthetic */ String f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, int i, Collection<String> collection, boolean z, int i2, String str2, boolean z2) {
            super(1);
            this.a = str;
            this.b = i;
            this.c = collection;
            this.d = z;
            this.e = i2;
            this.f = str2;
            this.g = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            c59.a.n(bcVar, this.b);
            bc.e(bcVar, "tags", this.c, false, 4, null);
            bc.e(bcVar, "tips_available", Boolean.valueOf(this.d), false, 4, null);
            bc.e(bcVar, "tips", Integer.valueOf(this.e), false, 4, null);
            bc.e(bcVar, "comment", this.f, false, 4, null);
            return bc.e(bcVar, "autoSubmit", Boolean.valueOf(this.g), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$i */
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ Boolean b;
        final /* synthetic */ Collection<String> c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;
        final /* synthetic */ String f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Boolean bool, Collection<String> collection, boolean z, int i, String str2, boolean z2) {
            super(1);
            this.a = str;
            this.b = bool;
            this.c = collection;
            this.d = z;
            this.e = i;
            this.f = str2;
            this.g = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            c59.a.m(bcVar, this.b);
            bc.e(bcVar, "tags", this.c, false, 4, null);
            bc.e(bcVar, "tips_available", Boolean.valueOf(this.d), false, 4, null);
            bc.e(bcVar, "tips", Integer.valueOf(this.e), false, 4, null);
            bc.e(bcVar, "comment", this.f, false, 4, null);
            return bc.e(bcVar, "autoSubmit", Boolean.valueOf(this.g), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qd qdVar, String str) {
            super(1);
            this.a = qdVar;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return vc.t(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c59$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.t(bcVar, this.a);
        }
    }

    private c59() {
    }

    private final String d(boolean z) {
        if (z) {
            return "contact_me_switch_turn_on";
        }
        return "contact_me_switch_turn_off";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc m(bc bcVar, Boolean bool) {
        return bc.e(bcVar, "binaryRatingPositive", bool, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc n(bc bcVar, int i2) {
        return bc.e(bcVar, "rating", Integer.valueOf(i2), false, 4, null);
    }

    public final dc c(boolean z, String str) {
        z65.h(str, "orderId");
        return ec.a(d(z), new c(str));
    }

    public final dc e(qd qdVar, String str, int i2) {
        z65.h(qdVar, "sender");
        z65.h(str, "orderId");
        return ec.a("change_feedback", new d(qdVar, str, i2));
    }

    public final dc f(qd qdVar, String str, boolean z) {
        z65.h(qdVar, "sender");
        z65.h(str, "orderId");
        return ec.a("change_feedback", new e(qdVar, str, z));
    }

    public final dc g(String str, int i2) {
        z65.h(str, "orderId");
        return ec.a("close_feedback", new f(str, i2));
    }

    public final dc h(String str, Boolean bool) {
        z65.h(str, "orderId");
        return ec.a("close_feedback", new g(str, bool));
    }

    public final dc i(String str, int i2, Collection<String> collection, boolean z, int i3, String str2, boolean z2) {
        z65.h(str, "orderId");
        z65.h(collection, "selectedTagsTitles");
        z65.h(str2, "comment");
        return ec.a("share_feedback", new h(str, i2, collection, z, i3, str2, z2));
    }

    public final dc j(String str, Boolean bool, Collection<String> collection, boolean z, int i2, String str2, boolean z2) {
        z65.h(str, "orderId");
        z65.h(collection, "selectedTagsTitles");
        z65.h(str2, "comment");
        return ec.a("share_feedback", new i(str, bool, collection, z, i2, str2, z2));
    }

    public final dc k(qd qdVar, String str) {
        z65.h(qdVar, "sender");
        z65.h(str, "orderId");
        return ec.a("ready_to_display_binary_feedback", new j(qdVar, str));
    }

    public final dc l(String str) {
        z65.h(str, "orderId");
        return ec.a("ready_to_display_contact_me_switch", new k(str));
    }
}

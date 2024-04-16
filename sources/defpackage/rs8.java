package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PushAnalytics.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004%&'\rB\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001c\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\f\u0010\u000f\u001a\u00020\u0002*\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\nH\u0002J\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\u0002*\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 ¨\u0006("}, d2 = {"Lrs8;", "", "", "title", "text", "g", "Lbc;", "Lrs8$a;", "status", "n", "Lj37;", "previousStatus", "currentStatus", DateTokenConverter.CONVERTER_KEY, "", Image.TYPE_MEDIUM, "", com.huawei.hms.push.e.a, "f", "Lj17;", "l", "Lqd;", "sender", "Ldc;", Image.TYPE_HIGH, "", "rating", "k", "orderId", "Lmi7;", "orderState", "j", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "i", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rs8  reason: default package */
/* loaded from: classes4.dex */
public final class rs8 {
    public static final rs8 a = new rs8();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lrs8$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "status", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "changedChannels", com.huawei.hms.opendevice.c.a, "activeChannels", "declinedChannels", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rs8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final String a;
        private final Set<String> b;
        private final Set<String> c;
        private final Set<String> d;

        public a(String str, Set<String> set, Set<String> set2, Set<String> set3) {
            z65.h(str, "status");
            z65.h(set, "changedChannels");
            z65.h(set2, "activeChannels");
            z65.h(set3, "declinedChannels");
            this.a = str;
            this.b = set;
            this.c = set2;
            this.d = set3;
        }

        public final Set<String> a() {
            return this.c;
        }

        public final Set<String> b() {
            return this.b;
        }

        public final Set<String> c() {
            return this.d;
        }

        public final String d() {
            return this.a;
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
            String str = this.a;
            Set<String> set = this.b;
            Set<String> set2 = this.c;
            Set<String> set3 = this.d;
            return "AnalyticsNotificationsStatus(status=" + str + ", changedChannels=" + set + ", activeChannels=" + set2 + ", declinedChannels=" + set3 + ")";
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, d2 = {"Lrs8$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "deeplink", "b", "getTitle", "title", com.huawei.hms.opendevice.c.a, "getText", "text", DateTokenConverter.CONVERTER_KEY, "getSender", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rs8$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public b(String str, String str2, String str3, String str4) {
            z65.h(str, "deeplink");
            z65.h(str4, "sender");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.A(bc.e(bc.e(new bc("push_click"), "deeplink", this.a, false, 4, null), "text", rs8.a.g(this.b, this.c), false, 4, null), this.d).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            String str = this.b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((i2 + i) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            return "PushClicked(deeplink=" + str + ", title=" + str2 + ", text=" + str3 + ", sender=" + str4 + ")";
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010*\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000e¨\u0006-"}, d2 = {"Lrs8$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "deeplink", "b", "getStatus", "status", com.huawei.hms.opendevice.c.a, "getTitle", "title", DateTokenConverter.CONVERTER_KEY, "getText", "text", "Lqd;", com.huawei.hms.push.e.a, "Lqd;", "getSender", "()Lqd;", "sender", "f", "getOrderId", "orderId", "Lmi7;", "g", "Lmi7;", "getOrderStatus", "()Lmi7;", "orderStatus", Image.TYPE_HIGH, "getUniqueKey", "uniqueKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd;Ljava/lang/String;Lmi7;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rs8$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final qd e;
        private final String f;
        private final mi7 g;
        private final String h;

        public c(String str, String str2, String str3, String str4, qd qdVar, String str5, mi7 mi7Var, String str6) {
            z65.h(str, "deeplink");
            z65.h(str2, "status");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = qdVar;
            this.f = str5;
            this.g = mi7Var;
            this.h = str6;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(vc.r(vc.t(bc.e(bc.e(bc.e(bc.e(new bc("push_delivered"), "deeplink", this.a, false, 4, null), "status", this.b, false, 4, null), "text", rs8.a.g(this.c, this.d), false, 4, null), "uniqueKey", this.h, false, 4, null), this.f), "order_status", this.g), this.e).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c) && z65.c(this.d, cVar.d) && z65.c(this.e, cVar.e) && z65.c(this.f, cVar.f) && this.g == cVar.g && z65.c(this.h, cVar.h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            String str = this.c;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            String str2 = this.d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode6 = (((i2 + hashCode2) * 31) + this.e.hashCode()) * 31;
            String str3 = this.f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = (hashCode6 + hashCode3) * 31;
            mi7 mi7Var = this.g;
            if (mi7Var == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = mi7Var.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            String str4 = this.h;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            qd qdVar = this.e;
            String str5 = this.f;
            mi7 mi7Var = this.g;
            String str6 = this.h;
            return "PushDelivered(deeplink=" + str + ", status=" + str2 + ", title=" + str3 + ", text=" + str4 + ", sender=" + qdVar + ", orderId=" + str5 + ", orderStatus=" + mi7Var + ", uniqueKey=" + str6 + ")";
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, qd qdVar, String str5, mi7 mi7Var, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, qdVar, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : mi7Var, (i & 128) != 0 ? null : str6);
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lrs8$d;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lj37;", "Lj37;", "getPreviousStatus", "()Lj37;", "previousStatus", "b", "getCurrentStatus", "currentStatus", "Lqd;", com.huawei.hms.opendevice.c.a, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Lj37;Lj37;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rs8$d */
    /* loaded from: classes4.dex */
    public static final class d implements dc {
        private final j37 a;
        private final j37 b;
        private final qd c;

        public d(j37 j37Var, j37 j37Var2, qd qdVar) {
            z65.h(j37Var2, "currentStatus");
            z65.h(qdVar, "sender");
            this.a = j37Var;
            this.b = j37Var2;
            this.c = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            rs8 rs8Var = rs8.a;
            return vc.z(rs8Var.n(new bc("push_status_changed"), rs8Var.d(this.a, this.b)), this.c).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.a, dVar.a) && z65.c(this.b, dVar.b) && z65.c(this.c, dVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            j37 j37Var = this.a;
            if (j37Var == null) {
                hashCode = 0;
            } else {
                hashCode = j37Var.hashCode();
            }
            return (((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            j37 j37Var = this.a;
            j37 j37Var2 = this.b;
            qd qdVar = this.c;
            return "PushStatusEvent(previousStatus=" + j37Var + ", currentStatus=" + j37Var2 + ", sender=" + qdVar + ")";
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rs8$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j17.values().length];
            try {
                iArr[j17.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j17.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j17.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rs8$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, this.a);
        }
    }

    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rs8$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ mi7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, mi7 mi7Var) {
            super(1);
            this.a = str;
            this.b = mi7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            return vc.r(bcVar, "order_status", this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rs8$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i) {
            super(1);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "rating", Integer.valueOf(this.a), false, 4, null);
        }
    }

    private rs8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a d(j37 j37Var, j37 j37Var2) {
        Set<String> e2;
        Set<String> e3;
        Set z0;
        Set z02;
        Set i;
        String m = m(j37Var2.c());
        if (j37Var == null || (e2 = e(j37Var)) == null) {
            e2 = sfa.e();
        }
        Set<String> e4 = e(j37Var2);
        if (j37Var == null || (e3 = f(j37Var)) == null) {
            e3 = sfa.e();
        }
        Set<String> f2 = f(j37Var2);
        z0 = sc1.z0(e4, e2);
        z02 = sc1.z0(f2, e3);
        i = tfa.i(z0, z02);
        return new a(m, i, e4, f2);
    }

    private final Set<String> e(j37 j37Var) {
        Set b2;
        int w;
        Set<String> a2;
        b2 = rfa.b();
        Set<j17> b3 = j37Var.b();
        w = lc1.w(b3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (j17 j17Var : b3) {
            arrayList.add(a.l(j17Var));
        }
        b2.addAll(arrayList);
        if (j37Var.c()) {
            b2.add("notifications");
        }
        a2 = rfa.a(b2);
        return a2;
    }

    private final Set<String> f(j37 j37Var) {
        Set b2;
        int w;
        Set<String> a2;
        b2 = rfa.b();
        Set<j17> a3 = j37Var.a();
        w = lc1.w(a3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (j17 j17Var : a3) {
            arrayList.add(a.l(j17Var));
        }
        b2.addAll(arrayList);
        if (!j37Var.c()) {
            b2.add("notifications");
        }
        a2 = rfa.a(b2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(String str, String str2) {
        return str + " | " + str2;
    }

    private final String l(j17 j17Var) {
        int i = e.$EnumSwitchMapping$0[j17Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "chat";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "system";
        }
        return "mindbox";
    }

    private final String m(boolean z) {
        if (z) {
            return "active";
        }
        if (!z) {
            return "declined";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc n(bc bcVar, a aVar) {
        bc.e(bcVar, "status", aVar.d(), false, 4, null);
        bc.e(bcVar, "changed_channels", aVar.b(), false, 4, null);
        bc.e(bcVar, "active_channels", aVar.a(), false, 4, null);
        bc.e(bcVar, "declined_channels", aVar.c(), false, 4, null);
        return bcVar;
    }

    public final dc h(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("notification_permission", new f(qdVar));
    }

    public final String i(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return m(t27.d(context).a());
    }

    public final dc j(String str, mi7 mi7Var) {
        z65.h(str, "orderId");
        z65.h(mi7Var, "orderState");
        return ec.a("push_close", new g(str, mi7Var));
    }

    public final dc k(int i) {
        return ec.a("rate_order_push_change_feedback", new h(i));
    }
}

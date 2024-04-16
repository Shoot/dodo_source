package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0007\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Ldy0;", "", "Lqd;", "sender", "Ldy0$a;", "chatChannel", "Ldc;", "a", "<init>", "()V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dy0  reason: default package */
/* loaded from: classes4.dex */
public final class dy0 {
    public static final dy0 a = new dy0();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\n¨\u0006\u000b"}, d2 = {"Ldy0$a;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "eventParamValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a b = new a("NATIVE_CHAT", 0, "native_chat");
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;
        private final String a;

        static {
            a[] a = a();
            c = a;
            d = lj3.a(a);
        }

        private a(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\n¨\u0006\u000b"}, d2 = {"Ldy0$b;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "eventParamValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final b b = new b("EDNA", 0, "edna_sdk");
        private static final /* synthetic */ b[] c;
        private static final /* synthetic */ kj3 d;
        private final String a;

        static {
            b[] a = a();
            c = a;
            d = lj3.a(a);
        }

        private b(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    /* compiled from: ChatAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ldy0$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldy0$b;", "Ldy0$b;", "getChatSdk", "()Ldy0$b;", "chatSdk", "<init>", "(Ldy0$b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy0$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final b a;

        public c(b bVar) {
            z65.h(bVar, "chatSdk");
            this.a = bVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(new bc("close_chat"), "chat_channel", this.a.i(), false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            b bVar = this.a;
            return "CloseNativeChatScreenEvent(chatSdk=" + bVar + ")";
        }
    }

    /* compiled from: ChatAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ldy0$d;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldy0$b;", "Ldy0$b;", "getChatSdk", "()Ldy0$b;", "chatSdk", "<init>", "(Ldy0$b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy0$d */
    /* loaded from: classes4.dex */
    public static final class d implements dc {
        private final b a;

        public d(b bVar) {
            z65.h(bVar, "chatSdk");
            this.a = bVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(new bc("screen_native_chat"), "chat_channel", this.a.i(), false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.a == ((d) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            b bVar = this.a;
            return "OpenNativeChatScreenEvent(chatSdk=" + bVar + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dy0$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ a a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a aVar, qd qdVar) {
            super(1);
            this.a = aVar;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "chat_channel", this.a.i(), false, 4, null);
            return vc.z(bcVar, this.b);
        }
    }

    private dy0() {
    }

    public final dc a(qd qdVar, a aVar) {
        z65.h(qdVar, "sender");
        z65.h(aVar, "chatChannel");
        return ec.a("click_on_chat", new e(aVar, qdVar));
    }
}

package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ContactsAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Ljs1;", "", "Lbqa;", "socialNetwork", "", "b", "<init>", "()V", "a", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: js1  reason: default package */
/* loaded from: classes4.dex */
public final class js1 {
    public static final js1 a = new js1();

    /* compiled from: ContactsAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljs1$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Lqd;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: js1$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final qd a;

        public a(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(new bc("click_on_email"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            return "ClickOnEmail(sender=" + qdVar + ")";
        }
    }

    /* compiled from: ContactsAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljs1$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Lqd;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: js1$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final qd a;

        public b(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(new bc("click_on_open_map"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            return "ClickOnOpenMap(sender=" + qdVar + ")";
        }
    }

    /* compiled from: ContactsAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ljs1$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "Lbqa;", "b", "Lbqa;", "getSocialNetwork", "()Lbqa;", "socialNetwork", "<init>", "(Lqd;Lbqa;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: js1$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final qd a;
        private final bqa b;

        public c(qd qdVar, bqa bqaVar) {
            z65.h(qdVar, "sender");
            z65.h(bqaVar, "socialNetwork");
            this.a = qdVar;
            this.b = bqaVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(vc.z(new bc("click_on_social_network"), this.a), "social_network", js1.a.b(this.b), false, 4, null).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && this.b == cVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            bqa bqaVar = this.b;
            return "ClickOnSocialNetwork(sender=" + qdVar + ", socialNetwork=" + bqaVar + ")";
        }
    }

    /* compiled from: ContactsAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: js1$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bqa.values().length];
            try {
                iArr[bqa.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bqa.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bqa.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bqa.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bqa.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private js1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(bqa bqaVar) {
        int i = d.$EnumSwitchMapping$0[bqaVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "twitter";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "youtube";
                }
                return "instagram";
            }
            return "facebook";
        }
        return "vk";
    }
}

package defpackage;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ExternalLinkAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lao3;", "", "", ElementGenerator.TYPE_LINK, "Lqd;", "sender", "Ldc;", "a", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ao3  reason: default package */
/* loaded from: classes4.dex */
public final class ao3 {
    public static final ao3 a = new ao3();

    /* compiled from: ExternalLinkAnalytics.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lao3$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", ElementGenerator.TYPE_LINK, "Lym$d;", "b", "Lym$d;", "getSender", "()Lym$d;", "sender", "<init>", "(Ljava/lang/String;Lym$d;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ao3$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final String a;
        private final ym.d b;

        public a(String str, ym.d dVar) {
            z65.h(str, ElementGenerator.TYPE_LINK);
            z65.h(dVar, "sender");
            this.a = str;
            this.b = dVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.A(bc.e(new bc("open_link"), ElementGenerator.TYPE_LINK, this.a, false, 4, null), this.b.i()).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            ym.d dVar = this.b;
            return "OpenLink(link=" + str + ", sender=" + dVar + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExternalLinkAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ao3$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qd qdVar) {
            super(1);
            this.a = str;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, ElementGenerator.TYPE_LINK, this.a, false, 4, null);
            return vc.z(bcVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExternalLinkAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ao3$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, qd qdVar) {
            super(1);
            this.a = str;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, ElementGenerator.TYPE_LINK, this.a, false, 4, null);
            return vc.z(bcVar, this.b);
        }
    }

    private ao3() {
    }

    public final dc a(String str, qd qdVar) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        z65.h(qdVar, "sender");
        return ec.a("open_link", new b(str, qdVar));
    }

    public final dc b(String str, qd qdVar) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        z65.h(qdVar, "sender");
        return ec.a("open_link_error", new c(str, qdVar));
    }
}

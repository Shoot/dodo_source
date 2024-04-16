package defpackage;

import kotlin.Metadata;
/* compiled from: AssistantSharingVO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljw;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnt;", "a", "Lnt;", "b", "()Lnt;", "result", "Ljw$a;", "Ljw$a;", "()Ljw$a;", "logo", "<init>", "(Lnt;Ljw$a;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jw  reason: default package */
/* loaded from: classes2.dex */
public final class jw {
    private final nt a;
    private final a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssistantSharingVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ljw$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jw$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a("DEFAULT", 0);
        public static final a b = new a("ARABIC", 1);
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public jw(nt ntVar, a aVar) {
        z65.h(ntVar, "result");
        z65.h(aVar, "logo");
        this.a = ntVar;
        this.b = aVar;
    }

    public final a a() {
        return this.b;
    }

    public final nt b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        if (z65.c(this.a, jwVar.a) && this.b == jwVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        nt ntVar = this.a;
        a aVar = this.b;
        return "AssistantSharingVO(result=" + ntVar + ", logo=" + aVar + ")";
    }
}

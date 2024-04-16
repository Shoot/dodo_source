package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ULong.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\r¨\u0006\u0016"}, d2 = {"Lopb;", "", "", "o", "(J)Ljava/lang/String;", "", "k", "(J)I", "", "other", "", Image.TYPE_HIGH, "(JLjava/lang/Object;)Z", "", "a", "J", "getData$annotations", "()V", "data", "g", "(J)J", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: opb  reason: default package */
/* loaded from: classes3.dex */
public final class opb implements Comparable<opb> {
    public static final a b = new a(null);
    private final long a;

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\f"}, d2 = {"Lopb$a;", "", "Lopb;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: opb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ opb(long j) {
        this.a = j;
    }

    public static final /* synthetic */ opb a(long j) {
        return new opb(j);
    }

    public static boolean h(long j, Object obj) {
        if (!(obj instanceof opb) || j != ((opb) obj).p()) {
            return false;
        }
        return true;
    }

    public static final boolean i(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static int k(long j) {
        return ax1.a(j);
    }

    public static String o(long j) {
        return krb.c(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(opb opbVar) {
        return krb.a(p(), opbVar.p());
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ long p() {
        return this.a;
    }

    public String toString() {
        return o(this.a);
    }

    public static long g(long j) {
        return j;
    }
}

package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyMission.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lxl6;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", "Lxl6$a;", "Lxl6$b;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xl6  reason: default package */
/* loaded from: classes4.dex */
public abstract class xl6 implements Serializable {

    /* compiled from: LoyaltyMission.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxl6$a;", "Lxl6;", "Ljava/io/Serializable;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl6$a */
    /* loaded from: classes4.dex */
    public static final class a extends xl6 implements Serializable {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: LoyaltyMission.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lxl6$b;", "Lxl6;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "answerMaxLimit", "b", "answerMinLength", "<init>", "(II)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl6$b */
    /* loaded from: classes4.dex */
    public static final class b extends xl6 implements Serializable {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            super(null);
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            int i = this.a;
            int i2 = this.b;
            return "SocialType(answerMaxLimit=" + i + ", answerMinLength=" + i2 + ")";
        }
    }

    private xl6() {
    }

    public /* synthetic */ xl6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

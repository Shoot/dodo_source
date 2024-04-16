package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ContactMeSwitchFeatureState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcs1;", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lcs1$a;", "Lcs1$b;", "Lcs1$c;", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cs1  reason: default package */
/* loaded from: classes.dex */
public interface cs1 {

    /* compiled from: ContactMeSwitchFeatureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcs1$a;", "Lcs1;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cs1$a */
    /* loaded from: classes.dex */
    public static final class a implements cs1 {
        public static final a a = new a();

        private a() {
        }
    }

    /* compiled from: ContactMeSwitchFeatureState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcs1$b;", "Lcs1;", "", "toString", "", "hashCode", "", "other", "", "equals", "Les1;", "a", "Les1;", "()Les1;", MessageAttributes.TYPE, "<init>", "(Les1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cs1$b */
    /* loaded from: classes.dex */
    public static final class b implements cs1 {
        private final es1 a;

        public b(es1 es1Var) {
            z65.h(es1Var, MessageAttributes.TYPE);
            this.a = es1Var;
        }

        public final es1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            es1 es1Var = this.a;
            return "Enabled(type=" + es1Var + ")";
        }
    }

    /* compiled from: ContactMeSwitchFeatureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcs1$c;", "Lcs1;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cs1$c */
    /* loaded from: classes.dex */
    public static final class c implements cs1 {
        public static final c a = new c();

        private c() {
        }
    }
}

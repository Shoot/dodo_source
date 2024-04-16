package defpackage;

import java.io.Serializable;
/* compiled from: Clock.java */
/* renamed from: w91  reason: default package */
/* loaded from: classes3.dex */
public abstract class w91 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clock.java */
    /* renamed from: w91$a */
    /* loaded from: classes3.dex */
    public static final class a extends w91 implements Serializable {
        private final vcc a;

        a(vcc vccVar) {
            this.a = vccVar;
        }

        @Override // defpackage.w91
        public b55 a() {
            return b55.h0(c());
        }

        public long c() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.a + "]";
        }
    }

    protected w91() {
    }

    public static w91 b() {
        return new a(wcc.h);
    }

    public abstract b55 a();
}

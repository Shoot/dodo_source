package defpackage;

import java.util.Locale;
/* compiled from: OrderedCollectionChangeSet.java */
/* renamed from: xl7  reason: default package */
/* loaded from: classes3.dex */
public interface xl7 {

    /* compiled from: OrderedCollectionChangeSet.java */
    /* renamed from: xl7$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    /* compiled from: OrderedCollectionChangeSet.java */
    /* renamed from: xl7$b */
    /* loaded from: classes3.dex */
    public enum b {
        INITIAL,
        UPDATE,
        ERROR
    }
}

package defpackage;

import androidx.annotation.NonNull;
/* compiled from: HeartBeatInfo.java */
/* renamed from: rn4  reason: default package */
/* loaded from: classes2.dex */
public interface rn4 {

    /* compiled from: HeartBeatInfo.java */
    /* renamed from: rn4$a */
    /* loaded from: classes2.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int a;

        a(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    @NonNull
    a b(@NonNull String str);
}

package defpackage;

import androidx.annotation.NonNull;
import defpackage.w86;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MarkwonSpansFactoryImpl.java */
/* renamed from: x86  reason: default package */
/* loaded from: classes3.dex */
class x86 implements w86 {
    private final Map<Class<? extends jz6>, tqa> a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    /* renamed from: x86$a */
    /* loaded from: classes3.dex */
    static class a implements w86.a {
        private final Map<Class<? extends jz6>, tqa> a = new HashMap(3);

        @Override // defpackage.w86.a
        @NonNull
        public w86 a() {
            return new x86(Collections.unmodifiableMap(this.a));
        }

        @Override // defpackage.w86.a
        @NonNull
        public <N extends jz6> w86.a b(@NonNull Class<N> cls, tqa tqaVar) {
            if (tqaVar == null) {
                this.a.remove(cls);
            } else {
                this.a.put(cls, tqaVar);
            }
            return this;
        }
    }

    x86(@NonNull Map<Class<? extends jz6>, tqa> map) {
        this.a = map;
    }

    @Override // defpackage.w86
    public <N extends jz6> tqa a(@NonNull Class<N> cls) {
        return this.a.get(cls);
    }
}

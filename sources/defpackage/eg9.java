package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
/* compiled from: RenderPropsImpl.java */
/* renamed from: eg9  reason: default package */
/* loaded from: classes3.dex */
class eg9 implements dg9 {
    private final Map<oq8, Object> a = new HashMap(3);

    @Override // defpackage.dg9
    public <T> T a(@NonNull oq8<T> oq8Var) {
        return (T) this.a.get(oq8Var);
    }

    @Override // defpackage.dg9
    @NonNull
    public <T> T b(@NonNull oq8<T> oq8Var, @NonNull T t) {
        T t2 = (T) this.a.get(oq8Var);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    @Override // defpackage.dg9
    public <T> void c(@NonNull oq8<T> oq8Var, T t) {
        if (t == null) {
            this.a.remove(oq8Var);
        } else {
            this.a.put(oq8Var, t);
        }
    }
}

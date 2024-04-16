package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
class m implements se5 {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final se5 g;
    private final Map<Class<?>, tkb<?>> h;
    private final ac7 i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Object obj, se5 se5Var, int i, int i2, Map<Class<?>, tkb<?>> map, Class<?> cls, Class<?> cls2, ac7 ac7Var) {
        this.b = eh8.d(obj);
        this.g = (se5) eh8.e(se5Var, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) eh8.d(map);
        this.e = (Class) eh8.e(cls, "Resource class must not be null");
        this.f = (Class) eh8.e(cls2, "Transcode class must not be null");
        this.i = (ac7) eh8.d(ac7Var);
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.b.equals(mVar.b) || !this.g.equals(mVar.g) || this.d != mVar.d || this.c != mVar.c || !this.h.equals(mVar.h) || !this.e.equals(mVar.e) || !this.f.equals(mVar.f) || !this.i.equals(mVar.i)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + CoreConstants.CURLY_RIGHT;
    }
}

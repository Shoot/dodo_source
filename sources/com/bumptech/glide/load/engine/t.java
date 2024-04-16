package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
final class t implements se5 {
    private static final i36<Class<?>, byte[]> j = new i36<>(50);
    private final mr b;
    private final se5 c;
    private final se5 d;
    private final int e;
    private final int f;
    private final Class<?> g;
    private final ac7 h;
    private final tkb<?> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(mr mrVar, se5 se5Var, se5 se5Var2, int i, int i2, tkb<?> tkbVar, Class<?> cls, ac7 ac7Var) {
        this.b = mrVar;
        this.c = se5Var;
        this.d = se5Var2;
        this.e = i;
        this.f = i2;
        this.i = tkbVar;
        this.g = cls;
        this.h = ac7Var;
    }

    private byte[] c() {
        i36<Class<?>, byte[]> i36Var = j;
        byte[] g = i36Var.g(this.g);
        if (g == null) {
            byte[] bytes = this.g.getName().getBytes(se5.a);
            i36Var.k(this.g, bytes);
            return bytes;
        }
        return g;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        tkb<?> tkbVar = this.i;
        if (tkbVar != null) {
            tkbVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        messageDigest.update(c());
        this.b.put(bArr);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f != tVar.f || this.e != tVar.e || !vub.e(this.i, tVar.i) || !this.g.equals(tVar.g) || !this.c.equals(tVar.c) || !this.d.equals(tVar.d) || !this.h.equals(tVar.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        tkb<?> tkbVar = this.i;
        if (tkbVar != null) {
            hashCode = (hashCode * 31) + tkbVar.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.h + CoreConstants.CURLY_RIGHT;
    }
}

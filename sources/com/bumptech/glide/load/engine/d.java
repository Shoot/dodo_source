package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
final class d implements se5 {
    private final se5 b;
    private final se5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(se5 se5Var, se5 se5Var2) {
        this.b = se5Var;
        this.c = se5Var2;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.b.equals(dVar.b) || !this.c.equals(dVar.c)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}

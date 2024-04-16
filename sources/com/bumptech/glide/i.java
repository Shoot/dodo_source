package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.i;
/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class i<CHILD extends i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private elb<? super TranscodeType> a = iz6.c();

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final elb<? super TranscodeType> c() {
        return this.a;
    }

    @NonNull
    public final CHILD e(@NonNull elb<? super TranscodeType> elbVar) {
        this.a = (elb) eh8.d(elbVar);
        return d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return vub.e(this.a, ((i) obj).a);
        }
        return false;
    }

    public int hashCode() {
        elb<? super TranscodeType> elbVar = this.a;
        if (elbVar != null) {
            return elbVar.hashCode();
        }
        return 0;
    }

    private CHILD d() {
        return this;
    }
}

package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import defpackage.b33;
import java.io.File;
/* compiled from: DataCacheWriter.java */
/* loaded from: classes.dex */
class e<DataType> implements b33.b {
    private final bh3<DataType> a;
    private final DataType b;
    private final ac7 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(bh3<DataType> bh3Var, DataType datatype, ac7 ac7Var) {
        this.a = bh3Var;
        this.b = datatype;
        this.c = ac7Var;
    }

    @Override // defpackage.b33.b
    public boolean a(@NonNull File file) {
        return this.a.a(this.b, file, this.c);
    }
}

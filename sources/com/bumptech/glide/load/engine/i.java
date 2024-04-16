package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends rj9<DataType, ResourceType>> b;
    private final ck9<ResourceType, Transcode> c;
    private final jf8<List<Throwable>> d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodePath.java */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        @NonNull
        nj9<ResourceType> a(@NonNull nj9<ResourceType> nj9Var);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends rj9<DataType, ResourceType>> list, ck9<ResourceType, Transcode> ck9Var, jf8<List<Throwable>> jf8Var) {
        this.a = cls;
        this.b = list;
        this.c = ck9Var;
        this.d = jf8Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    private nj9<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull ac7 ac7Var) throws GlideException {
        List<Throwable> list = (List) eh8.d(this.d.b());
        try {
            return c(aVar, i, i2, ac7Var, list);
        } finally {
            this.d.a(list);
        }
    }

    @NonNull
    private nj9<ResourceType> c(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull ac7 ac7Var, List<Throwable> list) throws GlideException {
        int size = this.b.size();
        nj9<ResourceType> nj9Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            rj9<DataType, ResourceType> rj9Var = this.b.get(i3);
            try {
                if (rj9Var.a(aVar.a(), ac7Var)) {
                    nj9Var = rj9Var.b(aVar.a(), i, i2, ac7Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + rj9Var, e);
                }
                list.add(e);
            }
            if (nj9Var != null) {
                break;
            }
        }
        if (nj9Var != null) {
            return nj9Var;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public nj9<Transcode> a(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull ac7 ac7Var, a<ResourceType> aVar2) throws GlideException {
        return this.c.a(aVar2.a(b(aVar, i, i2, ac7Var)), ac7Var);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}

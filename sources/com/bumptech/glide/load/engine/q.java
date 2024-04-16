package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public class q<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final jf8<List<Throwable>> b;
    private final List<? extends i<Data, ResourceType, Transcode>> c;
    private final String d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, jf8<List<Throwable>> jf8Var) {
        this.a = cls;
        this.b = jf8Var;
        this.c = (List) eh8.c(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private nj9<Transcode> b(com.bumptech.glide.load.data.a<Data> aVar, @NonNull ac7 ac7Var, int i, int i2, i.a<ResourceType> aVar2, List<Throwable> list) throws GlideException {
        int size = this.c.size();
        nj9<Transcode> nj9Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                nj9Var = this.c.get(i3).a(aVar, i, i2, ac7Var, aVar2);
            } catch (GlideException e) {
                list.add(e);
            }
            if (nj9Var != null) {
                break;
            }
        }
        if (nj9Var != null) {
            return nj9Var;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public nj9<Transcode> a(com.bumptech.glide.load.data.a<Data> aVar, @NonNull ac7 ac7Var, int i, int i2, i.a<ResourceType> aVar2) throws GlideException {
        List<Throwable> list = (List) eh8.d(this.b.b());
        try {
            return b(aVar, ac7Var, i, i2, aVar2, list);
        } finally {
            this.b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}

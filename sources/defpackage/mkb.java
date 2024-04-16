package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TranscoderRegistry.java */
/* renamed from: mkb  reason: default package */
/* loaded from: classes.dex */
public class mkb {
    private final List<a<?, ?>> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TranscoderRegistry.java */
    /* renamed from: mkb$a */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {
        final Class<Z> a;
        final Class<R> b;
        final ck9<Z, R> c;

        a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ck9<Z, R> ck9Var) {
            this.a = cls;
            this.b = cls2;
            this.c = ck9Var;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b)) {
                return true;
            }
            return false;
        }
    }

    @NonNull
    public synchronized <Z, R> ck9<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return tqb.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (ck9<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ck9<Z, R> ck9Var) {
        this.a.add(new a<>(cls, cls2, ck9Var));
    }
}

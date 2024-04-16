package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ResourceDecoderRegistry.java */
/* renamed from: sj9  reason: default package */
/* loaded from: classes.dex */
public class sj9 {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceDecoderRegistry.java */
    /* renamed from: sj9$a */
    /* loaded from: classes.dex */
    public static class a<T, R> {
        private final Class<T> a;
        final Class<R> b;
        final rj9<T, R> c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, rj9<T, R> rj9Var) {
            this.a = cls;
            this.b = cls2;
            this.c = rj9Var;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b)) {
                return true;
            }
            return false;
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull rj9<T, R> rj9Var, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, rj9Var));
    }

    @NonNull
    public synchronized <T, R> List<rj9<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull rj9<T, R> rj9Var, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, rj9Var));
    }

    public synchronized void f(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.a);
            this.a.clear();
            for (String str : list) {
                this.a.add(str);
            }
            for (String str2 : arrayList) {
                if (!list.contains(str2)) {
                    this.a.add(str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

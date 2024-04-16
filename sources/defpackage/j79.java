package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ReadOnlyClassToSerializerMap.java */
/* renamed from: j79  reason: default package */
/* loaded from: classes2.dex */
public final class j79 {
    private final a[] a;
    private final int b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReadOnlyClassToSerializerMap.java */
    /* renamed from: j79$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final gc5<Object> a;
        public final a b;
        protected final Class<?> c;
        protected final y85 d;
        protected final boolean e;

        public a(a aVar, vnb vnbVar, gc5<Object> gc5Var) {
            this.b = aVar;
            this.a = gc5Var;
            this.e = vnbVar.c();
            this.c = vnbVar.a();
            this.d = vnbVar.b();
        }

        public boolean a(Class<?> cls) {
            if (this.c == cls && this.e) {
                return true;
            }
            return false;
        }

        public boolean b(y85 y85Var) {
            if (!this.e && y85Var.equals(this.d)) {
                return true;
            }
            return false;
        }

        public boolean c(Class<?> cls) {
            if (this.c == cls && !this.e) {
                return true;
            }
            return false;
        }
    }

    public j79(Map<vnb, gc5<Object>> map) {
        int a2 = a(map.size());
        this.b = a2;
        this.c = a2 - 1;
        a[] aVarArr = new a[a2];
        for (Map.Entry<vnb, gc5<Object>> entry : map.entrySet()) {
            vnb key = entry.getKey();
            int hashCode = key.hashCode() & this.c;
            aVarArr[hashCode] = new a(aVarArr[hashCode], key, entry.getValue());
        }
        this.a = aVarArr;
    }

    private static final int a(int i) {
        int i2;
        if (i <= 64) {
            i2 = i + i;
        } else {
            i2 = i + (i >> 2);
        }
        int i3 = 8;
        while (i3 < i2) {
            i3 += i3;
        }
        return i3;
    }

    public static j79 b(HashMap<vnb, gc5<Object>> hashMap) {
        return new j79(hashMap);
    }

    public gc5<Object> c(Class<?> cls) {
        a aVar = this.a[vnb.e(cls) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(cls)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(cls));
        return aVar.a;
    }

    public gc5<Object> d(y85 y85Var) {
        a aVar = this.a[vnb.f(y85Var) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(y85Var)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(y85Var));
        return aVar.a;
    }

    public gc5<Object> e(Class<?> cls) {
        a aVar = this.a[vnb.g(cls) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(cls)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(cls));
        return aVar.a;
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class a {
    public static int f = -1;
    int a;
    int b;
    String c;
    protected int d;
    HashMap<String, androidx.constraintlayout.widget.a> e;

    public a() {
        int i = f;
        this.a = i;
        this.b = i;
        this.c = null;
    }

    public abstract void a(HashMap<String, o0c> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract a clone();

    public a c(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(HashSet<String> hashSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(Context context, AttributeSet attributeSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(String str) {
        String str2 = this.c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public a h(int i) {
        this.b = i;
        return this;
    }

    public void g(HashMap<String, Integer> hashMap) {
    }
}

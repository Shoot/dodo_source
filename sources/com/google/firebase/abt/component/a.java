package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AbtComponent.java */
/* loaded from: classes2.dex */
public class a {
    private final Map<String, lv3> a = new HashMap();
    private final Context b;
    private final bs8<jc> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, bs8<jc> bs8Var) {
        this.b = context;
        this.c = bs8Var;
    }

    protected lv3 a(String str) {
        return new lv3(this.b, this.c, str);
    }

    public synchronized lv3 b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.get(str);
    }
}

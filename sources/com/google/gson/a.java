package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GsonBuilder.java */
/* loaded from: classes2.dex */
public final class a {
    private String h;
    private Excluder a = Excluder.g;
    private oy5 b = oy5.a;
    private ks3 c = js3.a;
    private final Map<Type, y45<?>> d = new HashMap();
    private final List<onb> e = new ArrayList();
    private final List<onb> f = new ArrayList();
    private boolean g = false;
    private int i = 2;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private shb q = rhb.a;
    private shb r = rhb.b;

    private void a(String str, int i, int i2, List<onb> list) {
        onb onbVar;
        onb onbVar2;
        boolean z = com.google.gson.internal.sql.a.a;
        onb onbVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            onbVar = DefaultDateTypeAdapter.b.b.b(str);
            if (z) {
                onbVar3 = com.google.gson.internal.sql.a.c.b(str);
                onbVar2 = com.google.gson.internal.sql.a.b.b(str);
            }
            onbVar2 = null;
        } else if (i != 2 && i2 != 2) {
            onb a = DefaultDateTypeAdapter.b.b.a(i, i2);
            if (z) {
                onbVar3 = com.google.gson.internal.sql.a.c.a(i, i2);
                onb a2 = com.google.gson.internal.sql.a.b.a(i, i2);
                onbVar = a;
                onbVar2 = a2;
            } else {
                onbVar = a;
                onbVar2 = null;
            }
        } else {
            return;
        }
        list.add(onbVar);
        if (z) {
            list.add(onbVar3);
            list.add(onbVar2);
        }
    }

    public Gson b() {
        List<onb> arrayList = new ArrayList<>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.h, this.i, this.j, arrayList);
        return new Gson(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.b, this.h, this.i, this.j, this.e, this.f, arrayList, this.q, this.r);
    }

    public a c(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof hc5;
        if (!z2 && !(obj instanceof oa5) && !(obj instanceof y45) && !(obj instanceof TypeAdapter)) {
            z = false;
        } else {
            z = true;
        }
        defpackage.a.a(z);
        if (obj instanceof y45) {
            this.d.put(type, (y45) obj);
        }
        if (z2 || (obj instanceof oa5)) {
            this.e.add(TreeTypeAdapter.b(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.e.add(TypeAdapters.a(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public a d(onb onbVar) {
        this.e.add(onbVar);
        return this;
    }

    public a e() {
        this.g = true;
        return this;
    }

    public a f(String str) {
        this.h = str;
        return this;
    }

    public a g(js3 js3Var) {
        this.c = js3Var;
        return this;
    }

    public a h(ks3 ks3Var) {
        this.c = ks3Var;
        return this;
    }

    public a i() {
        this.p = true;
        return this;
    }

    public a j() {
        this.n = true;
        return this;
    }
}

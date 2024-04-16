package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: WorkContinuationImpl.java */
/* renamed from: x6c  reason: default package */
/* loaded from: classes.dex */
public class x6c extends w6c {
    private static final String j = nx5.f("WorkContinuationImpl");
    private final j7c a;
    private final String b;
    private final ym3 c;
    private final List<? extends s7c> d;
    private final List<String> e;
    private final List<String> f;
    private final List<x6c> g;
    private boolean h;
    private ua7 i;

    public x6c(@NonNull j7c j7cVar, @NonNull List<? extends s7c> list) {
        this(j7cVar, null, ym3.KEEP, list, null);
    }

    private static boolean i(@NonNull x6c x6cVar, @NonNull Set<String> set) {
        set.addAll(x6cVar.c());
        Set<String> l = l(x6cVar);
        for (String str : set) {
            if (l.contains(str)) {
                return true;
            }
        }
        List<x6c> e = x6cVar.e();
        if (e != null && !e.isEmpty()) {
            for (x6c x6cVar2 : e) {
                if (i(x6cVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(x6cVar.c());
        return false;
    }

    @NonNull
    public static Set<String> l(x6c x6cVar) {
        HashSet hashSet = new HashSet();
        List<x6c> e = x6cVar.e();
        if (e != null && !e.isEmpty()) {
            for (x6c x6cVar2 : e) {
                hashSet.addAll(x6cVar2.c());
            }
        }
        return hashSet;
    }

    @Override // defpackage.w6c
    @NonNull
    public ua7 a() {
        if (!this.h) {
            ci3 ci3Var = new ci3(this);
            this.a.u().b(ci3Var);
            this.i = ci3Var.d();
        } else {
            nx5.c().h(j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.e)), new Throwable[0]);
        }
        return this.i;
    }

    public ym3 b() {
        return this.c;
    }

    @NonNull
    public List<String> c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List<x6c> e() {
        return this.g;
    }

    @NonNull
    public List<? extends s7c> f() {
        return this.d;
    }

    @NonNull
    public j7c g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public x6c(@NonNull j7c j7cVar, String str, @NonNull ym3 ym3Var, @NonNull List<? extends s7c> list) {
        this(j7cVar, str, ym3Var, list, null);
    }

    public x6c(@NonNull j7c j7cVar, String str, @NonNull ym3 ym3Var, @NonNull List<? extends s7c> list, List<x6c> list2) {
        this.a = j7cVar;
        this.b = str;
        this.c = ym3Var;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            for (x6c x6cVar : list2) {
                this.f.addAll(x6cVar.f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).a();
            this.e.add(a);
            this.f.add(a);
        }
    }
}

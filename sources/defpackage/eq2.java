package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import defpackage.rn4;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: DefaultHeartBeatController.java */
/* renamed from: eq2  reason: default package */
/* loaded from: classes2.dex */
public class eq2 implements qn4, rn4 {
    private final bs8<yn4> a;
    private final Context b;
    private final bs8<dub> c;
    private final Set<on4> d;
    private final Executor e;

    private eq2(final Context context, final String str, Set<on4> set, bs8<dub> bs8Var, Executor executor) {
        this(new bs8() { // from class: dq2
            @Override // defpackage.bs8
            public final Object get() {
                yn4 j;
                j = eq2.j(context, str);
                return j;
            }
        }, set, executor, bs8Var, context);
    }

    @NonNull
    public static bm1<eq2> g() {
        final su8 a = su8.a(d60.class, Executor.class);
        return bm1.f(eq2.class, qn4.class, rn4.class).b(d03.k(Context.class)).b(d03.k(qv3.class)).b(d03.n(on4.class)).b(d03.m(dub.class)).b(d03.j(a)).f(new rm1() { // from class: cq2
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                eq2 h;
                h = eq2.h(su8.this, im1Var);
                return h;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ eq2 h(su8 su8Var, im1 im1Var) {
        return new eq2((Context) im1Var.a(Context.class), ((qv3) im1Var.a(qv3.class)).o(), im1Var.c(on4.class), im1Var.g(dub.class), (Executor) im1Var.e(su8Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                yn4 yn4Var = this.a.get();
                List<zn4> c = yn4Var.c();
                yn4Var.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    zn4 zn4Var = c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", zn4Var.c());
                    jSONObject.put("dates", new JSONArray((Collection) zn4Var.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yn4 j(Context context, String str) {
        return new yn4(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.a.get().k(System.currentTimeMillis(), this.c.get().a());
        }
        return null;
    }

    @Override // defpackage.qn4
    public y6b<String> a() {
        if (!jub.a(this.b)) {
            return o7b.e("");
        }
        return o7b.c(this.e, new Callable() { // from class: bq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i;
                i = eq2.this.i();
                return i;
            }
        });
    }

    @Override // defpackage.rn4
    @NonNull
    public synchronized rn4.a b(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        yn4 yn4Var = this.a.get();
        if (yn4Var.i(currentTimeMillis)) {
            yn4Var.g();
            return rn4.a.GLOBAL;
        }
        return rn4.a.NONE;
    }

    public y6b<Void> l() {
        if (this.d.size() <= 0) {
            return o7b.e(null);
        }
        if (!jub.a(this.b)) {
            return o7b.e(null);
        }
        return o7b.c(this.e, new Callable() { // from class: aq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k;
                k = eq2.this.k();
                return k;
            }
        });
    }

    eq2(bs8<yn4> bs8Var, Set<on4> set, Executor executor, bs8<dub> bs8Var2, Context context) {
        this.a = bs8Var;
        this.d = set;
        this.e = executor;
        this.c = bs8Var2;
        this.b = context;
    }
}

package com.android.volley;

import com.android.volley.a;
/* loaded from: classes.dex */
public class Response<T> {
    public final T a;
    public final a.C0093a b;
    public final VolleyError c;
    public boolean d;

    /* loaded from: classes.dex */
    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    /* loaded from: classes.dex */
    public interface Listener<T> {
        void onResponse(T t);
    }

    private Response(T t, a.C0093a c0093a) {
        this.d = false;
        this.a = t;
        this.b = c0093a;
        this.c = null;
    }

    public static <T> Response<T> a(VolleyError volleyError) {
        return new Response<>(volleyError);
    }

    public static <T> Response<T> c(T t, a.C0093a c0093a) {
        return new Response<>(t, c0093a);
    }

    public boolean b() {
        if (this.c == null) {
            return true;
        }
        return false;
    }

    private Response(VolleyError volleyError) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = volleyError;
    }
}

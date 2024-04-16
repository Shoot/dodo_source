package defpackage;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
/* compiled from: ResponseDelivery.java */
/* renamed from: lk9  reason: default package */
/* loaded from: classes.dex */
public interface lk9 {
    void a(Request<?> request, Response<?> response);

    void b(Request<?> request, Response<?> response, Runnable runnable);

    void c(Request<?> request, VolleyError volleyError);
}

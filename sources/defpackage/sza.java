package defpackage;

import com.android.volley.Request;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
/* compiled from: StringRequest.java */
/* renamed from: sza  reason: default package */
/* loaded from: classes.dex */
public class sza extends Request<String> {
    private final Object a;
    private Response.Listener<String> b;

    public sza(int i, String str, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.a = new Object();
        this.b = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* renamed from: a */
    public void deliverResponse(String str) {
        Response.Listener<String> listener;
        synchronized (this.a) {
            listener = this.b;
        }
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.a) {
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public Response<String> parseNetworkResponse(iw6 iw6Var) {
        String str;
        try {
            str = new String(iw6Var.b, kq4.f(iw6Var.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(iw6Var.b);
        }
        return Response.c(str, kq4.e(iw6Var));
    }
}

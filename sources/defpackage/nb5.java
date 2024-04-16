package defpackage;

import com.android.volley.ParseError;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: JsonObjectRequest.java */
/* renamed from: nb5  reason: default package */
/* loaded from: classes.dex */
public class nb5 extends ac5<JSONObject> {
    public nb5(String str, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ac5, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(iw6 iw6Var) {
        try {
            return Response.c(new JSONObject(new String(iw6Var.b, kq4.g(iw6Var.c, "utf-8"))), kq4.e(iw6Var));
        } catch (UnsupportedEncodingException e) {
            return Response.a(new ParseError(e));
        } catch (JSONException e2) {
            return Response.a(new ParseError(e2));
        }
    }

    @Deprecated
    public nb5(String str, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    public nb5(int i, String str, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }
}

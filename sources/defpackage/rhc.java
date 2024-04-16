package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;
/* renamed from: rhc  reason: default package */
/* loaded from: classes3.dex */
public class rhc extends AsyncTask<Context, Integer, Boolean> {
    private static final String a = "rhc";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = lc0.m(contextArr[0]);
        } catch (Exception e) {
            String str = a;
            xhc.d(str, "doInBackground: exception : " + e.getMessage());
            inputStream = null;
        }
        String str2 = a;
        xhc.b(str2, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        if (inputStream != null) {
            vhc.b(inputStream);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            xhc.e(a, "onPostExecute: upate done");
        } else {
            xhc.d(a, "onPostExecute: upate failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onProgressUpdate(Integer... numArr) {
        xhc.e(a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        xhc.b(a, "onPreExecute");
    }
}

package com.github.hiteshsondhi88.libffmpeg;

import android.os.AsyncTask;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FFmpegExecuteAsyncTask.java */
/* loaded from: classes2.dex */
public class e extends AsyncTask<Void, String, a> {
    private final String[] a;
    private final f b;
    private final long d;
    private long e;
    private Process f;
    private String g = "";
    private final l c = new l();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String[] strArr, long j, f fVar) {
        this.a = strArr;
        this.d = j;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0000, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.util.concurrent.TimeoutException, java.lang.InterruptedException {
        /*
            r6 = this;
        L0:
            java.lang.Process r0 = r6.f
            boolean r0 = com.github.hiteshsondhi88.libffmpeg.m.f(r0)
            if (r0 != 0) goto L74
            java.lang.Process r0 = r6.f
            boolean r0 = com.github.hiteshsondhi88.libffmpeg.m.f(r0)
            if (r0 == 0) goto L11
            return
        L11:
            long r0 = r6.d
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.e
            long r4 = r6.d
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2a
            goto L32
        L2a:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r1 = "FFmpeg timed out"
            r0.<init>(r1)
            throw r0
        L32:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L6f
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L6f
            java.lang.Process r2 = r6.f     // Catch: java.io.IOException -> L6f
            java.io.InputStream r2 = r2.getErrorStream()     // Catch: java.io.IOException -> L6f
            r1.<init>(r2)     // Catch: java.io.IOException -> L6f
            r0.<init>(r1)     // Catch: java.io.IOException -> L6f
        L42:
            java.lang.String r1 = r0.readLine()     // Catch: java.io.IOException -> L6f
            if (r1 == 0) goto L0
            boolean r2 = r6.isCancelled()     // Catch: java.io.IOException -> L6f
            if (r2 == 0) goto L4f
            return
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6f
            r2.<init>()     // Catch: java.io.IOException -> L6f
            java.lang.String r3 = r6.g     // Catch: java.io.IOException -> L6f
            r2.append(r3)     // Catch: java.io.IOException -> L6f
            r2.append(r1)     // Catch: java.io.IOException -> L6f
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch: java.io.IOException -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L6f
            r6.g = r2     // Catch: java.io.IOException -> L6f
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.io.IOException -> L6f
            r6.publishProgress(r1)     // Catch: java.io.IOException -> L6f
            goto L42
        L6f:
            r0 = move-exception
            r0.printStackTrace()
            goto L0
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.hiteshsondhi88.libffmpeg.e.a():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public a doInBackground(Void... voidArr) {
        a b;
        try {
            try {
                Process a = this.c.a(this.a);
                this.f = a;
                if (a == null) {
                    b = a.a();
                } else {
                    j.a("Running publishing updates method");
                    a();
                    b = a.b(this.f);
                }
                m.d(this.f);
                return b;
            } catch (TimeoutException e) {
                j.b("FFmpeg timed out", e);
                a aVar = new a(false, e.getMessage());
                m.d(this.f);
                return aVar;
            } catch (Exception e2) {
                j.b("Error running FFmpeg", e2);
                m.d(this.f);
                return a.a();
            }
        } catch (Throwable th) {
            m.d(this.f);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return m.f(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onPostExecute(a aVar) {
        if (this.b != null) {
            String str = this.g + aVar.a;
            this.g = str;
            if (aVar.b) {
                this.b.onSuccess(str);
            } else {
                this.b.onFailure(str);
            }
            this.b.onFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: e */
    public void onProgressUpdate(String... strArr) {
        String str;
        f fVar;
        if (strArr != null && (str = strArr[0]) != null && (fVar = this.b) != null) {
            fVar.onProgress(str);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        this.e = System.currentTimeMillis();
        f fVar = this.b;
        if (fVar != null) {
            fVar.onStart();
        }
    }
}

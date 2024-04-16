package com.github.hiteshsondhi88.libffmpeg;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FFmpegLoadLibraryAsyncTask.java */
/* loaded from: classes2.dex */
public class h extends AsyncTask<Void, Void, Boolean> {
    private final String a;
    private final g b;
    private final Context c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, String str, g gVar) {
        this.c = context;
        this.a = str;
        this.b = gVar;
    }

    private boolean b() {
        return b.a(i.b(i.d(this.c))).equals(b.NONE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(Void... voidArr) {
        File file = new File(i.d(this.c));
        if (file.exists() && b() && !file.delete()) {
            return Boolean.FALSE;
        }
        boolean z = true;
        if (!file.exists()) {
            Context context = this.c;
            if (i.c(context, this.a + File.separator + "ffmpeg", "ffmpeg")) {
                if (!file.canExecute()) {
                    j.a("FFmpeg is not executable, trying to make it executable ...");
                    if (file.setExecutable(true)) {
                        return Boolean.TRUE;
                    }
                } else {
                    j.a("FFmpeg is executable");
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.valueOf((file.exists() && file.canExecute()) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (this.b != null) {
            if (bool.booleanValue()) {
                this.b.onSuccess();
            } else {
                this.b.onFailure();
            }
            this.b.onFinish();
        }
    }
}

package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
public final class z {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final Executor e;
    final ArrayDeque<String> d = new ArrayDeque<>();
    private boolean f = false;

    private z(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    private boolean b(boolean z) {
        if (z && !this.f) {
            i();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        z zVar = new z(sharedPreferences, str, str2, executor);
        zVar.d();
        return zVar;
    }

    private void d() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] split = string.split(this.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, g()).commit();
        }
    }

    private void i() {
        this.e.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                z.this.h();
            }
        });
    }

    public String e() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b;
        synchronized (this.d) {
            b = b(this.d.remove(obj));
        }
        return b;
    }

    @NonNull
    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}

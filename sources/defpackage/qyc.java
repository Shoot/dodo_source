package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: qyc  reason: default package */
/* loaded from: classes2.dex */
public final class qyc implements uyc {
    private static final Map<Uri, qyc> h = new lr();
    private static final String[] i = {Action.KEY_ATTRIBUTE, "value"};
    private final ContentResolver a;
    private final Uri b;
    private final Runnable c;
    private final ContentObserver d;
    private final Object e;
    private volatile Map<String, String> f;
    private final List<ryc> g;

    private qyc(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        tyc tycVar = new tyc(this, null);
        this.d = tycVar;
        this.e = new Object();
        this.g = new ArrayList();
        hh8.i(contentResolver);
        hh8.i(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, tycVar);
    }

    public static qyc b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        qyc qycVar;
        synchronized (qyc.class) {
            Map<Uri, qyc> map = h;
            qycVar = map.get(uri);
            if (qycVar == null) {
                try {
                    qyc qycVar2 = new qyc(contentResolver, uri, runnable);
                    try {
                        map.put(uri, qycVar2);
                    } catch (SecurityException unused) {
                    }
                    qycVar = qycVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return qycVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (qyc.class) {
            try {
                for (qyc qycVar : h.values()) {
                    qycVar.a.unregisterContentObserver(qycVar.d);
                }
                h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map<String, String> f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) yyc.a(new xyc() { // from class: pyc
                    @Override // defpackage.xyc
                    public final Object zza() {
                        return qyc.this.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.f;
        if (map == null) {
            synchronized (this.e) {
                try {
                    map = this.f;
                    if (map == null) {
                        map = f();
                        this.f = map;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Map hashMap;
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new lr(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                for (ryc rycVar : this.g) {
                    rycVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uyc
    public final /* synthetic */ Object k(String str) {
        return a().get(str);
    }
}

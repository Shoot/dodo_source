package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import defpackage.rx3;
import java.util.Date;
/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes2.dex */
public class e {
    static final Date e = new Date(-1);
    static final Date f = new Date(-1);
    private final SharedPreferences a;
    private final Object b = new Object();
    private final Object c = new Object();
    private final Object d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes2.dex */
    public static class a {
        private int a;
        private Date b;

        a(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.a;
        }
    }

    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes2.dex */
    public static class b {
        private int a;
        private Date b;

        public b(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.a;
        }
    }

    public e(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public px3 c() {
        i a2;
        synchronized (this.b) {
            long j = this.a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.a.getInt("last_fetch_status", 0);
            a2 = i.b().c(i).d(j).b(new rx3.b().d(this.a.getLong("fetch_timeout_in_seconds", 60L)).e(this.a.getLong("minimum_fetch_interval_in_seconds", d.j)).c()).a();
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", d.j);
    }

    public b h() {
        b bVar;
        synchronized (this.d) {
            bVar = new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        k(0, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        o(0, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void l(rx3 rx3Var) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", rx3Var.a()).putLong("minimum_fetch_interval_in_seconds", rx3Var.b()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(long j) {
        synchronized (this.b) {
            this.a.edit().putLong("last_template_version", j).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: BackupPrefsDataSource.java */
/* renamed from: i60  reason: default package */
/* loaded from: classes3.dex */
public class i60 implements u13 {
    private final Context a;
    private final SharedPreferences b;

    public i60(Context context) {
        this.a = context;
        this.b = context.getSharedPreferences("backup_prefs", 0);
    }

    private void c() {
        new BackupManager(this.a).dataChanged();
    }

    @Override // defpackage.u13
    public String a() {
        return this.b.getString("app_token", "");
    }

    @Override // defpackage.u13
    public void b(String str) {
        this.b.edit().putString("app_token", str).commit();
        c();
    }
}

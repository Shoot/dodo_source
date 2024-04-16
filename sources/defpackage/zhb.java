package defpackage;

import android.content.SharedPreferences;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ToggleService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lzhb;", "Lyhb;", "Lbq3;", "featureCode", "Lwhb;", "a", "", "isEnabled", "", "b", c.a, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zhb  reason: default package */
/* loaded from: classes4.dex */
public final class zhb implements yhb {
    private final SharedPreferences a;

    public zhb(SharedPreferences sharedPreferences) {
        z65.h(sharedPreferences, "preferences");
        this.a = sharedPreferences;
    }

    @Override // defpackage.yhb
    public whb a(bq3 bq3Var) {
        z65.h(bq3Var, "featureCode");
        SharedPreferences sharedPreferences = this.a;
        if (!sharedPreferences.contains(bq3Var.getValue())) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return null;
        }
        return new whb(bq3Var.getValue(), sharedPreferences.getBoolean(bq3Var.getValue(), false));
    }

    @Override // defpackage.yhb
    public void b(bq3 bq3Var, boolean z) {
        z65.h(bq3Var, "featureCode");
        SharedPreferences.Editor edit = this.a.edit();
        z65.g(edit, "editor");
        edit.putBoolean(bq3Var.getValue(), z);
        edit.apply();
    }

    @Override // defpackage.yhb
    public void c() {
        this.a.edit().clear().apply();
    }
}

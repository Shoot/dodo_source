package defpackage;

import android.content.SharedPreferences;
import kotlin.Metadata;
/* compiled from: KustoRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lki5;", "Lji5;", "", "a", "id", "", "b", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Ljava/lang/String;", "DEVICE_ID", "<init>", "(Landroid/content/SharedPreferences;)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ki5  reason: default package */
/* loaded from: classes.dex */
public final class ki5 implements ji5 {
    private final SharedPreferences a;
    private final String b;

    public ki5(SharedPreferences sharedPreferences) {
        z65.h(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = "device_id";
    }

    @Override // defpackage.ji5
    public String a() {
        String string = this.a.getString(this.b, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // defpackage.ji5
    public void b(String str) {
        z65.h(str, "id");
        this.a.edit().putString(this.b, str).apply();
    }
}

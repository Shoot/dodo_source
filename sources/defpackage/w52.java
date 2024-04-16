package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CustomerSettingsService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lw52;", "Lv52;", "", "settingCode", "", "b", "settingsCode", "enable", "", c.a, "", "a", "currentCount", DateTokenConverter.CONVERTER_KEY, "Lci8;", "Lci8;", "prefs", "<init>", "(Lci8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w52  reason: default package */
/* loaded from: classes4.dex */
public final class w52 implements v52 {
    private final ci8 a;

    public w52(ci8 ci8Var) {
        z65.h(ci8Var, "prefs");
        this.a = ci8Var;
    }

    @Override // defpackage.v52
    public int a(String str) {
        z65.h(str, "settingsCode");
        return ((Number) mh5.c(this.a.n(str), 0)).intValue();
    }

    @Override // defpackage.v52
    public boolean b(String str) {
        z65.h(str, "settingCode");
        return this.a.N(str);
    }

    @Override // defpackage.v52
    public void c(String str, boolean z) {
        z65.h(str, "settingsCode");
        this.a.M(str, z);
    }

    @Override // defpackage.v52
    public void d(String str, int i) {
        z65.h(str, "settingsCode");
        this.a.K(str, i);
    }
}

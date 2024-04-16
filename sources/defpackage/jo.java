package defpackage;

import android.content.res.Configuration;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AppResourceLocalesFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljo;", "", "Landroid/content/res/Configuration;", "configuration", "", "onConfigurationChanged", "Lkua;", "Ljava/util/Locale;", "a", "()Lkua;", "currentLocaleFlow", "", c.a, "userLocalesFlow", "b", "()Ljava/util/List;", "appLocales", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jo  reason: default package */
/* loaded from: classes4.dex */
public interface jo {
    kua<Locale> a();

    List<Locale> b();

    kua<List<Locale>> c();

    void onConfigurationChanged(Configuration configuration);
}

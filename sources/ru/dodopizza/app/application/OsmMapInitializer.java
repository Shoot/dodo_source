package ru.dodopizza.app.application;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.BaseInitializer;
import defpackage.uxa;
import java.io.File;
import kotlin.Metadata;
/* compiled from: OsmMapInitializer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lru/dodopizza/app/application/OsmMapInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OsmMapInitializer extends BaseInitializer {
    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        wta.a.d(fxa.d);
        try {
            uxa.a aVar = new uxa.a(context.getCacheDir().getAbsolutePath(), true, false, 0);
            String str = File.separator;
            String str2 = aVar.a;
            File file = new File(str2 + str + "osmdroid" + str + ("tiles" + str));
            file.mkdirs();
            dq1.a().C(file);
            File file2 = new File(aVar.a + str + "osmdroid" + str);
            file2.mkdirs();
            dq1.a().j(file2);
        } catch (Throwable unused) {
        }
    }
}

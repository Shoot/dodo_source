package defpackage;

import android.content.res.Resources;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: DodoResources.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J%\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ld63;", "Lc63;", "", "resourceName", "Ljava/io/InputStream;", "b", "", "id", "getString", "T", "Ljava/lang/reflect/Type;", MessageAttributes.TYPE, "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "resources", "Ljava/lang/String;", "packageName", "Lcom/google/gson/Gson;", c.a, "Lcom/google/gson/Gson;", "jsonConverter", "<init>", "(Landroid/content/res/Resources;Ljava/lang/String;Lcom/google/gson/Gson;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d63  reason: default package */
/* loaded from: classes4.dex */
public final class d63 implements c63 {
    private final Resources a;
    private final String b;
    private final Gson c;

    public d63(Resources resources, String str, Gson gson) {
        z65.h(resources, "resources");
        z65.h(str, "packageName");
        z65.h(gson, "jsonConverter");
        this.a = resources;
        this.b = str;
        this.c = gson;
    }

    private final InputStream b(String str) {
        Resources resources = this.a;
        InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_RAW, this.b));
        z65.g(openRawResource, "openRawResource(...)");
        return openRawResource;
    }

    @Override // defpackage.c63
    public <T> T a(String str, Type type) {
        z65.h(str, "resourceName");
        z65.h(type, MessageAttributes.TYPE);
        return (T) this.c.j(new InputStreamReader(b(str), rw0.b), type);
    }

    @Override // defpackage.c63
    public String getString(int i) {
        String string = this.a.getString(i);
        z65.g(string, "getString(...)");
        return string;
    }
}

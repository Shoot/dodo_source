package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import kotlin.Metadata;
/* compiled from: CompressFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lxo1;", "Lwo1;", "Ljava/io/File;", "imageToCompress", "Luo1;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzo1;", "b", "Lzo1;", "compressor", "<init>", "(Landroid/content/Context;Lzo1;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xo1  reason: default package */
/* loaded from: classes4.dex */
public final class xo1 implements wo1 {
    private final Context a;
    private final zo1 b;

    public xo1(Context context, zo1 zo1Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(zo1Var, "compressor");
        this.a = context;
        this.b = zo1Var;
    }

    @Override // defpackage.wo1
    public uo1 a(File file) {
        z65.h(file, "imageToCompress");
        return new uo1(this.b, file, bp1.d(this.a));
    }
}

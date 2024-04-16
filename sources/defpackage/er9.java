package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.z2b;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
/* compiled from: SQLiteCopyOpenHelperFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ler9;", "Lz2b$c;", "Lz2b$b;", "configuration", "Lz2b;", "a", "", "Ljava/lang/String;", "mCopyFromAssetPath", "Ljava/io/File;", "b", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", c.a, "Ljava/util/concurrent/Callable;", "mCopyFromInputStream", DateTokenConverter.CONVERTER_KEY, "Lz2b$c;", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lz2b$c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: er9  reason: default package */
/* loaded from: classes.dex */
public final class er9 implements z2b.c {
    private final String a;
    private final File b;
    private final Callable<InputStream> c;
    private final z2b.c d;

    public er9(String str, File file, Callable<InputStream> callable, z2b.c cVar) {
        z65.h(cVar, "mDelegate");
        this.a = str;
        this.b = file;
        this.c = callable;
        this.d = cVar;
    }

    @Override // defpackage.z2b.c
    public z2b a(z2b.b bVar) {
        z65.h(bVar, "configuration");
        return new dr9(bVar.a, this.a, this.b, this.c, bVar.c.a, this.d.a(bVar));
    }
}

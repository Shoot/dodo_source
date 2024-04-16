package defpackage;

import defpackage.zo1;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lap1;", "Lzo1;", "", "destinationPath", "", "b", "Lzo1$a;", "params", "Ljava/io/File;", "a", "Lvo1;", "Lvo1;", "compressEngine", "<init>", "(Lvo1;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ap1  reason: default package */
/* loaded from: classes4.dex */
public final class ap1 implements zo1 {
    private final vo1 a;

    public ap1(vo1 vo1Var) {
        z65.h(vo1Var, "compressEngine");
        this.a = vo1Var;
    }

    private final void b(String str) {
        File parentFile = new File(str).getParentFile();
        if (parentFile.exists()) {
            parentFile = null;
        }
        if (parentFile != null) {
            parentFile.mkdirs();
        }
    }

    @Override // defpackage.zo1
    public File a(zo1.a aVar) {
        z65.h(aVar, "params");
        String f = aVar.f();
        b(f);
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        try {
            this.a.a(aVar, fileOutputStream);
            Unit unit = Unit.a;
            aa1.a(fileOutputStream, null);
            return new File(f);
        } finally {
        }
    }
}

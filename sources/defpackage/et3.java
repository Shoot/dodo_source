package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: FileContentWriter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Let3;", "Ldt3;", "Lbt3;", "fileContent", "Ljava/io/OutputStream;", "outputStream", "Lkotlin/Function2;", "", "", "writeProgressListener", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: et3  reason: default package */
/* loaded from: classes4.dex */
public final class et3 implements dt3 {
    @Override // defpackage.dt3
    public void a(bt3 bt3Var, OutputStream outputStream, Function2<? super Long, ? super Long, Unit> function2) {
        int read;
        z65.h(bt3Var, "fileContent");
        z65.h(outputStream, "outputStream");
        long a = bt3Var.a();
        File c = bt3Var.c();
        long d = bt3Var.d();
        FileInputStream fileInputStream = new FileInputStream(c);
        if (d > 0) {
            try {
                fileInputStream.skip(d);
            } finally {
            }
        }
        byte[] bArr = new byte[2048];
        if (a < 0) {
            while (true) {
                int read2 = fileInputStream.read(bArr);
                if (read2 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read2);
            }
        } else {
            long min = Math.min(2048L, a);
            long j = a;
            while (j > 0 && (read = fileInputStream.read(bArr, 0, (int) min)) != -1) {
                outputStream.write(bArr, 0, read);
                j -= read;
                if (function2 != null) {
                    function2.invoke(Long.valueOf(a - j), Long.valueOf(a));
                }
            }
        }
        Unit unit = Unit.a;
        aa1.a(fileInputStream, null);
    }
}

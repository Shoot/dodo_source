package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileReadWrite.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Ljava/io/File;", "", "array", "", c.a, "Ljava/nio/charset/Charset;", "charset", "", "a", "text", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/io/FilesKt")
/* renamed from: ru3  reason: default package */
/* loaded from: classes3.dex */
public class ru3 extends qu3 {
    public static final String a(File file, Charset charset) {
        z65.h(file, "<this>");
        z65.h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String f = pcb.f(inputStreamReader);
            aa1.a(inputStreamReader, null);
            return f;
        } finally {
        }
    }

    public static /* synthetic */ String b(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = rw0.b;
        }
        return a(file, charset);
    }

    public static final void c(File file, byte[] bArr) {
        z65.h(file, "<this>");
        z65.h(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            Unit unit = Unit.a;
            aa1.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void d(File file, String str, Charset charset) {
        z65.h(file, "<this>");
        z65.h(str, "text");
        z65.h(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        z65.g(bytes, "getBytes(...)");
        c(file, bytes);
    }

    public static /* synthetic */ void e(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = rw0.b;
        }
        d(file, str, charset);
    }
}

package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "", Image.TYPE_HIGH, "", "i", "(Ljava/io/File;)Ljava/lang/String;", "extension", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/io/FilesKt")
/* renamed from: tu3  reason: default package */
/* loaded from: classes3.dex */
public class tu3 extends su3 {
    public static boolean h(File file) {
        z65.h(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : su3.g(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String i(File file) {
        String L0;
        z65.h(file, "<this>");
        String name = file.getName();
        z65.g(name, "getName(...)");
        L0 = m0b.L0(name, CoreConstants.DOT, "");
        return L0;
    }
}

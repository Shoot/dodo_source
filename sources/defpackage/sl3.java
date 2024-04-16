package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import kotlin.Metadata;
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0006"}, d2 = {"Ljava/io/File;", Action.FILE_ATTRIBUTE, "other", "", "reason", "b", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: sl3  reason: default package */
/* loaded from: classes3.dex */
public final class sl3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}

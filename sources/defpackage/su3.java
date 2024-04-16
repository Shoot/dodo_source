package defpackage;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FileWalkDirection;
/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lju3;", "f", "g", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/io/FilesKt")
/* renamed from: su3  reason: default package */
/* loaded from: classes3.dex */
class su3 extends ru3 {
    public static final ju3 f(File file, FileWalkDirection fileWalkDirection) {
        z65.h(file, "<this>");
        z65.h(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        return new ju3(file, fileWalkDirection);
    }

    public static final ju3 g(File file) {
        z65.h(file, "<this>");
        return f(file, FileWalkDirection.b);
    }
}

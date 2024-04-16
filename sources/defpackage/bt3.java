package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.File;
import kotlin.Metadata;
/* compiled from: FileContent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0003\u0010\f¨\u0006\u0015"}, d2 = {"Lbt3;", "", "Ljava/io/File;", "a", "Ljava/io/File;", c.a, "()Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "b", "J", DateTokenConverter.CONVERTER_KEY, "()J", "offset", "", "Ljava/lang/String;", "()Ljava/lang/String;", "contentType", "contentLength", "<init>", "(Ljava/io/File;J)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bt3  reason: default package */
/* loaded from: classes4.dex */
public final class bt3 {
    private final File a;
    private final long b;
    private final String c;
    private final long d;

    public bt3(File file, long j) {
        z65.h(file, Action.FILE_ATTRIBUTE);
        this.a = file;
        this.b = j;
        this.c = "application/octet-stream";
        this.d = file.length() - j;
    }

    public final long a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final File c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }
}

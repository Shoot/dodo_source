package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.File;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: RatingPhotoService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u0010"}, d2 = {"Lk69;", "", "", "orderId", "", "Lh69;", DateTokenConverter.CONVERTER_KEY, "Ljava/io/File;", "photo", "Ltrb;", "progressListener", "", "b", "photoFilePath", "a", c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k69  reason: default package */
/* loaded from: classes.dex */
public interface k69 {
    void a(String str, String str2, trb trbVar);

    void b(String str, File file, trb trbVar);

    void c(String str, String str2);

    Collection<h69> d(String str);
}

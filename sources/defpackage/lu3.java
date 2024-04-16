package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import java.io.File;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.infrastracture.uploader.exception.FileUploadException;
import ru.dodopizza.backend.domain.upload.UploadAPI;
import ru.dodopizza.backend.domain.upload.dto.UploadDto;
/* compiled from: FileUploader.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Llu3;", "Lku3;", "", "uploadId", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ltrb;", "progressListener", "a", "createUploadId", "Lru/dodopizza/backend/domain/upload/UploadAPI;", "Lru/dodopizza/backend/domain/upload/UploadAPI;", "uploadAPI", "Ldt3;", "b", "Ldt3;", "fileContentWriter", "Lorg/slf4j/Logger;", c.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/backend/domain/upload/UploadAPI;Ldt3;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lu3  reason: default package */
/* loaded from: classes4.dex */
public final class lu3 implements ku3 {
    private final UploadAPI a;
    private final dt3 b;
    private final Logger c;

    public lu3(UploadAPI uploadAPI, dt3 dt3Var) {
        z65.h(uploadAPI, "uploadAPI");
        z65.h(dt3Var, "fileContentWriter");
        this.a = uploadAPI;
        this.b = dt3Var;
        Logger logger = LoggerFactory.getLogger("FileUploaderLogger");
        z65.g(logger, "getLogger(...)");
        this.c = logger;
    }

    @Override // defpackage.ku3
    public String a(String str, File file, trb trbVar) {
        z65.h(str, "uploadId");
        z65.h(file, Action.FILE_ATTRIBUTE);
        long size = this.a.getUploadSize(str).getSize();
        long j = 0;
        if (size > 0) {
            j = size - 1;
        }
        try {
            this.a.uploadImage(str, new ct3(new bt3(file, j), this.b, urb.a.a(str, trbVar)));
            Logger logger = this.c;
            logger.debug("Upload successfully completed [id = " + str + "]");
            return str;
        } catch (Exception e) {
            Logger logger2 = this.c;
            logger2.warn("An error occurred during upload [id = " + str + "]", (Throwable) e);
            throw new FileUploadException(str);
        }
    }

    @Override // defpackage.ku3
    public String createUploadId() {
        UploadDto createUploadId = this.a.createUploadId();
        Logger logger = this.c;
        String id = createUploadId.getId();
        logger.debug("Created new upload with id = " + id);
        return createUploadId.getId();
    }
}

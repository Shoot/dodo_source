package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.FileSize;
import java.io.File;
/* loaded from: classes.dex */
public class SizeBasedTriggeringPolicy<E> extends TriggeringPolicyBase<E> {
    public static final long DEFAULT_MAX_FILE_SIZE = 10485760;
    public static final String SEE_SIZE_FORMAT = "http://logback.qos.ch/codes.html#sbtp_size_format";
    FileSize maxFileSize = new FileSize(10485760);

    public FileSize getMaxFileSize() {
        return this.maxFileSize;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        if (file.length() >= this.maxFileSize.getSize()) {
            return true;
        }
        return false;
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }
}

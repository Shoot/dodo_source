package ch.qos.logback.classic.spi;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ClassPackagingData implements Serializable {
    private static final long serialVersionUID = -804643281218337001L;
    final String codeLocation;
    private final boolean exact;
    final String version;

    public ClassPackagingData(String str, String str2) {
        this.codeLocation = str;
        this.version = str2;
        this.exact = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassPackagingData classPackagingData = (ClassPackagingData) obj;
        String str = this.codeLocation;
        if (str == null) {
            if (classPackagingData.codeLocation != null) {
                return false;
            }
        } else if (!str.equals(classPackagingData.codeLocation)) {
            return false;
        }
        if (this.exact != classPackagingData.exact) {
            return false;
        }
        String str2 = this.version;
        String str3 = classPackagingData.version;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public String getCodeLocation() {
        return this.codeLocation;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        String str = this.codeLocation;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public boolean isExact() {
        return this.exact;
    }

    public ClassPackagingData(String str, String str2, boolean z) {
        this.codeLocation = str;
        this.version = str2;
        this.exact = z;
    }
}
